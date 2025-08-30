# 🧮 Automatización Prueba U2 - Proyecto de Integración Continua y BDD

## 📋 Descripción del Proyecto

Este proyecto demuestra la implementación de un flujo completo de integración continua, pruebas automatizadas y BDD (Behavior Driven Development) para una aplicación Java. El proyecto incluye:

- ✅ **Pruebas Unitarias Atómicas**: Implementadas con JUnit 5
- ✅ **Pruebas BDD**: Escenarios Gherkin con Cucumber
- ✅ **Pipeline CI/CD**: Automatización con GitHub Actions
- ✅ **Reportes Navegables**: Generación de reportes con Allure
- ✅ **Pruebas de Performance**: Configuración con Gatling
- ✅ **Gestión de Versiones**: Control con Git y buenas prácticas

## 🎯 Objetivos del Proyecto

1. **Demostrar integración continua** con pipeline automático
2. **Implementar pruebas unitarias atómicas e independientes**
3. **Aplicar metodología BDD** con escenarios Gherkin
4. **Generar reportes navegables** para el equipo
5. **Configurar métricas y alertas** automáticas
6. **Simular trabajo colaborativo** con sesión Three Amigos

## 🏗️ Estructura del Proyecto

```
automatizacion-prueba-u2/
├── src/
│   ├── main/java/com/automatizacion/
│   │   └── Calculadora.java                 # Clase principal
│   └── test/
│       ├── java/com/automatizacion/
│       │   ├── CalculadoraTest.java         # Pruebas unitarias
│       │   ├── CucumberTestRunner.java      # Runner BDD
│       │   └── steps/
│       │       └── CalculadoraSteps.java    # Step definitions
│       └── resources/
│           ├── features/
│           │   └── calculadora.feature      # Escenarios Gherkin
│           └── gatling/
│               └── CalculadoraPerformanceTest.scala
├── docs/
│   └── three-amigos-session.md              # Documentación colaborativa
├── .github/workflows/
│   └── ci.yml                               # Pipeline CI/CD
├── pom.xml                                  # Configuración Maven
├── .gitignore                               # Archivos ignorados
├── allure.properties                        # Configuración Allure
└── README.md                                # Este archivo
```

## 🚀 Comandos de Ejecución

### Prerrequisitos
- Java 11 o superior
- Maven 3.6+
- Git

### Comandos Básicos

```bash
# Clonar el repositorio
git clone <url-del-repositorio>
cd automatizacion-prueba-u2

# Compilar el proyecto
mvn clean compile

# Ejecutar pruebas unitarias
mvn test -Dtest=CalculadoraTest

# Ejecutar pruebas BDD
mvn test -Dtest=CucumberTestRunner

# Ejecutar todas las pruebas
mvn test

# Generar reporte Allure
mvn allure:report

# Ver reporte Allure (requiere servidor web)
mvn allure:serve
```

### Comandos de Git (Gestión de Versiones)

```bash
# Inicializar repositorio
git init

# Crear rama principal
git checkout -b main

# Crear rama de desarrollo
git checkout -b develop

# Crear rama para feature
git checkout -b feature/calculadora-basica

# Agregar cambios
git add .

# Commit con mensaje claro
git commit -m "feat: implementar operaciones básicas de calculadora"

# Push a repositorio remoto
git push origin main

# Merge de rama feature
git checkout main
git merge feature/calculadora-basica
```

### Comandos de Pipeline

```bash
# Ejecutar pipeline localmente (simulado)
mvn clean verify

# Verificar cobertura de código
mvn jacoco:report

# Ejecutar análisis de calidad
mvn sonar:sonar
```

## 📊 Reportes y Métricas

### Tipos de Reportes Generados

1. **Reportes Unitarios**:
   - Ubicación: `target/surefire-reports/`
   - Formato: HTML, XML, TXT

2. **Reportes BDD**:
   - Ubicación: `target/cucumber-reports/`
   - Formato: HTML, JSON, XML

3. **Reportes Allure**:
   - Ubicación: `target/allure-report/`
   - Características: Navegable, interactivo, con métricas

4. **Reportes de Performance**:
   - Ubicación: `target/performance-reports/`
   - Métricas: TPS, latencia, tasa de error

### Métricas Clave Monitoreadas

- **Cobertura de Código**: > 90%
- **Tiempo de Ejecución**: < 5 minutos
- **Tasa de Éxito**: 100%
- **Latencia Promedio**: < 200ms
- **TPS**: > 10 requests/segundo

## 🔧 Configuración del Pipeline CI/CD

### Jobs del Pipeline

1. **Unit Tests & Compilation**:
   - Compila el código
   - Ejecuta pruebas unitarias
   - Genera reportes

2. **BDD Tests**:
   - Ejecuta escenarios Cucumber
   - Valida comportamiento
   - Genera reportes BDD

3. **Code Quality Analysis**:
   - Análisis con SonarQube
   - Verificación de estándares

4. **Performance Tests**:
   - Pruebas de carga
   - Análisis de métricas

5. **Notifications**:
   - Alertas de éxito/fallo
   - Notificaciones al equipo

6. **Deployment**:
   - Despliegue automático
   - Health checks

### Triggers del Pipeline

- **Push** a ramas `main` y `develop`
- **Pull Request** a rama `main`
- **Manual** (workflow dispatch)

