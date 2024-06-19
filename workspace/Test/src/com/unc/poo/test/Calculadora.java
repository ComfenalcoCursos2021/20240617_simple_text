package com.unc.poo.test;

import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número para calcular su factorial: ");
        int numero = scanner.nextInt();

        try {
            int resultado = calc.calcularFactorial(numero);
            System.out.println("El factorial de " + numero + " es " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
