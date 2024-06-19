package com.unc.poo.test;

public class Calculadora {

    // Método para calcular el factorial de un número
    public int calcularFactorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo.");
        }
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int numero = 10; // Puedes cambiar este número para probar con otros valores
        int resultado = calc.calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es " + resultado);
    }
}
