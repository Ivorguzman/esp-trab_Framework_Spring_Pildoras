package es.pildorasIoC.AnnotationsConfiguration;

public class InformeFinancieroDtoCompras implements CreacionInformeFinanciero {

	// Implementa el método de la interfaz para devolver un informe
	@Override
	public String getInformeFinaciero() {
		return "Informe financiero del departamento de compras 2024";
	}
}
