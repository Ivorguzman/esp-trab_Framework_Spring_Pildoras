package es.pildorasIoC.Basico; // * Declaración del paquete al que pertenece esta clase

public class DirectorEmpleado implements Empleados { // * Declaración de la clase DirectorEmpleado que implementa la interfaz Empleados

	// * Paso 1: Creación de campo tipo CreaciondeInforme (interfaz) para almacenar la instancia
	// * inyectada por el constructor (CreacionInformes informeNuevo)
	private CreacionInformes informeNuevo;

	// * Paso 2: Creación del constructor
	public DirectorEmpleado(CreacionInformes informeNuevo) { // * Constructor que recibe una instancia de CreacionInformes
		this.informeNuevo = informeNuevo; // * Asignación de la instancia recibida al campo informeNuevo
	}

	@Override
	public String getTareas() { // * Implementación del método getTareas de la interfaz Empleados
		return "Soy DirectorEmpleado y realizo tareas de director"; // * Retorna una descripción de las tareas del director
	}

	@Override
	public String getInforme() { // * Implementación del método getInforme de la interfaz Empleados
		return "Informe creado por el director " + this.informeNuevo.getInforme(); // * Retorna un mensaje de informe creado por el director concatenado con el informe
																					 // generado por informeNuevo
	}
}
