package com.unc.poo.test;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		System.out.println("Termino!!!");
	}

}
