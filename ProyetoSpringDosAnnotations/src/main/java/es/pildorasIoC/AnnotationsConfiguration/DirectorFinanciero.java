package es.pildorasIoC.AnnotationsConfiguration;

public class DirectorFinanciero implements Empleados {

	// Dependencia inyectada
	private CreacionInformeFinanciero informeFinancieroCompras;

	// Constructor que recibe la dependencia
	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		this.informeFinancieroCompras = informeFinanciero;
	}

	// Implementa el método de la interfaz para devolver las tareas
	@Override
	public String getTareas() {
		return "Gestion de las operaciónes financieras de la empresa";
	}

	// Implementa el método de la interfaz para devolver los informes
	@Override
	public String getInformes() {
		return this.informeFinancieroCompras.getInformeFinaciero();
	}
}
