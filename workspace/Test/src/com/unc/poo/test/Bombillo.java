package com.unc.poo.test;

import java.io.Serializable;

public class Bombillo implements Serializable {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 336257739334359760L;
	private boolean encendido;	
	private float lumens;
	private String color;
	private String tipo;
	
	private float ancho;
	private float alto;
	private float profundo;
	
	/**
	 * Este constructor inicializa todos los valores del bombillo, para que este este funcional desde el principio
	 * @param altoValor Esta variable lleva el valor de la dimension del alto
	 * @param anchoValor Esta variable lleva el valor de la dimension del ancho
	 * @param profundoValor Esta variable lleva el valor de la dimension de la profundidad
	 * @param tipoValor Esta variable lleva el valor del tipo; tales como  "LED" "Incandecente" "alogeno"
	 * @param colorValor Esta variable lleva el valor del color
	 * @param lumensValor Esta variable lleva el valor de la intensidad luminica
	 */
	public Bombillo (float altoValor, float anchoValor, float profundoValor, String tipoValor, String colorValor, float lumensValor ) {
		
		
		// this.alto = altoValor;
		// this.ancho = anchoValor;
		// this.profundo = profundoValor;
		
		this.setAlto(altoValor);
		this.setAncho(anchoValor);
		this.setProfundo(profundoValor);
		this.setTipo(tipoValor);
		this.setColor(colorValor);
		this.setLumens(lumensValor);
		this.apagar();
	}
	
	/**
	 * Este comportamiento cambia una propiedad interna para almacenar y controlar el estado
	 * actual del bombillo, podra ser consultada por medio del metodo estaEncendido()
	 */
	public void encender() {
		this.encendido = true;
	}
	public void apagar() {
		this.encendido = false;
	}
	/**
	 * Esta funcion retorna en una cadena SI/NO  si esta encendido el bombillo
	 * @return estado actual del bombillo
	 */
	public String estaEncendido() {
		if(this.encendido) {
			return "SI";
		} else {
			return "NO";
		}
	}
	
	
	public boolean isEncendido() {
		return this.encendido;
	}
	
	public float getLumens() {
		return lumens;
	}
	private void setLumens(float lumens) {
		this.lumens = lumens;
	}
	public String getColor() {
		return color;
	}
	protected void setColor(String color) {
		this.color = color;
	}
	public String getTipo() {
		return tipo;
	}
	private void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getAncho() {
		return ancho;
	}
	private void setAncho(float ancho) {
		this.ancho = ancho;
	}
	
	
	public float getAlto() {
		return alto;
	}
	private void setAlto(float alto) {
		this.alto = alto;
	}
	public float getProfundo() {
		return profundo;
	}
	private void setProfundo(float profundo) {
		this.profundo = profundo;
	}
	
	
	
	public String toString() {
		String respuesta =  "";
		respuesta = respuesta + "+----------------------\r\n";
		respuesta = respuesta + "|"+ this.alto +" x "+this.ancho+" x "+this.profundo+"\r\n";
		respuesta = respuesta + "|"+ this.tipo + "\r\n";
		respuesta = respuesta + "|"+ this.color + "\r\n";
		respuesta = respuesta + "|"+ this.lumens + "\r\n";
		respuesta = respuesta + "+----------------------\r\n";
		return respuesta;
	}
	
	
}

