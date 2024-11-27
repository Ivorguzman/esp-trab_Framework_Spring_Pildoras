package es.pildorasIoC.AnnotationsConfiguration;

import org.springframework.stereotype.Component;

// Marca esta clase como un bean de Spring
@Component
public class InformeFinamcieroTrimentre3 implements CreacionInformeFinanciero {

	// Implementa el método de la interfaz para devolver un informe
	@Override
	public String getInformeFinaciero() {
		return "Presentacion de Iforme de Gastos operativos trimestre 3";
	}
}
