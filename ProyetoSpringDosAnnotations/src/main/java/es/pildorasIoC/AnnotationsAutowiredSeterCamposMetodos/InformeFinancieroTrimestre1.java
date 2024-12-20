package es.pildorasIoC.AnnotationsAutowiredSeterCamposMetodos; // * Declaración del paquete al que pertenece esta clase

import org.springframework.stereotype.Component; // * Importación de la anotación @Component de Spring para la detección automática de beans

@Component // * Indica que esta clase es un componente gestionado por Spring
public class InformeFinancieroTrimestre1 implements CreacionInformeFinanciero, InformePatrimonial { // * Declaración de la clase InformeFinancieroTrimestre1 que implementa
																									 // las interfaces CreacionInformeFinanciero e InformePatrimonial

	@Override
	public String getInformeFinanciero() { // * Implementación del método getInformeFinanciero de la interfaz CreacionInformeFinanciero
		return "Presentación del informe financiero trimestre 1 (AnnotationsAutowiredSeter)"; // * Retorna la descripción del informe financiero del trimestre 1
	}

	@Override
	public String getPatrimonio() { // * Implementación del método getPatrimonio de la interfaz InformePatrimonial
		// TODO Auto-generated method stub
		return "Presentación del informe Patrimonial al Primer trimestre"; // * Retorna la descripción del informe patrimonial del primer trimestre
	}

}
