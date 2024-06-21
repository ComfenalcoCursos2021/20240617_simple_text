package com.unc.poo1;

public class Inicio {
    public static void main(String[] args) {
        MetodosRapidos metodo = new MetodosRapidos();
        
        int resultado1 = metodo.sumaNNumerosPares(6);
        int resultado2=metodo.sumaNNumerosParesEntre0y(10);
        int preguntaSiEsPrimo =337;
        boolean resultado3=metodo.numerosPrimos(preguntaSiEsPrimo);
        if(resultado3) {
        	System.out.println("El numero " + preguntaSiEsPrimo + " es primo desde el main" );
        }else {
        	System.out.println("El numero " + preguntaSiEsPrimo + " NO es primo desde el main");
        }
        
        
        
        String resultado = metodo.mensaje("prueba");
        
        String numeroPrimo = metodo.saberNumeroPrimo(47);
        System.out.println(numeroPrimo);
        /*
        System.out.println(resultado);
        System.out.println(resultado1);
        System.out.println(resultado2);
        */
       
    }
}
