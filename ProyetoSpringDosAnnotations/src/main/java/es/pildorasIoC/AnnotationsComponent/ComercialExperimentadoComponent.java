package es.pildorasIoC.AnnotationsComponent;

import org.springframework.stereotype.Component;


/*
 * @Component es una anotación de nivel de clase que le permite a Spring
 * detectar automáticamente nuestros beans personalizados.
 * En otras palabras, sin tener que escribir ningún código explícito, Spring hará lo siguiente:
 * 01 Escaneará nuestra aplicación en busca de clases anotadas con @Component
 * 02 Las instanciará e inyectará las dependencias especificadas en ellas
 * 03 Las inyectará donde sea necesario
 */


// @Component("Experimentado") Se espesifica el id del bean como: "Experimentado". Primer parametro del metodo getBean("Experimentado",...)

@Component // Sin espesificar el id registra el bean con el nombre de la la clase en minuscula
public class ComercialExperimentadoComponent implements Empleados {

	@Override public String getTareas() {
		// TODO Esbozo de método generado automáticamente

		return "Gran volumen de vetas de alta facturación";
	}

	@Override public String getInformes() {
		// TODO Esbozo de método generado automáticamente
		return "Informe generado por el comercial";
	}

}














