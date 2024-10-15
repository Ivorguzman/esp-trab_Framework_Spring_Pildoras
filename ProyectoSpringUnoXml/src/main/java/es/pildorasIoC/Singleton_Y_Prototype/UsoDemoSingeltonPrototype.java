package es.pildorasIoC.Singleton_Y_Prototype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingeltonPrototype {

	public static void main(String[] args) {



		// 01 cargar xml de configuración
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContextPatrones.xml");


		// O2 Creacion de bean(s) con metodo getBean("...") contenedor de Spring


		// **************** PATRON SINGLETON ****************
		// bean 01
		SecretarioEmpleadosSingLeton Maria2 = contexto.getBean("miSecretarioEmpleadosSingLeton", SecretarioEmpleadosSingLeton.class);
		SecretarioEmpleadosSingLeton Pepe2 = contexto.getBean("miSecretarioEmpleadosSingLeton", SecretarioEmpleadosSingLeton.class);

		System.out.println("*********** Ejemplo de Patron SingLeton *************** :");
		System.out.println("Maria2 Dirección de memoria ==> " + Maria2);
		System.out.println("Pepe2 Dirección de memoria ==> " + Pepe2);
		System.out.println();
		System.out.println("Maria2 hashCode ==> " + Maria2.hashCode());
		System.out.println("Pepe2 hashCode  ==> " + Pepe2.hashCode());
		System.out.println();
		System.out.println();
		System.out.println();



		// **************** PATRON PROTOTYPE ****************
		// bean 02
		SecretarioEmpleadosPrototype Maria = contexto.getBean("miSecretarioEmpleadosPrototype", SecretarioEmpleadosPrototype.class);
		SecretarioEmpleadosPrototype Pepe = contexto.getBean("miSecretarioEmpleadosPrototype", SecretarioEmpleadosPrototype.class);


		System.out.println("********* Ejemplo de Patron Prototype ********* :");
		System.out.println("Maria Dirección de memoria ==> " + Maria);
		System.out.println("Pepe Dirección de memoria ==> " + Pepe);
		System.out.println();
		System.out.println("Maria hashCode ==> " + Maria.hashCode());
		System.out.println("Pepe hashCode  ==> " + Pepe.hashCode());


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
		 * NOTA: [Una dependencia en es un módulo o biblioteca que proporciona una funcionalidad específica a la aplicación]
		 * 
		 *
		 * Spring es un framework de Java que facilita el desarrollo de aplicaciones empresariales
		 * mediante el uso de inversión de control inyección de dependencias.
		 * Spring ofrece varios módulos para integrar diferentes tecnologías como web,
		 * datos, seguridad, etc. Spring Boot es una extensión de Spring que simplifica la configuración y el
		 * despliegue de las aplicaciones, mediante el uso de autoconfiguración y convenciones sobre configuración³.
		 */



	}

}
