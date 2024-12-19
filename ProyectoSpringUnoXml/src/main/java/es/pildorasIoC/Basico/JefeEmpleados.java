package es.pildorasIoC.Basico; // * Declaración del paquete al que pertenece esta clase

public class JefeEmpleados implements Empleados { // * Declaración de la clase JefeEmpleados que implementa la interfaz Empleados

	private CreacionInformes informeNuevo; // * Campo privado para almacenar la instancia de CreacionInformes inyectada

	// * Propiedad que almacena la inyección del número de teléfono
	private String telefono; // * Campo privado para almacenar el teléfono (IoC)

	// * Propiedad que almacena la inyección del nombreEmpresa
	private String telefono2; // * Campo privado para almacenar el segundo teléfono (IoC)

	public String getTelefono() { // * Método getter para obtener el valor del teléfono
		return this.telefono; // * Retorna el valor del teléfono
	}

	// * Establece el valor de los campos del ApplicationContext.xml
	// * Realiza la inyección de la dependencia por el método setter (IoC)
	public void setTelefono(String telefono) { // * Método setter para establecer el valor del teléfono
		this.telefono = telefono; // * Asigna el valor del parámetro al campo teléfono
	}

	public String getTelefono2() { // * Método getter para obtener el valor del segundo teléfono
		return this.telefono2; // * Retorna el valor del segundo teléfono
	}

	// * Establece el valor de los campos del ApplicationContext.xml
	// * Realiza la inyección de la dependencia por el método setter (IoC)
	public void setTelefono2(String telefono2) { // * Método setter para establecer el valor del segundo teléfono
		this.telefono2 = telefono2; // * Asigna el valor del parámetro al campo segundo teléfono
	}

	/*
	 * public void setInformeNuevo(CreacionInformes informeNuevo) {
	 * this.informeNuevo = informeNuevo;
	 * }
	 *
	 * public CreacionInformes getInformeNuevo() {
	 * return this.informeNuevo;
	 * }
	 */

	@Override
	public String getTareas() { // * Implementación del método getTareas de la interfaz Empleados
		return "Soy JefeEmpleados y Gestiono todo lo relacionado a los empleados"; // * Retorna una descripción de las tareas del Jefe de Empleados
	}

	@Override
	public String getInforme() { // * Implementación del método getInforme de la interfaz Empleados
		return "Informe presentado por el JefeEmpleado " + this.informeNuevo.getInforme(); // * Retorna un mensaje de informe presentado por el JefeEmpleado concatenado con
																							 // el informe generado por informeNuevo
	}
}
