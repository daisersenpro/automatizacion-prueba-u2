package com.automatizacion.steps;

import com.automatizacion.Calculadora;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.assertj.core.api.Assertions;

/**
 * Step Definitions para los escenarios BDD de la Calculadora
 * Implementa los pasos definidos en los archivos .feature
 */
public class CalculadoraSteps {

    private Calculadora calculadora;
    private double resultado;
    private Exception excepcion;

    @Before
    public void setUp() {
        calculadora = new Calculadora();
        resultado = 0;
        excepcion = null;
    }

    @Dado("que tengo una calculadora disponible")
    public void queTengoUnaCalculadoraDisponible() {
        // La calculadora ya está inicializada en setUp()
        Assertions.assertThat(calculadora).isNotNull();
    }

    @Cuando("sumo {int} y {int}")
    public void sumoY(int numero1, int numero2) {
        resultado = calculadora.sumar(numero1, numero2);
    }

    @Cuando("resto {int} menos {int}")
    public void restoMenos(int numero1, int numero2) {
        resultado = calculadora.restar(numero1, numero2);
    }

    @Cuando("multiplico {int} por {int}")
    public void multiplicoPor(int numero1, int numero2) {
        resultado = calculadora.multiplicar(numero1, numero2);
    }

    @Cuando("divido {int} entre {int}")
    public void dividoEntre(int numero1, int numero2) {
        try {
            resultado = calculadora.dividir(numero1, numero2);
        } catch (ArithmeticException e) {
            excepcion = e;
        }
    }

    @Entonces("el resultado debe ser {double}")
    public void elResultadoDebeSer(double resultadoEsperado) {
        Assertions.assertThat(resultado).isEqualTo(resultadoEsperado);
    }

    @Entonces("el resultado debe ser {int}")
    public void elResultadoDebeSer(int resultadoEsperado) {
        Assertions.assertThat((int) resultado).isEqualTo(resultadoEsperado);
    }

    @Entonces("debe mostrar un error de división por cero")
    public void debeMostrarUnErrorDeDivisionPorCero() {
        Assertions.assertThat(excepcion)
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("No se puede dividir por cero");
    }

    @Y("verifico que la calculadora está funcionando correctamente")
    public void verificoQueLaCalculadoraEstaFuncionandoCorrectamente() {
        // Prueba básica de funcionamiento
        int suma = calculadora.sumar(2, 3);
        Assertions.assertThat(suma).isEqualTo(5);
    }
}
