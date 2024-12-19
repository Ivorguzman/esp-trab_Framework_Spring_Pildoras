package es.pildorasIoC.CicloVidaDelBean; // * Declaración del paquete al que pertenece esta clase

public class SecretarioEmpleados implements Empleados { // * Declaración de la clase SecretarioEmpleados que implementa la interfaz Empleados

	// * Creación de campo de tipo: CreacionInformes (interfaz)
	private CreacionInformes informeNuevo; // * Campo privado para almacenar la instancia de CreacionInformes

	// * Método getter para obtener la instancia de CreacionInformes
	public CreacionInformes getInformeNuevo() {
		return this.informeNuevo; // * Retorna la instancia de CreacionInformes
	}

	// * Método setter para establecer la instancia de CreacionInformes
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo; // * Asigna el valor del parámetro al campo informeNuevo
	}

	// * Campos privados para almacenar el email y el nombre de la empresa
	private String email; // * Campo privado para almacenar el email
	private String nombreEmpresa; // * Campo privado para almacenar el nombre de la empresa

	// * Inyección de dependencia con método setter
	// * PASO 2: Creación del SETTER que inyecta la dependencia

	/*
	 * public void setInformeNuevo(CreacionInformes informeNuevo) {
	 * this.informeNuevo = informeNuevo;
	 * }
	 */

	@Override
	public String getTareas() { // * Implementación del método getTareas de la interfaz Empleados
		return "Soy SecretarioEmpleados y gestiono todo lo del secretariado"; // * Retorna una descripción de las tareas del Secretario de Empleados
	}

	@Override
	public String getInformes() { // * Implementación del método getInformes de la interfaz Empleados
		return "Este informe es presentado por SecretarioEmpleado " + this.informeNuevo.getInformes(); // * Retorna un mensaje de informe presentado por el SecretarioEmpleado
																										 // concatenado con el informe generado por informeNuevo
	}

	// * Método getter para obtener el valor del email
	public String getCorreo() {
		return this.email; // * Retorna el valor del email
	}

	// * Método setter para establecer el valor del email
	public void setCorreo(String email) {
		this.email = email; // * Asigna el valor del parámetro al campo email
	}

	// * Método getter para obtener el valor del nombre de la empresa
	public String getEmpresa() {
		return this.nombreEmpresa; // * Retorna el valor del nombre de la empresa
	}

	// * Método setter para establecer el valor del nombre de la empresa
	public void setEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa; // * Asigna el valor del parámetro al campo nombre de la empresa
	}

}
