package es.pildorasIoC.AnnotationsConfiguration;

import org.springframework.stereotype.Component;

// Marca esta clase como un bean de Spring
@Component
public class InformeFinacieroTrimestre1 implements CreacionInformeFinanciero {

	// Implementa el método de la interfaz para devolver un informe
	@Override
	public String getInformeFinaciero() {
		return "Presentación del informe financiero trimeste 1";
	}
}
