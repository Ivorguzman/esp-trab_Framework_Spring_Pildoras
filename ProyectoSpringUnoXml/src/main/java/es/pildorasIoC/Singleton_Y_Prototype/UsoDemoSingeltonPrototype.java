package es.pildorasIoC.Singleton_Y_Prototype; // * Declaración del paquete al que pertenece esta clase

import org.springframework.context.support.ClassPathXmlApplicationContext; // * Importación de la clase ClassPathXmlApplicationContext de Spring

public class UsoDemoSingeltonPrototype { // * Declaración de la clase UsoDemoSingeltonPrototype

	public static void main(String[] args) { // * Método principal de la aplicación

		// * 01: Cargar XML de configuración
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContextPatrones.xml"); // * Crear contexto usando
																														 // applicationContextPatrones.xml

		// * 02: Creación de bean(s) con método getBean("...") del contenedor de Spring

		// **************** PATRÓN SINGLETON ****************
		// * Bean 01
		SecretarioEmpleadosSingLeton Maria2 = contexto.getBean("miSecretarioEmpleadosSingLeton", SecretarioEmpleadosSingLeton.class); // * Obtener el bean
																																		 // miSecretarioEmpleadosSingLeton y
																																		 // asignarlo a Maria2
		SecretarioEmpleadosSingLeton Pepe2 = contexto.getBean("miSecretarioEmpleadosSingLeton", SecretarioEmpleadosSingLeton.class); // * Obtener el bean
																																	 // miSecretarioEmpleadosSingLeton y
																																	 // asignarlo a Pepe2

		System.out.println("*********** Ejemplo de Patrón Singleton *************** :");
		System.out.println("Maria2 Dirección de memoria ==> " + Maria2); // * Imprimir la dirección de memoria de Maria2
		System.out.println("Pepe2 Dirección de memoria ==> " + Pepe2); // * Imprimir la dirección de memoria de Pepe2
		System.out.println();
		System.out.println("Maria2 hashCode ==> " + Maria2.hashCode()); // * Imprimir el hashCode de Maria2
		System.out.println("Pepe2 hashCode ==> " + Pepe2.hashCode()); // * Imprimir el hashCode de Pepe2
		System.out.println();
		System.out.println();
		System.out.println();

		// **************** PATRÓN PROTOTYPE ****************
		// * Bean 02
		SecretarioEmpleadosPrototype Maria = contexto.getBean("miSecretarioEmpleadosPrototype", SecretarioEmpleadosPrototype.class); // * Obtener el bean
																																	 // miSecretarioEmpleadosPrototype y
																																	 // asignarlo a Maria
		SecretarioEmpleadosPrototype Pepe = contexto.getBean("miSecretarioEmpleadosPrototype", SecretarioEmpleadosPrototype.class); // * Obtener el bean
																																	 // miSecretarioEmpleadosPrototype y
																																	 // asignarlo a Pepe

		System.out.println("********* Ejemplo de Patrón Prototype ********* :");
		System.out.println("Maria Dirección de memoria ==> " + Maria); // * Imprimir la dirección de memoria de Maria
		System.out.println("Pepe Dirección de memoria ==> " + Pepe); // * Imprimir la dirección de memoria de Pepe
		System.out.println();
		System.out.println("Maria hashCode ==> " + Maria.hashCode()); // * Imprimir el hashCode de Maria
		System.out.println("Pepe hashCode ==> " + Pepe.hashCode()); // * Imprimir el hashCode de Pepe

		/*
		 * La inversión de control es un (patrón de programación) que consiste en delegar el control
		 * del flujo de un programa a un contenedor o framework. Esto permite desacoplar
		 * los componentes de una aplicación y facilitar su prueba y mantenimiento.
		 * Un ejemplo de inversión de control es el uso de interfaces gráficas que manejan los eventos
		 * del usuario y llaman a los métodos apropiados del programa.
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
		 * despliegue de las aplicaciones, mediante el uso de autoconfiguración y convenciones sobre configuración.
		 */
	}
}
