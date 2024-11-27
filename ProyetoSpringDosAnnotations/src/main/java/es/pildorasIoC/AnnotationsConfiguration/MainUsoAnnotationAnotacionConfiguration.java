package es.pildorasIoC.AnnotationsConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainUsoAnnotationAnotacionConfiguration {

	public static void main(String[] args) {
		// Crea el contexto de aplicación basado en la configuración de Java
		AnnotationConfigApplicationContext contextoAnnotation = new AnnotationConfigApplicationContext(ConfiguracionBeans.class);

		// Solicita el bean "comercialExperimentadoAnotacionConfiguration" del contexto
		Empleados antonio = contextoAnnotation.getBean("comercialExperimentadoAnotacionConfiguration", Empleados.class);
		Empleados lucia = contextoAnnotation.getBean("comercialExperimentadoAnotacionConfiguration", Empleados.class);

		// Solicita el bean "directorFinanciero" del contexto
		Empleados pedro = contextoAnnotation.getBean("directorFinanciero", Empleados.class);

		// Verifica si los beans son singleton (apuntan a la misma dirección de memoria)
		if (antonio.hashCode() == lucia.hashCode()){
			System.out.println("*********** Ejemplo de Patron Singleton  *************** :");
			System.out.println("Apuntan al la misma dirección de memoria");
			System.out.println();
			System.out.println("Antonio: Dirección de memoria ==> " + antonio);
			System.out.println("Lucia: Dirección de memoria ==> " + lucia);
			System.out.println();
			System.out.println("Antonio: hashCode ==> " + antonio.hashCode());
			System.out.println("Lucia   hashCode ==> " + lucia.hashCode());
			System.out.println();
			System.out.println("Pedro: Informe Compras ==> " + pedro.getInformes());
		}

		// Verifica si los beans son prototype (no apuntan a la misma dirección de memoria)
		if (antonio.hashCode() != lucia.hashCode()){
			System.out.println("*********** Ejemplo de Patron Prototype *************** :");
			System.out.println("No apuntan al la misma dirección de memoria");
			System.out.println();
			System.out.println("Antonio Dirección de memoria ==> " + antonio);
			System.out.println("Lucia Dirección de memoria ==> " + lucia);
			System.out.println();
			System.out.println("Antonio hashCode ==> " + antonio.hashCode());
			System.out.println("Lucia hashCode  ==> " + lucia.hashCode());
		}

		// Cierra el contexto de Spring
		contextoAnnotation.close();
	}
}
