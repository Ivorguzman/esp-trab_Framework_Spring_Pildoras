package es.pildorasIoC.AnnotationsAutowiredSeterCamposMetodos;

// Importamos la anotación @Autowired de Spring para la inyección de dependencias.
import org.springframework.beans.factory.annotation.Autowired;
// Importamos la anotación @Component de Spring para marcar esta clase como un bean gestionado por Spring.
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
@Component // Sin especificar el id, registra el bean con el nombre de la clase en minúsculas.
public class ComercialExperimentadoAutowired implements Empleados, InformePatrimonial {

	// Variable para almacenar la dependencia inyectada de InformePatrimonial.
	private InformePatrimonial patrimonio;

	// Variable para almacenar la dependencia inyectada de CreacionInformeFinanciero.
	private CreacionInformeFinanciero informeFinanciero;

	// Inyección de dependencia con setters (IoC).
	@Autowired
	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
		// Asignamos la dependencia inyectada a la variable de instancia.
		this.informeFinanciero = nuevoInforme;
	}

	// Inyección de dependencia con un método cualquiera (IoC).
	@Autowired
	public void obtenerNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
		// Asignamos la dependencia inyectada a la variable de instancia.
		this.informeFinanciero = nuevoInforme;
	}

	// Inyección de dependencia con método cualquiera (IoC).
	@Autowired
	public void Patrimonio(InformePatrimonial patrimonio) {
		// Asignamos la dependencia inyectada a la variable de instancia.
		this.patrimonio = patrimonio;
	}

	// Método sobrescrito de la interfaz Empleados para devolver las tareas del empleado.
	@Override
	public String getTareas() {
		// Retornamos una descripción de las tareas del comercial experimentado.
		return "Gran volumen de ventas de alta facturación";
	}

	// Método sobrescrito de la interfaz Empleados para devolver informes generados por el comercial.
	@Override
	public String getInformes() {
		// Utilizamos la dependencia inyectada para generar y mostrar el informe financiero.
		return this.informeFinanciero.getInformeFinaciero();
	}

	// Método sobrescrito de la interfaz InformePatrimonial para devolver el patrimonio.
	@Override
	public String getPatrimonio() {
		// Utilizamos la dependencia inyectada para obtener y mostrar el patrimonio.
		return this.patrimonio.getPatrimonio();
	}
}
