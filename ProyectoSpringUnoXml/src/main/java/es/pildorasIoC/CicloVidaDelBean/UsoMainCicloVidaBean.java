package es.pildorasIoC.CicloVidaDelBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoMainCicloVidaBean {


	public static void main(String[] args) {




		// ********************USO DE SPRING FRAME WORK *****************


		/*
		 * ClassPathXmlApplicationContext("....") es una implementación
		 * de la interfaz ApplicationContext que carga un archivo XML
		 * de configuración de Spring desde el classpath del proyecto.
		 * El classpath es el conjunto de rutas donde se buscan
		 * las clases y los recursos que necesita el programa.
		 */
		// Paso 1 Crear contexto(Cargar archivo XML)
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContextCicloVidaBean.xml");

		// Paso 2 crear el Bean
		/*
		 * El método getBean() es una forma de obtener una instancia de un bean
		 * que está registrado en el contenedor de Spring.
		 */

		System.out.println(contexto.toString());
		System.out.println(contexto.getDisplayName());
		System.out.println();


		DirectorEmpleado Juan = contexto.getBean("miEmpleado", DirectorEmpleado.class);


		// Paso 3 Utilizar el Bean para injeccion de constructor (interface Empleados )
		System.out.println("Empleado Juan " + Juan.getTareas());
		System.out.println("Empleado Juan " + Juan.getInformes());
		System.out.println("Empleado Juan Empresa: " + Juan.getEmpresa());
		System.out.println("Empleada Juan  Correo: " + Juan.getCorreo());
		System.out.println(Juan.toString());
		System.out.println();
		System.out.println();

		// Paso 4 Cerrar el XML
		contexto.close();

	}


	@Override public String toString() {
		return "UsoMainEmpleados [getClass()=" + this.getClass() + ", hashCode()=" + this.hashCode() + ", toString()=" + super.toString() + "]";
	}
	

	
	
	
	

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
