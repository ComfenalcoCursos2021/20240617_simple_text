package com.unc.poo.test;

import java.util.ArrayList;
import java.util.List;
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
        Bombillo a = new Bombillo(15, 15, 15, "Led", "Azul", 15000);
        System.out.println(a);
        List<String> miLista = new ArrayList<>();
        miLista.add("Elemento 1");
        miLista.add("Elemento 2");
        miLista.add("Elemento 3");

        // Guardar el objeto en un archivo
        ManejadorObjetosArchivo.guardarObjetoEnArchivo(miLista, "miLista.dat");
        ManejadorObjetosArchivo.guardarObjetoEnArchivo(a, "bombilloUnico.dat");

        // Leer el objeto desde el archivo
        List<String> listaLeida = (List<String>) ManejadorObjetosArchivo.leerObjetoDeArchivo("miLista.dat");
        System.out.println("Contenido de la lista leída: " + listaLeida);
        System.out.println("========================================");
        Bombillo cargado = (Bombillo) ManejadorObjetosArchivo.leerObjetoDeArchivo("bombilloUnico.dat");
        System.out.println(cargado);
		System.out.println("Termino!!!");
	}

}
