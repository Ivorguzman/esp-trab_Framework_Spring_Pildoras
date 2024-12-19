package es.pildorasIoC.Singleton_Y_Prototype; // * Declaración del paquete al que pertenece esta clase

public class DirectorEmpleado implements Empleados { // * Declaración de la clase DirectorEmpleado que implementa la interfaz Empleados

	// * Paso 1: Creación de campo de tipo CreacionInformes (interfaz)
	private CreacionInformes informeNuevo; // * Campo privado para almacenar la instancia de CreacionInformes

	// * PASO 2: Creación del constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) { // * Constructor que recibe una instancia de CreacionInformes
		this.informeNuevo = informeNuevo; // * Asignación de la instancia recibida al campo informeNuevo
	}

	@Override
	public String getTareas() { // * Implementación del método getTareas de la interfaz Empleados
		return "Soy DirectorEmpleado y realizo tareas de director"; // * Retorna una descripción de las tareas del director
	}

	@Override
	public String getInformes() { // * Implementación del método getInformes de la interfaz Empleados
		return "Informe creado por el director " + this.informeNuevo.getInformes(); // * Retorna un mensaje de informe creado por el director concatenado con el informe
																					 // generado por informeNuevo
	}

	// * Creación de campos o instancias
	private String email; // * Campo privado para almacenar el email
	private String nombreEmpresa; // * Campo privado para almacenar el nombre de la empresa

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
