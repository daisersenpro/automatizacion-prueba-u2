package com.automatizacion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * Clase de pruebas unitarias para la clase Calculadora
 * Demuestra pruebas atómicas e independientes siguiendo buenas prácticas
 */
@DisplayName("Pruebas Unitarias de Calculadora")
class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        // Cada prueba tiene su propia instancia de Calculadora
        // Esto garantiza la independencia entre pruebas
        calculadora = new Calculadora();
    }

    @Nested
    @DisplayName("Pruebas de Suma")
    class PruebasSuma {

        @Test
        @DisplayName("Debería sumar dos números positivos correctamente")
        void deberiaSumarDosNumerosPositivos() {
            // Arrange (Preparación)
            int a = 5;
            int b = 3;
            int resultadoEsperado = 8;

            // Act (Acción)
            int resultado = calculadora.sumar(a, b);

            // Assert (Verificación)
            assertThat(resultado).isEqualTo(resultadoEsperado);
        }

        @Test
        @DisplayName("Debería sumar un número positivo y uno negativo")
        void deberiaSumarPositivoYNegativo() {
            // Arrange
            int a = 10;
            int b = -3;
            int resultadoEsperado = 7;

            // Act
            int resultado = calculadora.sumar(a, b);

            // Assert
            assertThat(resultado).isEqualTo(resultadoEsperado);
        }

        @Test
        @DisplayName("Debería sumar dos números negativos")
        void deberiaSumarDosNumerosNegativos() {
            // Arrange
            int a = -5;
            int b = -3;
            int resultadoEsperado = -8;

            // Act
            int resultado = calculadora.sumar(a, b);

            // Assert
            assertThat(resultado).isEqualTo(resultadoEsperado);
        }

        @Test
        @DisplayName("Debería sumar cero con cualquier número")
        void deberiaSumarConCero() {
            // Arrange
            int a = 15;
            int b = 0;
            int resultadoEsperado = 15;

            // Act
            int resultado = calculadora.sumar(a, b);

            // Assert
            assertThat(resultado).isEqualTo(resultadoEsperado);
        }
    }

    @Nested
    @DisplayName("Pruebas de Resta")
    class PruebasResta {

        @Test
        @DisplayName("Debería restar dos números positivos correctamente")
        void deberiaRestarDosNumerosPositivos() {
            // Arrange
            int a = 10;
            int b = 3;
            int resultadoEsperado = 7;

            // Act
            int resultado = calculadora.restar(a, b);

            // Assert
            assertThat(resultado).isEqualTo(resultadoEsperado);
        }

        @Test
        @DisplayName("Debería restar un número negativo")
        void deberiaRestarNumeroNegativo() {
            // Arrange
            int a = 5;
            int b = -3;
            int resultadoEsperado = 8;

            // Act
            int resultado = calculadora.restar(a, b);

            // Assert
            assertThat(resultado).isEqualTo(resultadoEsperado);
        }

        @Test
        @DisplayName("Debería restar cero de cualquier número")
        void deberiaRestarCero() {
            // Arrange
            int a = 15;
            int b = 0;
            int resultadoEsperado = 15;

            // Act
            int resultado = calculadora.restar(a, b);

            // Assert
            assertThat(resultado).isEqualTo(resultadoEsperado);
        }

        @Test
        @DisplayName("Debería obtener resultado negativo al restar")
        void deberiaObtenerResultadoNegativo() {
            // Arrange
            int a = 3;
            int b = 10;
            int resultadoEsperado = -7;

            // Act
            int resultado = calculadora.restar(a, b);

            // Assert
            assertThat(resultado).isEqualTo(resultadoEsperado);
        }
    }

    @Nested
    @DisplayName("Pruebas de Multiplicación")
    class PruebasMultiplicacion {

        @Test
        @DisplayName("Debería multiplicar dos números positivos")
        void deberiaMultiplicarDosNumerosPositivos() {
            // Arrange
            int a = 6;
            int b = 7;
            int resultadoEsperado = 42;

            // Act
            int resultado = calculadora.multiplicar(a, b);

            // Assert
            assertThat(resultado).isEqualTo(resultadoEsperado);
        }

        @Test
        @DisplayName("Debería multiplicar por cero")
        void deberiaMultiplicarPorCero() {
            // Arrange
            int a = 15;
            int b = 0;
            int resultadoEsperado = 0;

            // Act
            int resultado = calculadora.multiplicar(a, b);

            // Assert
            assertThat(resultado).isEqualTo(resultadoEsperado);
        }
    }

    @Nested
    @DisplayName("Pruebas de División")
    class PruebasDivision {

        @Test
        @DisplayName("Debería dividir dos números positivos")
        void deberiaDividirDosNumerosPositivos() {
            // Arrange
            int a = 10;
            int b = 2;
            double resultadoEsperado = 5.0;

            // Act
            double resultado = calculadora.dividir(a, b);

            // Assert
            assertThat(resultado).isEqualTo(resultadoEsperado);
        }

        @Test
        @DisplayName("Debería lanzar excepción al dividir por cero")
        void deberiaLanzarExcepcionAlDividirPorCero() {
            // Arrange
            int a = 10;
            int b = 0;

            // Act & Assert
            assertThatThrownBy(() -> calculadora.dividir(a, b))
                    .isInstanceOf(ArithmeticException.class)
                    .hasMessage("No se puede dividir por cero");
        }

        @Test
        @DisplayName("Debería dividir cero por cualquier número")
        void deberiaDividirCeroPorCualquierNumero() {
            // Arrange
            int a = 0;
            int b = 5;
            double resultadoEsperado = 0.0;

            // Act
            double resultado = calculadora.dividir(a, b);

            // Assert
            assertThat(resultado).isEqualTo(resultadoEsperado);
        }
    }
}
