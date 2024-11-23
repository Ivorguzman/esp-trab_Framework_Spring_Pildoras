package es.pildorasIoC.AnnotationsAutowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainUsoAnnotationAutowired {

	public static void main(String[] args) {


		// *********** 01 leer el xml de configuración ********
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("aplicacionContexAnnotationAutowired.xml");





		// ********** 02 pedir bean al contenedor ***********
		// Cuando se utiliza la anotación con atributo:[ @Component("Experimentado") ]
		/* Empleados antonio = contextoAnnotation.getBean("Experimentado", Empleados.class) */

		// Cuando se utiliza la anotacion sin atributa: @Component() [nombre de la clase en minuscula ==> "comercialExperimentadoAutowired"]
		// Empleados antonio = contextoAnnotation.getBean("ComercialExperimentadoAutowired", Empleados.class);
		// Empleados antonio = contextoAnnotation.getBean("comercialExperimentadoAutowired", Empleados.class);
		Empleados antonio = contexto.getBean("Experimentado", Empleados.class);





		// ********* 03 Usar el bean ***********
		System.out.println("Antonio = " + antonio.getTareas());
		System.out.println("Antonio = " + antonio.getInformes());





		// ********* NOTA: Sin Usar Spring ***********
		InformeFinacieroTrimestre1 informeFinanciero = new InformeFinacieroTrimestre1();
		ComercialExperimentadoAutowired pedro = new ComercialExperimentadoAutowired(informeFinanciero);


		System.out.println("Pedro = " + pedro.getTareas());
		System.out.println("Pedro = " + pedro.getInformes());




		// 03 Cerrar Contexto

		contexto.close();

	}

}
