package es.pildorasIoC.AnnotationsAutowired; // * Declaración del paquete al que pertenece esta clase

import org.springframework.stereotype.Component; // * Importación de la anotación @Component de Spring para la detección automática de beans

@Component // * Indica que esta clase es un componente gestionado por Spring
public class InformeFinancieroTrimestre1 implements CreacionInformeFinanciero { // * Declaración de la clase InformeFinancieroTrimestre1 que implementa la interfaz
																				 // CreacionInformeFinanciero

	@Override
	public String getInformeFinanciero() { // * Implementación del método getInformeFinanciero de la interfaz CreacionInformeFinanciero
		return "Presentación del informe financiero trimestre 1 (AnnotationsAutowired)"; // * Retorna la descripción del informe financiero del trimestre 1
	}

}
