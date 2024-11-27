package es.pildorasIoC.AnnotationsCicloVidaDelBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;




public class MainUsoAnnotationCicloVidaDelBean {

	public static void main(String[] args) {


		// *********** 01 leer el xml de configuración ********
		ClassPathXmlApplicationContext contextoAnnotation = new ClassPathXmlApplicationContext("aplicacionContexAnnotationCicloVidaDelBean.xml");




		// ********** 02 pedir bean al contenedor ***********
		// Cuando se utiliza la anotación con atributo:[ @Component("Experimentado") ]
		/* Empleados antonio = contextoAnnotation.getBean("Experimentado", Empleados.class) */

		// Cuando se utiliza la anotacion sin atributa: @Component() [nombre de la clase en minuscula ==> "comercialExperimentadoAutowired"]
		// Empleados antonio = contextoAnnotation.getBean("ComercialExperimentadoAutowired", Empleados.class);
		Empleados antonio = contextoAnnotation.getBean("comercialExperimentadoCicloVidaBean", Empleados.class);
		Empleados lucia = contextoAnnotation.getBean("comercialExperimentadoCicloVidaBean", Empleados.class);





		// System.out.println(antonio.getTareas());
		// System.out.println(antonio.getInformes());



		// **************** PATRON Singleton ****************
		// ********* Usar el bean ***********
		if (antonio.hashCode() == lucia.hashCode()){

			System.out.println("*********** Ejemplo de Patron Singleton  *************** :");
			System.out.println("Apuntan al la misma dirección de memoria");
			System.out.println();
			System.out.println("antonio Dirección de memoria ==> " + antonio);
			System.out.println("lucia Dirección de memoria ==> " + lucia);
			System.out.println();
			System.out.println("antonio hashCode ==> " + antonio.hashCode());
			System.out.println("lucia hashCode  ==> " + lucia.hashCode());
			System.out.println();
			System.out.println();
			System.out.println();
		}




		// **************** PATRON Prototype ****************
			// ********* Usar el bean ***********
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

		contextoAnnotation.close();
	}
}


























