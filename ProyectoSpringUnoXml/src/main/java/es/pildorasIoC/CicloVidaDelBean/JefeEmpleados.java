package es.pildorasIoC.CicloVidaDelBean; // * Declaración del paquete al que pertenece esta clase

public class JefeEmpleados implements Empleados { // * Declaración de la clase JefeEmpleados que implementa la interfaz Empleados

	// * Creación de campo de tipo: CreacionInformes (interfaz)
	private CreacionInformes informeNuevo; // * Campo privado para almacenar la instancia de CreacionInformes

	// * PASO 2: Creación del constructor que inyecta la dependencia
	public JefeEmpleados(CreacionInformes informeNuevo) { // * Constructor que recibe una instancia de CreacionInformes
		this.informeNuevo = informeNuevo; // * Asignación de la instancia recibida al campo informeNuevo
	}

	@Override
	public String getTareas() { // * Implementación del método getTareas de la interfaz Empleados
		return "Soy JefeEmpleados y gestiono todo lo relacionado a los empleados"; // * Retorna una descripción de las tareas del Jefe de Empleados
	}

	@Override
	public String getInformes() { // * Implementación del método getInformes de la interfaz Empleados
		return "Informe presentado por el JefeEmpleado " + this.informeNuevo.getInformes(); // * Retorna un mensaje de informe presentado por el JefeEmpleado concatenado con
																							 // el informe generado por informeNuevo
	}

}
