package es.pildorasIoC.AnnotationsComponent; // * Declaración del paquete al que pertenece esta clase

import org.springframework.context.support.ClassPathXmlApplicationContext; // * Importación de la clase ClassPathXmlApplicationContext de Spring para cargar el contexto de la
																			 // aplicación desde un archivo XML

public class MainUsoAnnotationComponent { // * Declaración de la clase MainUsoAnnotationComponent

	public static void main(String[] args) { // * Método principal de la aplicación

		// *********** 01 leer el xml de configuración ********
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext contextoAnnotation = new ClassPathXmlApplicationContext("aplicacionContexAnnotationComponent.xml"); // * Crear el contexto de la
																																			 // aplicación a partir del
																																			 // archivo XML de configuración

		// ********** 02 pedir bean al contenedor ***********
		// Cuando se utiliza la anotación con atributo: @Component("Experimentado")
		/* Empleados antonio = contextoAnnotation.getBean("Experimentado", Empleados.class) */

		// Cuando se utiliza la anotación sin atributo: @Component() [nombre de la clase en minúscula ==> "comercialExperimentado"]
		Empleados antonio = contextoAnnotation.getBean("comercialExperimentadoComponent", Empleados.class); // * Obtener el bean del contenedor de Spring

		// ********* 03 Usar el bean ***********
		System.out.println(antonio.getInformes()); // * Usar el bean para obtener y mostrar los informes de Antonio

		System.out.println(antonio.getTareas()); // * Usar el bean para obtener y mostrar las tareas de Antonio

		/*
		 * 
		 * [La inversión de control es un (patrón de programación) que consiste en delegar el control
		 * del flujo de un programa a un contenedor o framework.] Esto permite desacoplar
		 * los componentes de una aplicación y facilitar su prueba y mantenimiento.
		 * Un ejemplo de inversión de control es el uso de interfaces gráficas que manejan los eventos
		 * del usuario y llaman a los métodos apropiados del programa¹.
		 * 
		 * [La inyección de dependencias es un (tipo específico de inversión de control)
		 * que consiste en proveer a una clase los objetos que necesita para realizar sus funciones, en
		 * lugar de crearlos dentro de la misma clase.] Esto permite que la clase
		 * sea más flexible y reutilizable, ya que puede trabajar con diferentes implementaciones de las
		 * dependencias. Un ejemplo de inyección de dependencias es el uso de anotaciones como
		 *
		 * @Autowired o @Inject en Spring para indicar al contenedor qué beans debe inyectar
		 * en los campos o constructores de una clase.
		 * 
		 * NOTA: [Una dependencia es un módulo o biblioteca que proporciona una funcionalidad específica a la aplicación.]
		 * 
		 * Spring es un framework de Java que facilita el desarrollo de aplicaciones empresariales
		 * mediante el uso de inversión de control e inyección de dependencias.
		 * Spring ofrece varios módulos para integrar diferentes tecnologías como web,
		 * datos, seguridad, etc. Spring Boot es una extensión de Spring que simplifica la configuración y el
		 * despliegue de las aplicaciones, mediante el uso de autoconfiguración y convenciones sobre configuración³.
		 */
	}
}
