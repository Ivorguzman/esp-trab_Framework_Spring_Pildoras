package es.pildorasIoC.AnnotationsConfiguration; // * Declaración del paquete al que pertenece esta clase

import org.springframework.context.annotation.AnnotationConfigApplicationContext; // * Importación de la clase AnnotationConfigApplicationContext de Spring para cargar el
																					 // contexto de la aplicación basado en configuración de Java

public class MainUsoAnnotationAnotacionConfiguration { // * Declaración de la clase MainUsoAnnotationAnotacionConfiguration

	public static void main(String[] args) { // * Método principal de la aplicación

		// Crea el contexto de aplicación basado en la configuración de Java
		AnnotationConfigApplicationContext contextoAnnotation = new AnnotationConfigApplicationContext(ConfiguracionBeans.class); // * Crear el contexto de la aplicación a
																																	 // partir de la clase de configuración

		// Solicita el bean "comercialExperimentadoAnotacionConfiguration" del contexto
		Empleados antonio = contextoAnnotation.getBean("comercialExperimentadoAnotacionConfiguration", Empleados.class); // * Obtener el bean del contenedor de Spring
		Empleados lucia = contextoAnnotation.getBean("comercialExperimentadoAnotacionConfiguration", Empleados.class); // * Obtener otro bean del contenedor de Spring

		// Solicita el bean "directorFinanciero" del contexto
		Empleados pedro = contextoAnnotation.getBean("directorFinanciero", Empleados.class); // * Obtener el bean del contenedor de Spring

		// Verifica si los beans son singleton (apuntan a la misma dirección de memoria)
		if (antonio.hashCode() == lucia.hashCode()){ // * Comparar si ambos beans apuntan a la misma dirección de memoria
			System.out.println("*********** Ejemplo de Patrón Singleton *************** :");
			System.out.println("Apuntan a la misma dirección de memoria");
			System.out.println();
			System.out.println("Antonio: Dirección de memoria ==> " + antonio);
			System.out.println("Lucia: Dirección de memoria ==> " + lucia);
			System.out.println();
			System.out.println("Antonio: hashCode ==> " + antonio.hashCode());
			System.out.println("Lucia: hashCode ==> " + lucia.hashCode());
			System.out.println();
			System.out.println("Pedro: Informe Compras ==> " + pedro.getInformes());
		}

		// Verifica si los beans son prototype (no apuntan a la misma dirección de memoria)
		if (antonio.hashCode() != lucia.hashCode()){ // * Comparar si ambos beans apuntan a diferentes direcciones de memoria
			System.out.println("*********** Ejemplo de Patrón Prototype *************** :");
			System.out.println("No apuntan a la misma dirección de memoria");
			System.out.println();
			System.out.println("Antonio: Dirección de memoria ==> " + antonio);
			System.out.println("Lucia: Dirección de memoria ==> " + lucia);
			System.out.println();
			System.out.println("Antonio: hashCode ==> " + antonio.hashCode());
			System.out.println("Lucia: hashCode ==> " + lucia.hashCode());
		}

		// Cierra el contexto de Spring
		contextoAnnotation.close(); // * Cerrar el contexto de la aplicación para liberar recursos
	}
}
