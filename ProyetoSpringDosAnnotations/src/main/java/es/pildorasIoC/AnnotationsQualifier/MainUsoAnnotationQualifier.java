package es.pildorasIoC.AnnotationsQualifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainUsoAnnotationQualifier {

	public static void main(String[] args) {


		// *********** 01 leer el xml de configuración ********
		ClassPathXmlApplicationContext contextoAnnotation = new ClassPathXmlApplicationContext("aplicacionContexAnnotationQualifier.xml");




		// ********** 02 pedir bean al contenedor ***********
		// Cuando se utiliza la anotación con atributo:[ @Component("Experimentado") ]
		/* Empleados antonio = contextoAnnotation.getBean("Experimentado", Empleados.class) */

		// Cuando se utiliza la anotacion sin atributa: @Component() [nombre de la clase en minuscula ==> "comercialExperimentadoAutowired"]
		// Empleados antonio = contextoAnnotation.getBean("ComercialExperimentadoAutowired", Empleados.class);
		Empleados antonio = contextoAnnotation.getBean("comercialExperimentadoQualifier", Empleados.class);






		// ********* 03 Usar el bean ***********

		System.out.println(antonio.getTareas());

		System.out.println(antonio.getInformes());




		// 03 Cerrar Contexto

		contextoAnnotation.close();

















	}

}
