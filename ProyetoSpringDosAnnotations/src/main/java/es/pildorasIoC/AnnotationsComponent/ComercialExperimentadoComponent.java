package es.pildorasIoC.AnnotationsComponent; // * Declaración del paquete al que pertenece esta clase

import org.springframework.stereotype.Component; // * Importación de la anotación @Component de Spring para la detección automática de beans

/*
 * @Component es una anotación de nivel de clase que le permite a Spring
 * detectar automáticamente nuestros beans personalizados.
 * En otras palabras, sin tener que escribir ningún código explícito, Spring hará lo siguiente:
 * 01 Escaneará nuestra aplicación en busca de clases anotadas con @Component
 * 02 Las instanciará e inyectará las dependencias especificadas en ellas
 * 03 Las inyectará donde sea necesario
 */

// @Component("Experimentado") Se especifica el id del bean como: "Experimentado". Primer parámetro del método getBean("Experimentado",...)
@Component // * Sin especificar el id, registra el bean con el nombre de la clase en minúscula
public class ComercialExperimentadoComponent implements Empleados { // * Declaración de la clase ComercialExperimentadoComponent que implementa la interfaz Empleados

	@Override
	public String getTareas() { // * Implementación del método getTareas de la interfaz Empleados
		// TODO Esbozo de método generado automáticamente
		return "Gran volumen de ventas de alta facturación"; // * Retorna la descripción de las tareas del empleado
	}

	@Override
	public String getInformes() { // * Implementación del método getInformes de la interfaz Empleados
		// TODO Esbozo de método generado automáticamente
		return "Informe generado por el comercial"; // * Retorna la descripción del informe generado por el comercial
	}

}
