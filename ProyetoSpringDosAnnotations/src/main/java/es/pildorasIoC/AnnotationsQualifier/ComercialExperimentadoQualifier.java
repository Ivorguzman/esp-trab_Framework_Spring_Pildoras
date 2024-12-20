package es.pildorasIoC.AnnotationsQualifier; // * Declaración del paquete al que pertenece esta clase

import org.springframework.beans.factory.annotation.Autowired; // * Importación de la anotación @Autowired de Spring para la inyección automática de dependencias
import org.springframework.beans.factory.annotation.Qualifier; // * Importación de la anotación @Qualifier de Spring para especificar la implementación del bean a inyectar
import org.springframework.stereotype.Component; // * Importación de la anotación @Component de Spring para la detección automática de beans

/*
 * @Component es una anotación de nivel de clase que le permite a Spring
 * detectar automáticamente nuestros beans personalizados.
 * En otras palabras, sin tener que escribir ningún código explícito, Spring hará lo siguiente:
 * 01 Escaneará nuestra aplicación en busca de clases anotadas con @Component
 * 02 Las instanciará e inyectará las dependencias especificadas en ellas
 * 03 Las inyectará donde sea necesario
 */

// @Component("ComercialExperimentadoAutowired")
@Component // * Sin especificar el id, registra el bean con el nombre de la clase en minúscula
public class ComercialExperimentadoQualifier implements Empleados { // * Declaración de la clase ComercialExperimentadoQualifier que implementa la interfaz Empleados

	// @Autowired // Inyección de dependencia con campo de clase
	private CreacionInformeFinanciero nuevoInforme; // * Campo privado para almacenar la instancia de CreacionInformeFinanciero

	// @Qualifier("informeFinancieroTrimestre1") // Indica qué clase inyectar
	@Qualifier("informeFinancieroTrimestre2") // * Indica qué clase inyectar
	// @Qualifier("informeFinancieroTrimestre3") // Indica qué clase inyectar
	@Autowired // * Inyección de dependencia con método setter
	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) { // * Método setter para inyectar la dependencia
		this.nuevoInforme = nuevoInforme; // * Asignación del valor del parámetro al campo nuevoInforme
	}

	/*
	 * @Autowired // Inyección de dependencia con un método cualquiera
	 * public void obtenerNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
	 * this.nuevoInforme = nuevoInforme;
	 * }
	 */

	@Override
	public String getTareas() { // * Implementación del método getTareas de la interfaz Empleados
		return "Gran volumen de ventas de alta facturación"; // * Retorna la descripción de las tareas del empleado
	}

	@Override
	public String getInformes() { // * Implementación del método getInformes de la interfaz Empleados
		// return "Informe generado por el comercial";
		return this.nuevoInforme.getInformeFinanciero(); // * Retorna el informe generado por la dependencia CreacionInformeFinanciero
	}
}
