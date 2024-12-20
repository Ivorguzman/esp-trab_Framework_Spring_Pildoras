package es.pildorasIoC.AnnotationsConfiguration; // * Declaración del paquete al que pertenece esta clase

public class InformeFinancieroDtoCompras implements CreacionInformeFinanciero { // * Declaración de la clase InformeFinancieroDtoCompras que implementa la interfaz
																				 // CreacionInformeFinanciero

	// Implementa el método de la interfaz para devolver un informe
	@Override
	public String getInformeFinanciero() { // * Implementación del método getInformeFinanciero de la interfaz CreacionInformeFinanciero
		return "Informe financiero del departamento de compras 2024"; // * Retorna la descripción del informe financiero del departamento de compras para 2024
	}
}
