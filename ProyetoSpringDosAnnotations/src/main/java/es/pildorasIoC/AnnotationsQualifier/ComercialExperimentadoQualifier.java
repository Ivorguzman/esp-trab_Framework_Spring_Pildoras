package es.pildorasIoC.AnnotationsQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
public class ComercialExperimentadoQualifier implements Empleados {



	// @Autowired // Injeccón de dependencia con campo de clase
	private CreacionInformeFinanciero nuevoInforme;


	@Qualifier("informeFinacieroTrimestre1") // Indica que clase injectar
	@Autowired // Injeccón de dependencia con metodo seters
	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}




	/*
	 * @Autowired // Injeccón de dependencia con un metodo cualquiera
	 * public void obtenerNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
	 * this.nuevoInforme = nuevoInforme;
	 * }
	 */




	@Override public String getTareas() {
		return "Gran volumen de vetas de alta facturación";
	}

	@Override public String getInformes() {
		// return "Informe generado por el comercial";
		return this.nuevoInforme.getInformeFinaciero();

	}



}

















