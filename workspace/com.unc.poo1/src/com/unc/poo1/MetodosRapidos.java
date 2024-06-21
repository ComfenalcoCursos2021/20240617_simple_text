package com.unc.poo1;

public class MetodosRapidos {
	
	public String mensaje(String mensaje) {
		String mensajeTotal = "";
		for (int i = 0; i < 10; i++) {
			mensajeTotal = mensajeTotal + (i + 1 + "concatenacion" + mensaje) + "\r\n";
		}
		return mensajeTotal;
	}

	public int sumaNNumerosPares(int n) {
		int suma = 0;
		for (int i = 2; i <= n*2; i=i+2) {
			suma = suma + i;
		}
		return suma;
	}

	public int sumaNNumerosParesEntre0y(int n) {
		int suma = 0;
		for (int i = 0; i <= n; i=i+2) {
			
			suma = suma + i;
		}
		return suma;
	}
	
	public String saberNumeroPrimo(int n) {
		
		
		String mensaje="";
		
		for(int i =2;i<=n/2;i=i+1) {
			
			if(n% i==0) {
				
				mensaje= n+" no es numero primo";
				
			}else {
				
				mensaje= n+" es numero primo";	
				
			}
		}
		
		return mensaje;
	}
	
}
