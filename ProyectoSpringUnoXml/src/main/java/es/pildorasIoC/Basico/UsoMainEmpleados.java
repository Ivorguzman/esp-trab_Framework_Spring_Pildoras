package es.pildorasIoC.Basico; // * Declaración del paquete al que pertenece esta clase

import org.springframework.context.support.ClassPathXmlApplicationContext; // * Importación de la clase ClassPathXmlApplicationContext de Spring

public class UsoMainEmpleados { // * Declaración de la clase UsoMainEmpleados

	@SuppressWarnings("resource")
	public static void main(String[] args) { // * Método principal de la aplicación

		// * Creación de objetos tipo empleado
		/*
		 * JefeEmpleados empleado1 = new JefeEmpleados(); // * Instancia de JefeEmpleados
		 * SecretarioEmpleados empleado2 = new SecretarioEmpleados(); // * Instancia de SecretarioEmpleados
		 * DirectorEmpleado empleado3 = new DirectorEmpleado(); // * Instancia de DirectorEmpleado
		 * 
		 * System.out.println(empleado3.getTareas()); // * Imprimir tareas de DirectorEmpleado
		 * System.out.println(empleado1.getTareas()); // * Imprimir tareas de JefeEmpleados
		 * System.out.println(empleado2.getTareas()); // * Imprimir tareas de SecretarioEmpleados
		 */

		// ******************** USO DE SPRING FRAMEWORK *****************

		/*
		 * ClassPathXmlApplicationContext("....") es una implementación
		 * de la interfaz ApplicationContext (un conjunto de métodos que deben ser implementados por las clases que la utilizan.)
		 * que carga un archivo XML de configuración de Spring desde el classpath del proyecto.
		 * El classpath es el conjunto de rutas donde se buscan
		 * las clases y los recursos que necesita el programa.
		 */

		// * Paso 1: Crear contexto (Cargar archivo XML)
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("ApplicationContext.xml"); // * Crear contexto usando ApplicationContext.xml
		ClassPathXmlApplicationContext contextoPropirdades = new ClassPathXmlApplicationContext("ApplicationContext_conPropiedades.xml"); // * Crear contexto usando
																																			 // ApplicationContext_conPropiedades.xml

		// * Paso 2: Pedir el Bean
		/*
		 * El método getBean() es una forma de obtener una instancia de un bean
		 * que está registrado en el contenedor de Spring.
		 */
		DirectorEmpleado Juan = contexto.getBean("miEmpleado", DirectorEmpleado.class); // * Obtener el bean miEmpleado y asignarlo a DirectorEmpleado Juan
		SecretarioEmpleados Maria = contexto.getBean("miSecretarioEmpleados", SecretarioEmpleados.class); // * Obtener el bean miSecretarioEmpleados y asignarlo a
																											 // SecretarioEmpleados Maria
		SecretarioEmpleados Ana = contextoPropirdades.getBean("miSecretarioEmpleados", SecretarioEmpleados.class); // * Obtener el bean miSecretarioEmpleados del segundo
																													 // contexto y asignarlo a SecretarioEmpleados Ana
		JefeEmpleados Pedro = contexto.getBean("JefeEmpleados", JefeEmpleados.class); // * Obtener el bean JefeEmpleados y asignarlo a JefeEmpleados Pedro
		JefeEmpleados Antonia = contexto.getBean("JefeEmpleados", JefeEmpleados.class); // * Obtener el bean JefeEmpleados y asignarlo a JefeEmpleados Antonia

		// * Paso 3: Utilizar los Bean
		// * Utilizar el Bean para inyección a través del Constructor
		System.out.println("Inyección a través del Constructor: ");
		System.out.println("Empleado Juan => " + Juan.getTareas()); // * Imprimir tareas de Juan
		System.out.println("Empleado Juan => " + Juan.getInforme()); // * Imprimir informe de Juan
		System.out.println();
		System.out.println();

		// * Utilizar el Bean para inyección a través del Setter
		System.out.println("Inyección a través del Setter:");
		System.out.println("Empleada Maria => " + Maria.getTareas()); // * Imprimir tareas de Maria
		System.out.println("Empleada Maria => " + Maria.getInforme()); // * Imprimir informe de Maria
		System.out.println();
		System.out.println();

		// * Utilizar el Bean para inyección a través de campos
		System.out.println("Inyección a través de campos:");
		System.out.println("Email Corporativo =>  " + Maria.getEmail()); // * Imprimir email de Maria
		System.out.println("Nombre de la Empresa =>  " + Maria.getNombreEmpresa()); // * Imprimir nombre de la empresa de Maria
		System.out.println();
		System.out.println();

		System.out.println("Inyección a través de campos:");
		System.out.println("Teléfono - Maria => " + Maria.getTelefono()); // * Imprimir teléfono de Maria
		System.out.println();
		System.out.println();

		System.out.println("Inyección a través de campos:");
		System.out.println("Teléfono - Antonia => " + Antonia.getTelefono()); // * Imprimir teléfono de Antonia
		System.out.println();
		System.out.println();

		System.out.println("Inyección a través de campos:");
		System.out.println("Teléfono - Pedro => " + Pedro.getTelefono2()); // * Imprimir segundo teléfono de Pedro
		System.out.println();
		System.out.println();

		// * Utilizar el Bean para inyección de propiedades
		System.out.println("Inyección a través de Archivo de propiedades:");
		System.out.println("Página - Ana => " + Ana.getPaginaWeb()); // * Imprimir página web de Ana
		System.out.println();
		System.out.println();

		System.out.println(contexto.toString()); // * Imprimir contexto
		System.out.println(contextoPropirdades.toString()); // * Imprimir contextoPropiedades

		// * Paso 4: Cerrar el contexto
		contexto.close(); // * Cerrar el contexto
		contextoPropirdades.close(); // * Cerrar el contextoPropiedades
	}

