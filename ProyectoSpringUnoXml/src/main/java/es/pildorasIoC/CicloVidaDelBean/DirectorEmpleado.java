package es.pildorasIoC.CicloVidaDelBean; // * Declaración del paquete al que pertenece esta clase

public class DirectorEmpleado implements Empleados { // * Declaración de la clase DirectorEmpleado que implementa la interfaz Empleados

	// * Paso 1: Creación de propiedad de tipo (interfaz CreacionInformes) para el bean 01 (miInforme)
	private CreacionInformes informeNuevo; // * Campo privado para almacenar la instancia de CreacionInformes

	// * PASO 2: Creación del constructor que inyecta la dependencia del bean 01 (miInforme)
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

	@Override
	public String toString() { // * Método toString para la clase DirectorEmpleado
		return "DirectorEmpleado [informeNuevo=" + this.informeNuevo + ", email=" + this.email + ", nombreEmpresa=" + this.nombreEmpresa + ", getInformes()=" + this
				.getInformes() + "]"; // * Retorna una descripción de la instancia
	}

	// * Creación de campos o instancias
	private String email; // * Campo privado para almacenar el email
	private String nombreEmpresa; // * Campo privado para almacenar el nombre de la empresa

	// * Creación de Setters y Getters
	public String getCorreo() { // * Método getter para obtener el valor del email
		return this.email; // * Retorna el valor del email
	}

	public void setCorreo(String email) { // * Método setter para establecer el valor del email
		this.email = email; // * Asigna el valor del parámetro al campo email
	}

	public String getEmpresa() { // * Método getter para obtener el valor del nombre de la empresa
		return this.nombreEmpresa; // * Retorna el valor del nombre de la empresa
	}

	public void setEmpresa(String nombreEmpresa) { // * Método setter para establecer el valor del nombre de la empresa
		this.nombreEmpresa = nombreEmpresa; // * Asigna el valor del parámetro al campo nombre de la empresa
	}

	// * Método <init>. Ejecutar tareas antes de que el bean esté disponible
	public void inicio() { // * Método que se ejecuta antes de que el bean esté disponible
		System.out.println("Ejecutar cualquier tipo de tarea ANTES de que el bean esté disponible"); // * Imprime un mensaje indicando que se está ejecutando una tarea antes
																									 // de que el bean esté disponible
	}

	// * Método <destroy>. Ejecutar tareas después de usar el bean
	public void fin() { // * Método que se ejecuta después de usar el bean
		System.out.println("Ejecutar cualquier tipo de tarea DESPUÉS de que el bean esté disponible"); // * Imprime un mensaje indicando que se está ejecutando una tarea
																										 // después de usar el bean
	}

}
