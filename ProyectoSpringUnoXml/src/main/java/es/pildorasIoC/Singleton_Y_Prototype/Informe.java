package es.pildorasIoC.Singleton_Y_Prototype; // * Declaración del paquete al que pertenece esta clase

// * PASO 1: Creación de la interfaz para la dependencia
public class Informe implements CreacionInformes { // * Declaración de la clase Informe que implementa la interfaz CreacionInformes

	@Override
	public String getInformes() { // * Implementación del método getInformes de la interfaz CreacionInformes
		return " y esta es la presentación del informe "; // * Retorna un mensaje indicando la presentación del informe
	}

}
