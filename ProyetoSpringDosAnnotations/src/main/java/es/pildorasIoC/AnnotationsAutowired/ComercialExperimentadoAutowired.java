package es.pildorasIoC.AnnotationsAutowired;

import org.springframework.stereotype.Component;


/*
 * @Component es una anotación de nivel de clase que le permite a Spring
 * detectar automáticamente nuestros beans personalizados.
 * En otras palabras, sin tener que escribir ningún código explícito, Spring hará lo siguiente:
 * 01 Escaneará nuestra aplicación en busca de clases anotadas con @Component
 * 02 Las instanciará e inyectará las dependencias especificadas en ellas
 * 03 Las inyectará donde sea necesario
 */



// @Component("ComercialExperimentadoAutowired")
@Component // Sin espesificar el id registra el bean con el nombre de la la clase en minuscula
public class ComercialExperimentadoAutowired implements Empleados {


	private CreacionInformeFinanciero nuevoInforme;

	public ComercialExperimentadoAutowired(CreacionInformeFinanciero nuevoIFinanciero) {

		this.nuevoInforme = nuevoIFinanciero;
	}




	@Override public String getTareas() {
		return "Gran volumen de vetas de alta facturación";
	}

	@Override public String getInformes() {
		// return "Informe generado por el comercial";
		return this.nuevoInforme.getInformeFinaciero();

	}



}

















