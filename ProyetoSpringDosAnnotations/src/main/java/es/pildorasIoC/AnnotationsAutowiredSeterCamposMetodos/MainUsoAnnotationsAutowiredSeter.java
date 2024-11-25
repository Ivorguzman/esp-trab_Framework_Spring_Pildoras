package es.pildorasIoC.AnnotationsAutowiredSeterCamposMetodos;

// Importamos la clase para el contexto de aplicación basado en XML de Spring.
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainUsoAnnotationsAutowiredSeter {

	public static void main(String[] args) {

		// *********** 01 leer el xml de configuración ********
		// Creamos un contexto de aplicación Spring leyendo el archivo XML de configuración.
		ClassPathXmlApplicationContext contextoAnnotation = new ClassPathXmlApplicationContext("aplicacionContexAnnotationAutowiredSeter.xml");

		// ********** 02 pedir bean al contenedor ***********
		// Cuando se utiliza la anotación con atributo: @Component("Experimentado")
		// Empleados antonio = contextoAnnotation.getBean("Experimentado", Empleados.class)

		// Cuando se utiliza la anotacion sin atributo: @Component()
		// (nombre de la clase en minúsculas ==> "comercialExperimentadoAutowired").
		// Aquí obtenemos el bean de tipo Empleados del contenedor Spring usando el nombre del bean en minúsculas.
		Empleados antonio = contextoAnnotation.getBean("comercialExperimentadoAutowired", Empleados.class);

		// Obtenemos el bean de tipo InformePatrimonial del mismo nombre.
		InformePatrimonial pedro = contextoAnnotation.getBean("comercialExperimentadoAutowired", InformePatrimonial.class);

		// ********* 03 Usar el bean ***********
		// Imprimimos las tareas del empleado 'antonio'.
		System.out.println("Antonio = " + antonio.getTareas());

		// Imprimimos los informes generados por el empleado 'antonio'.
		System.out.println("Antonio = " + antonio.getInformes());

		// Imprimimos el patrimonio de 'pedro'.
		System.out.println("Pedro = " + pedro.getPatrimonio());

		// ********* 04 Cerrar Contexto ***********
		// Cerramos el contexto de la aplicación para liberar recursos.
		contextoAnnotation.close();

		/*
		 * La inversión de control es un patrón de programación que consiste en delegar el control
		 * del flujo de un programa a un contenedor o framework. Esto permite desacoplar
		 * los componentes de una aplicación y facilitar su prueba y mantenimiento.
		 * Un ejemplo de inversión de control es el uso de interfaces gráficas que manejan los eventos
		 * del usuario y llaman a los métodos apropiados del programa.
		 * 
		 * La inyección de dependencias es un tipo específico de inversión de control
		 * que consiste en proveer a una clase los objetos que necesita para realizar sus funciones,
		 * en lugar de crearlos dentro de la misma clase. Esto permite que la clase
		 * sea más flexible y reutilizable, ya que puede trabajar con diferentes implementaciones de las
		 * dependencias. Un ejemplo de inyección de dependencias es el uso de anotaciones como
		 *
		 * @Autowired o @Inject en Spring para indicar al contenedor qué beans debe inyectar
		 * en los campos o constructores de una clase.
		 * 
		 * Una dependencia es un módulo o biblioteca que proporciona una funcionalidad específica a la aplicación.
		 * 
		 * Spring es un framework de Java que facilita el desarrollo de aplicaciones empresariales
		 * mediante el uso de inversión de control e inyección de dependencias.
		 * Spring ofrece varios módulos para integrar diferentes tecnologías como web,
		 * datos, seguridad, etc. Spring Boot es una extensión de Spring que simplifica la configuración y el
		 * despliegue de las aplicaciones, mediante el uso de autoconfiguración y convenciones sobre configuración.
		 */

		/**
		 * Hola, este es Bing. Estoy aquí para ayudarte. 😊
		 * 
		 * El mensaje de error `No bean named 'comercialExperimentadoAutowired' available` significa que el contenedor de Spring no puede encontrar una definición
		 * de bean para el nombre dado. Un bean es un objeto que es gestionado por el contenedor de Spring y que puede ser usado por otros componentes
		 * en la aplicación. Hay varias posibles razones por las que este error puede ocurrir, como:
		 * 
		 * - El bean no está anotado con `@Component`, `@Controller`, `@Service`, o `@Repository`, que son las anotaciones que le dicen a Spring
		 * que cree y registre un bean para la clase.
		 * - El bean está en un paquete diferente al de la clase principal de la aplicación,
		 * y el paquete no es escaneado por Spring. Por defecto, Spring escanea el paquete actual y los subpaquetes donde la clase principal
		 * de la aplicación está anotada con `@SpringBootApplication`. Si quieres escanear otros paquetes, necesitas especificarlos
		 * en el atributo `scanBasePackages` de la anotación.
		 * - El bean está definido en un archivo de configuración XML, pero el archivo no es cargado por el contenedor de Spring.
		 * Necesitas asegurarte de que el archivo XML está en el classpath y que usas `@ImportResource` o `@Configuration` para cargarlo.
		 */
	}
}