	@Override
	public String toString() { // * Método toString para la clase UsoMainEmpleados
		return "UsoMainEmpleados [getClass()=" + this.getClass() + ", hashCode()=" + this.hashCode() + ", toString()=" + super.toString() + "]"; // * Retorna una descripción
																																				 // de la instancia
	}

	/*
	 * La inversión de control es un (patrón de programación) que consiste en delegar el control
	 * del flujo de un programa a un contenedor o framework. Esto permite desacoplar
	 * los componentes de una aplicación y facilitar su prueba y mantenimiento.
	 * Un ejemplo de inversión de control es el uso de interfaces gráficas que manejan los eventos
	 * del usuario y llaman a los métodos apropiados del programa¹.
	 * 
	 * La inyección de dependencias es un (tipo específico de inversión de control)
	 * que consiste en proveer a una clase los objetos que necesita para realizar sus funciones, en
	 * lugar de crearlos dentro de la misma clase. Esto permite que la clase
	 * sea más flexible y reutilizable, ya que puede trabajar con diferentes implementaciones de las
	 * dependencias. Un ejemplo de inyección de dependencias es el uso de anotaciones como
	 *
	 * @Autowired o @Inject en Spring para indicar al contenedor qué beans debe inyectar
	 * en los campos o constructores de una clase.
	 * 
	 * NOTA: Una dependencia es un módulo o biblioteca que proporciona una funcionalidad específica a la aplicación.
	 * 
	 * Spring es un framework de Java que facilita el desarrollo de aplicaciones empresariales
	 * mediante el uso de inversión de control e inyección de dependencias.
	 * Spring ofrece varios módulos para integrar diferentes tecnologías como web,
	 * datos, seguridad, etc. Spring Boot es una extensión de Spring que simplifica la configuración y el
	 * despliegue de las aplicaciones, mediante el uso de autoconfiguración y convenciones sobre configuración³.
	 */
}
