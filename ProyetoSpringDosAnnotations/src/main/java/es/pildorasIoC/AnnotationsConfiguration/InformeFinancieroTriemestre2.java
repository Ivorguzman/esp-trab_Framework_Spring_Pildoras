package es.pildorasIoC.AnnotationsConfiguration;

import org.springframework.stereotype.Component;

// Marca esta clase como un bean de Spring
@Component
public class InformeFinancieroTriemestre2 implements CreacionInformeFinanciero {

	// Implementa el método de la interfaz para devolver un informe
	@Override
	public String getInformeFinaciero() {
		return "Presentación de Informe Extremadamente exitos del trimestre 2 (AnnotationsQualifier)";
	}
}
