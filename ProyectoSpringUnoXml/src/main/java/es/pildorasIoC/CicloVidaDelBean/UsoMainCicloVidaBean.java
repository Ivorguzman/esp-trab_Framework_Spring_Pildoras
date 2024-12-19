package es.pildorasIoC.CicloVidaDelBean; // * Declaración del paquete al que pertenece esta clase

import org.springframework.context.support.ClassPathXmlApplicationContext; // * Importación de la clase ClassPathXmlApplicationContext de Spring

public class UsoMainCicloVidaBean { // * Declaración de la clase UsoMainCicloVidaBean

	public static void main(String[] args) { // * Método principal de la aplicación

		// ******************** USO DE SPRING FRAMEWORK *****************

		/*
		 * ClassPathXmlApplicationContext("....") es una implementación
		 * de la interfaz ApplicationContext que carga un archivo XML
		 * de configuración de Spring desde el classpath del proyecto.
		 * El classpath es el conjunto de rutas donde se buscan
		 * las clases y los recursos que necesita el programa.
		 */

		// * Paso 1: Crear contexto (Cargar archivo XML)
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContextCicloVidaBean.xml"); // * Crear contexto usando
																															 // applicationContextCicloVidaBean.xml

		// * Paso 2: Crear el Bean
		/*
		 * El método getBean() es una forma de obtener una instancia de un bean
		 * que está registrado en el contenedor de Spring.
		 */

		System.out.println(contexto.toString()); // * Imprimir contexto
		System.out.println(contexto.getDisplayName()); // * Imprimir el nombre del contexto
		System.out.println();

		DirectorEmpleado Juan = contexto.getBean("miEmpleado", DirectorEmpleado.class); // * Obtener el bean miEmpleado y asignarlo a DirectorEmpleado Juan

		// * Paso 3: Utilizar el Bean para inyección de constructor (interface Empleados)
		System.out.println("Empleado Juan " + Juan.getTareas()); // * Imprimir tareas de Juan
		System.out.println("Empleado Juan " + Juan.getInformes()); // * Imprimir informes de Juan
		System.out.println("Empleado Juan Empresa: " + Juan.getEmpresa()); // * Imprimir nombre de la empresa de Juan
		System.out.println("Empleado Juan Correo: " + Juan.getCorreo()); // * Imprimir correo de Juan
		System.out.println(Juan.toString()); // * Imprimir detalles del objeto Juan
		System.out.println();
		System.out.println();

		// * Paso 4: Cerrar el XML
		contexto.close(); // * Cerrar el contexto

	}

	@Override
	public String toString() { // * Método toString para la clase UsoMainCicloVidaBean
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
