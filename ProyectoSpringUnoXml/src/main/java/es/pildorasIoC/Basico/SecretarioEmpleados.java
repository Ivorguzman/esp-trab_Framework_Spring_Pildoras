package es.pildorasIoC.Basico; // * Declaración del paquete al que pertenece esta clase

public class SecretarioEmpleados implements Empleados { // * Declaración de la clase SecretarioEmpleados que implementa la interfaz Empleados

	// * Propiedad que almacena informeNuevo (CreacionInformes informeNuevo) recibida en el setter
	private CreacionInformes informeNuevo; // * Campo privado para almacenar la instancia de CreacionInformes (IoC)

	// * Propiedad que almacena la inyección del email
	private String email; // * Campo privado para almacenar el email (IoC)

	// * Propiedad que almacena la inyección del nombre de la empresa
	private String nombreEmpresa; // * Campo privado para almacenar el nombre de la empresa (IoC)

	// * Propiedad que almacena la inyección del teléfono
	private String telefono; // * Campo privado para almacenar el teléfono (IoC)

	// * Propiedad que almacena la dirección de la página web
	private String paginaWeb; // * Campo privado para almacenar la página web (IoC)

	// *************** Setters Y Getters *****************

	public String getPaginaWeb() { // * Método getter para obtener el valor de la página web
		return this.paginaWeb; // * Retorna el valor de la página web
	}

	public void setPaginaWeb(String paginaWeb) { // * Método setter para establecer el valor de la página web
		this.paginaWeb = paginaWeb; // * Asigna el valor del parámetro al campo página web
	}

	public String getTelefono() { // * Método getter para obtener el valor del teléfono
		return this.telefono; // * Retorna el valor del teléfono
	}

	// * Establece el valor de los campos del ApplicationContext.xml
	// * Realiza la inyección de la dependencia por el método setter (IoC)
	public void setTelefono(String telefono) { // * Método setter para establecer el valor del teléfono
		this.telefono = telefono; // * Asigna el valor del parámetro al campo teléfono
	}

	// * Establece el valor de los campos del ApplicationContext.xml
	// * Realiza la inyección de la dependencia por el método setter (IoC)
	public void setInformeNuevo(CreacionInformes informeNuevo) { // * Método setter para establecer el valor de informeNuevo
		this.informeNuevo = informeNuevo; // * Asigna el valor del parámetro al campo informeNuevo
	}

	public CreacionInformes getInformeNuevo() { // * Método getter para obtener el valor de informeNuevo
		return this.informeNuevo; // * Retorna el valor de informeNuevo
	}

	public String getEmail() { // * Método getter para obtener el valor del email
		return this.email; // * Retorna el valor del email
	}

	// * Establece el valor de los campos del ApplicationContext.xml
	// * Realiza la inyección de la dependencia por el método setter (IoC)
	public void setEmail(String email) { // * Método setter para establecer el valor del email
		this.email = email; // * Asigna el valor del parámetro al campo email
	}

	public String getNombreEmpresa() { // * Método getter para obtener el valor del nombre de la empresa
		return this.nombreEmpresa; // * Retorna el valor del nombre de la empresa
	}

	// * Establece el valor de los campos del ApplicationContext.xml
	// * Realiza la inyección de la dependencia por el método setter (IoC)
	public void setNombreEmpresa(String nombreEmpresa) { // * Método setter para establecer el valor del nombre de la empresa
		this.nombreEmpresa = nombreEmpresa; // * Asigna el valor del parámetro al campo nombre de la empresa
	}

	@Override
	public String getTareas() { // * Implementación del método getTareas de la interfaz Empleados
		return "Soy SecretarioEmpleados y gestiono todo lo del secretariado"; // * Retorna una descripción de las tareas del Secretario de Empleados
	}

	@Override
	public String getInforme() { // * Implementación del método getInforme de la interfaz Empleados
		return "Este informe es presentado por SecretarioEmpleado " + this.informeNuevo.getInforme(); // * Retorna un mensaje de informe presentado por el SecretarioEmpleado
																										 // concatenado con el informe generado por informeNuevo
	}

}
