package es.pildorasIoC.AnnotationsQualifier; // * Declaración del paquete al que pertenece esta clase

import org.springframework.context.support.ClassPathXmlApplicationContext; // * Importación de la clase ClassPathXmlApplicationContext de Spring para cargar el contexto de la
																			 // aplicación desde un archivo XML

public class MainUsoAnnotationQualifier { // * Declaración de la clase MainUsoAnnotationQualifier

	public static void main(String[] args) { // * Método principal de la aplicación

		// *********** 01 leer el xml de configuración ********
		ClassPathXmlApplicationContext contextoAnnotation = new ClassPathXmlApplicationContext("aplicacionContexAnnotationQualifier.xml"); // * Crear el contexto de la
																																			 // aplicación a partir del
																																			 // archivo XML de configuración

		// ********** 02 pedir bean al contenedor ***********
		// Cuando se utiliza la anotación con atributo: @Component("Experimentado")
		/* Empleados antonio = contextoAnnotation.getBean("Experimentado", Empleados.class) */

		// Cuando se utiliza la anotación sin atributo: @Component() [nombre de la clase en minúscula ==> "comercialExperimentadoAutowired"]
		// Empleados antonio = contextoAnnotation.getBean("ComercialExperimentadoAutowired", Empleados.class);
		Empleados antonio = contextoAnnotation.getBean("comercialExperimentadoQualifier", Empleados.class); // * Obtener el bean del contenedor de Spring

		// ********* 03 Usar el bean ***********
		System.out.println(antonio.getTareas()); // * Usar el bean para obtener y mostrar las tareas de Antonio

		System.out.println(antonio.getInformes()); // * Usar el bean para obtener y mostrar los informes de Antonio

		// *********** 04 Cerrar el contexto ***********
		contextoAnnotation.close(); // * Cerrar el contexto de la aplicación para liberar recursos
	}
}
