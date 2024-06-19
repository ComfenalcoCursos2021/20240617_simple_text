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


}
