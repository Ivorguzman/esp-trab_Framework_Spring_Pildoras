package es.pildorasIoC.AnnotationsCicloVidaDelBean; // * Declaración del paquete al que pertenece esta clase

import org.springframework.context.support.ClassPathXmlApplicationContext; // * Importación de la clase ClassPathXmlApplicationContext de Spring para cargar el contexto de la
																			 // aplicación desde un archivo XML

public class MainUsoAnnotationCicloVidaDelBean { // * Declaración de la clase MainUsoAnnotationCicloVidaDelBean

	public static void main(String[] args) { // * Método principal de la aplicación

		// *********** 01 leer el xml de configuración ********
		ClassPathXmlApplicationContext contextoAnnotation = new ClassPathXmlApplicationContext("aplicacionContexAnnotationCicloVidaDelBean.xml"); // * Crear el contexto de la
																																					 // aplicación a partir
																																					 // del archivo XML de
																																					 // configuración

		// ********** 02 pedir bean al contenedor ***********
		// Cuando se utiliza la anotación con atributo: @Component("Experimentado")
		/* Empleados antonio = contextoAnnotation.getBean("Experimentado", Empleados.class) */

		// Cuando se utiliza la anotación sin atributo: @Component() [nombre de la clase en minúscula ==> "comercialExperimentadoAutowired"]
		// Empleados antonio = contextoAnnotation.getBean("ComercialExperimentadoAutowired", Empleados.class);
		Empleados antonio = contextoAnnotation.getBean("comercialExperimentadoCicloVidaBean", Empleados.class); // * Obtener el bean del contenedor de Spring
		Empleados lucia = contextoAnnotation.getBean("comercialExperimentadoCicloVidaBean", Empleados.class); // * Obtener otro bean del contenedor de Spring

		// ********* Usar el bean ***********
		// System.out.println(antonio.getTareas());
		// System.out.println(antonio.getInformes());

		// **************** PATRON Singleton ****************
		if (antonio.hashCode() == lucia.hashCode()){ // * Comparar si ambos beans apuntan a la misma dirección de memoria
			System.out.println("*********** Ejemplo de Patrón Singleton *************** :");
			System.out.println("Apuntan a la misma dirección de memoria");
			System.out.println();
			System.out.println("Antonio Dirección de memoria ==> " + antonio);
			System.out.println("Lucia Dirección de memoria ==> " + lucia);
			System.out.println();
			System.out.println("Antonio hashCode ==> " + antonio.hashCode());
			System.out.println("Lucia hashCode  ==> " + lucia.hashCode());
			System.out.println();
		}

		// **************** PATRON Prototype ****************
		if (antonio.hashCode() != lucia.hashCode()){ // * Comparar si ambos beans apuntan a diferentes direcciones de memoria
			System.out.println("*********** Ejemplo de Patrón Prototype *************** :");
			System.out.println("No apuntan a la misma dirección de memoria");
			System.out.println();
			System.out.println("Antonio Dirección de memoria ==> " + antonio);
			System.out.println("Lucia Dirección de memoria ==> " + lucia);
			System.out.println();
			System.out.println("Antonio hashCode ==> " + antonio.hashCode());
			System.out.println("Lucia hashCode  ==> " + lucia.hashCode());
		}

		// Cerrar el contexto de la aplicación
		contextoAnnotation.close(); // * Cerrar el contexto de la aplicación para liberar recursos
	}
}