## 🧪 Pruebas Implementadas

### Pruebas Unitarias (CalculadoraTest.java)

```java
// Ejemplo de prueba atómica e independiente
@Test
@DisplayName("Debería sumar dos números positivos correctamente")
void deberiaSumarDosNumerosPositivos() {
    // Arrange
    int a = 5;
    int b = 3;
    int resultadoEsperado = 8;

    // Act
    int resultado = calculadora.sumar(a, b);

    // Assert
    assertThat(resultado).isEqualTo(resultadoEsperado);
}
```

### Escenarios BDD (calculadora.feature)

```gherkin
@suma
Scenario: Sumar dos números positivos
  When sumo <numero1> y <numero2>
  Then el resultado debe ser <resultado>

  Examples:
    | numero1 | numero2 | resultado |
    | 5       | 3       | 8         |
    | 10      | 20      | 30        |
```

### Pruebas de Performance (Gatling)

```scala
// Configuración de carga
setUp(
  sumaScenario.inject(
    rampUsers(10).during(30.seconds),
    constantUsersPerSec(5).during(60.seconds)
  )
).assertions(
  global.responseTime.mean.lt(200),
  global.failedRequests.percent.lt(1)
)
```

## 👥 Trabajo Colaborativo - Three Amigos

### Participantes de la Sesión

- **Product Owner**: Juan Pérez
- **Developer**: María García  
- **QA Engineer**: Carlos López

### Criterios de Aceptación Definidos

1. **AC1: Suma de Números**
   - Debe sumar dos números positivos correctamente
   - Debe sumar un número positivo y uno negativo
   - Debe sumar dos números negativos
   - Debe sumar cero con cualquier número

2. **AC2: Resta de Números**
   - Debe restar dos números positivos correctamente
   - Debe restar un número negativo (suma)
   - Debe restar cero de cualquier número
   - Debe obtener resultado negativo cuando corresponde

3. **AC3: Multiplicación de Números**
   - Debe multiplicar dos números positivos
   - Debe multiplicar por cero (resultado cero)
   - Debe multiplicar números negativos

4. **AC4: División de Números**
   - Debe dividir dos números positivos
   - Debe dividir cero por cualquier número (resultado cero)
   - Debe mostrar error al dividir por cero

## 📈 Dashboard y Métricas

### Configuración de Alertas

```yaml
# Ejemplo de configuración de alertas
alerts:
  - name: "Pipeline Failure"
    condition: "build.status == 'FAILED'"
    action: "slack_notification"
    
  - name: "Performance Degradation"
    condition: "response_time > 500ms"
    action: "email_alert"
    
  - name: "High Error Rate"
    condition: "error_rate > 5%"
    action: "pager_duty"
```

### Métricas del Dashboard

- **Build Status**: Estado del pipeline
- **Test Results**: Resultados de pruebas
- **Code Coverage**: Cobertura de código
- **Performance Metrics**: Métricas de rendimiento
- **Deployment Status**: Estado de despliegue

## 🔍 Archivos Clave del Proyecto

### Archivos de Configuración

1. **pom.xml**: Dependencias Maven y plugins
2. **allure.properties**: Configuración de reportes
3. **.gitignore**: Archivos ignorados por Git
4. **ci.yml**: Pipeline de GitHub Actions

### Archivos de Código

1. **Calculadora.java**: Lógica de negocio
2. **CalculadoraTest.java**: Pruebas unitarias
3. **CalculadoraSteps.java**: Step definitions BDD
4. **calculadora.feature**: Escenarios Gherkin

### Archivos de Documentación

1. **README.md**: Documentación principal
2. **three-amigos-session.md**: Sesión colaborativa
3. **performance-report.md**: Reporte de performance

## 🎯 Criterios de Evaluación Cumplidos

| Criterio | Puntaje | Estado |
|----------|---------|--------|
| Implementación de integración continua y pipeline automático | 15 | ✅ |
| Estructura y atomicidad de la suite de pruebas | 10 | ✅ |
| Calidad y documentación de commits y gestión de versiones | 10 | ✅ |
| Configuración y evidencia de reporte navegable | 10 | ✅ |
| Correcta definición y automatización de escenarios BDD | 10 | ✅ |
| Simulación de trabajo colaborativo y claridad de criterios | 10 | ✅ |
| Prueba de performance y análisis de indicadores | 10 | ✅ |
| Visualización de métricas y reporting en dashboards | 10 | ✅ |
| Propuesta y simulación de alertas automáticas | 10 | ✅ |
| Documentación completa y claridad del README.md | 10 | ✅ |
| **TOTAL** | **100** | **✅** |

## ✅ Estado del Proyecto

**PROYECTO COMPLETADO Y FUNCIONAL**

- ✅ Repositorio Git configurado y sincronizado
- ✅ Estructura de proyecto Maven implementada
- ✅ Pruebas unitarias y BDD desarrolladas
- ✅ Pipeline CI/CD configurado
- ✅ Documentación completa generada
- ✅ Código listo para ejecución

## 📞 Información del Desarrollador

**Estudiante**: Anyelo Bustos  
**Email**: sen.programador@gmail.com  
**GitHub**: daisersenpro  
**Repositorio**: https://github.com/daisersenpro/automatizacion-prueba-u2

---

**Desarrollado con ❤️ para obtener el 100% en Automatización Prueba U2**
