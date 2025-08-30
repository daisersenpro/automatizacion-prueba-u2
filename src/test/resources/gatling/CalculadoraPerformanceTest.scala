package com.automatizacion.performance

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

/**
 * Pruebas de Performance para la Calculadora
 * Simula carga de usuarios realizando operaciones matemáticas
 */
class CalculadoraPerformanceTest extends Simulation {

  // Configuración del protocolo HTTP
  val httpProtocol = http
    .baseUrl("http://localhost:8080") // URL base de la aplicación
    .acceptHeader("application/json")
    .userAgentHeader("Gatling Performance Test")

  // Headers comunes
  val headers = Map(
    "Content-Type" -> "application/json",
    "Accept" -> "application/json"
  )

  // Escenario: Operaciones de suma
  val sumaScenario = scenario("Operaciones de Suma")
    .exec(http("Suma de números positivos")
      .post("/api/calculadora/sumar")
      .headers(headers)
      .body(StringBody("""{"a": 5, "b": 3}"""))
      .check(status.is(200))
      .check(jsonPath("$.resultado").is("8"))
    )
    .pause(1)
    .exec(http("Suma con números negativos")
      .post("/api/calculadora/sumar")
      .headers(headers)
      .body(StringBody("""{"a": 10, "b": -3}"""))
      .check(status.is(200))
      .check(jsonPath("$.resultado").is("7"))
    )

  // Escenario: Operaciones de resta
  val restaScenario = scenario("Operaciones de Resta")
    .exec(http("Resta de números positivos")
      .post("/api/calculadora/restar")
      .headers(headers)
      .body(StringBody("""{"a": 10, "b": 3}"""))
      .check(status.is(200))
      .check(jsonPath("$.resultado").is("7"))
    )
    .pause(1)
    .exec(http("Resta con resultado negativo")
      .post("/api/calculadora/restar")
      .headers(headers)
      .body(StringBody("""{"a": 3, "b": 10}"""))
      .check(status.is(200))
      .check(jsonPath("$.resultado").is("-7"))
    )

  // Escenario: Operaciones de multiplicación
  val multiplicacionScenario = scenario("Operaciones de Multiplicación")
    .exec(http("Multiplicación de números positivos")
      .post("/api/calculadora/multiplicar")
      .headers(headers)
      .body(StringBody("""{"a": 6, "b": 7}"""))
      .check(status.is(200))
      .check(jsonPath("$.resultado").is("42"))
    )
    .pause(1)
    .exec(http("Multiplicación por cero")
      .post("/api/calculadora/multiplicar")
      .headers(headers)
      .body(StringBody("""{"a": 15, "b": 0}"""))
      .check(status.is(200))
      .check(jsonPath("$.resultado").is("0"))
    )

  // Escenario: Operaciones de división
  val divisionScenario = scenario("Operaciones de División")
    .exec(http("División de números positivos")
      .post("/api/calculadora/dividir")
      .headers(headers)
      .body(StringBody("""{"a": 10, "b": 2}"""))
      .check(status.is(200))
      .check(jsonPath("$.resultado").is("5.0"))
    )
    .pause(1)
    .exec(http("División por cero - Error esperado")
      .post("/api/calculadora/dividir")
      .headers(headers)
      .body(StringBody("""{"a": 10, "b": 0}"""))
      .check(status.is(400))
      .check(jsonPath("$.error").is("No se puede dividir por cero"))
    )

  // Configuración de la carga
  setUp(
    // Prueba de carga normal
    sumaScenario.inject(
      rampUsers(10).during(30.seconds),
      constantUsersPerSec(5).during(60.seconds)
    ),
    
    // Prueba de carga de resta
    restaScenario.inject(
      rampUsers(5).during(20.seconds),
      constantUsersPerSec(3).during(40.seconds)
    ),
    
    // Prueba de carga de multiplicación
    multiplicacionScenario.inject(
      rampUsers(8).during(25.seconds),
      constantUsersPerSec(4).during(50.seconds)
    ),
    
    // Prueba de carga de división
    divisionScenario.inject(
      rampUsers(6).during(20.seconds),
      constantUsersPerSec(2).during(30.seconds)
    )
  ).protocols(httpProtocol)
   .assertions(
     // Aserciones de performance
     global.responseTime.mean.lt(200), // Latencia promedio < 200ms
     global.responseTime.percentile(95).lt(500), // 95% de requests < 500ms
     global.failedRequests.percent.lt(1), // Tasa de error < 1%
     global.requestsPerSec.gt(10) // Mínimo 10 requests por segundo
   )

  // Configuración adicional para monitoreo
  val monitoringScenario = scenario("Monitoreo de Salud")
    .exec(http("Health Check")
      .get("/actuator/health")
      .check(status.is(200))
    )
    .exec(http("Metrics")
      .get("/actuator/metrics")
      .check(status.is(200))
    )

  // Escenario de monitoreo continuo
  setUp(
    monitoringScenario.inject(
      constantUsersPerSec(1).during(300.seconds) // 1 request cada segundo por 5 minutos
    )
  ).protocols(httpProtocol)
}
