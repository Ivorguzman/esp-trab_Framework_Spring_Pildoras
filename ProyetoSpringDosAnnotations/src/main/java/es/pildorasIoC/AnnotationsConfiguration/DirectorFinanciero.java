package es.pildorasIoC.AnnotationsConfiguration; // * Declaración del paquete al que pertenece esta clase

public class DirectorFinanciero implements Empleados { // * Declaración de la clase DirectorFinanciero que implementa la interfaz Empleados

	// Dependencia inyectada
	private CreacionInformeFinanciero informeFinancieroCompras; // * Campo privado para almacenar la instancia de CreacionInformeFinanciero

	// Constructor que recibe la dependencia
	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) { // * Constructor que recibe una instancia de CreacionInformeFinanciero
		this.informeFinancieroCompras = informeFinanciero; // * Asignación del valor del parámetro al campo informeFinancieroCompras
	}

	// Implementa el método de la interfaz para devolver las tareas
	@Override
	public String getTareas() { // * Implementación del método getTareas de la interfaz Empleados
		return "Gestión de las operaciones financieras de la empresa"; // * Retorna la descripción de las tareas del Director Financiero
	}

	// Implementa el método de la interfaz para devolver los informes
	@Override
	public String getInformes() { // * Implementación del método getInformes de la interfaz Empleados
		return this.informeFinancieroCompras.getInformeFinanciero(); // * Retorna el informe financiero generado por la dependencia CreacionInformeFinanciero
	}
}
