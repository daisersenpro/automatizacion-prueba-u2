package com.automatizacion;

/**
 * Clase Calculadora que implementa operaciones matemáticas básicas
 * Utilizada para demostrar pruebas unitarias atómicas e independientes
 */
public class Calculadora {
    
    /**
     * Realiza la suma de dos números enteros
     * @param a primer operando
     * @param b segundo operando
     * @return resultado de la suma
     */
    public int sumar(int a, int b) {
        return a + b;
    }
    
    /**
     * Realiza la resta de dos números enteros
     * @param a minuendo
     * @param b sustraendo
     * @return resultado de la resta
     */
    public int restar(int a, int b) {
        return a - b;
    }
    
    /**
     * Realiza la multiplicación de dos números enteros
     * @param a primer factor
     * @param b segundo factor
     * @return resultado de la multiplicación
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
    /**
     * Realiza la división de dos números enteros
     * @param a dividendo
     * @param b divisor
     * @return resultado de la división
     * @throws ArithmeticException si el divisor es cero
     */
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return (double) a / b;
    }
}
