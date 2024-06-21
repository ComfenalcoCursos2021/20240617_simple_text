package com.unc.poo1;

public class Inicio {
    public static void main(String[] args) {
        MetodosRapidos metodo = new MetodosRapidos();
        
        int resultado1 = metodo.sumaNNumerosPares(6);
        int resultado2=metodo.sumaNNumerosParesEntre0y(6);
        
        
        
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
