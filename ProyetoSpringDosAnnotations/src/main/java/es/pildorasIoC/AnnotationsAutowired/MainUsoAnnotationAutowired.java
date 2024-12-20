package es.pildorasIoC.AnnotationsAutowired; // * Declaración del paquete al que pertenece esta clase

import org.springframework.context.support.ClassPathXmlApplicationContext; // * Importación de la clase ClassPathXmlApplicationContext de Spring para cargar el contexto de la
																			 // aplicación desde un archivo XML

public class MainUsoAnnotationAutowired { // * Declaración de la clase MainUsoAnnotationAutowired

	public static void main(String[] args) { // * Método principal de la aplicación

		// *********** 01 leer el xml de configuración ********
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("aplicacionContexAnnotationAutowired.xml"); // * Crear el contexto de la aplicación a
																																 // partir del archivo XML de configuración

		// ********** 02 pedir bean al contenedor ***********
		// Cuando se utiliza la anotación con atributo: @Component("Experimentado")
		/* Empleados antonio = contextoAnnotation.getBean("Experimentado", Empleados.class) */

		// Cuando se utiliza la anotación sin atributo: @Component() [nombre de la clase en minúscula ==> "comercialExperimentadoAutowired"]
		// Empleados antonio = contextoAnnotation.getBean("ComercialExperimentadoAutowired", Empleados.class);
		// Empleados antonio = contextoAnnotation.getBean("comercialExperimentadoAutowired", Empleados.class);
		Empleados antonio = contexto.getBean("Experimentado", Empleados.class); // * Obtener el bean del contenedor de Spring

		// ********* 03 Usar el bean ***********
		System.out.println("Antonio = " + antonio.getTareas()); // * Usar el bean para obtener y mostrar las tareas de Antonio
		System.out.println("Antonio = " + antonio.getInformes()); // * Usar el bean para obtener y mostrar los informes de Antonio

		// ********* NOTA: Sin Usar Spring ***********
		InformeFinancieroTrimestre1 informeFinanciero = new InformeFinancieroTrimestre1(); // * Crear una instancia de InformeFinancieroTrimestre1
		ComercialExperimentadoAutowired pedro = new ComercialExperimentadoAutowired(informeFinanciero); // * Crear una instancia de ComercialExperimentadoAutowired inyectando
																										 // la dependencia manualmente

		System.out.println("Pedro = " + pedro.getTareas()); // * Usar la instancia de pedro para obtener y mostrar las tareas de Pedro
		System.out.println("Pedro = " + pedro.getInformes()); // * Usar la instancia de pedro para obtener y mostrar los informes de Pedro

		// 03 Cerrar Contexto
		contexto.close(); // * Cerrar el contexto de la aplicación

	}

}
