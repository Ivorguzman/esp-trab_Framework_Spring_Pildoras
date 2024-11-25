package es.pildorasIoC.AnnotationsSingletosPrototype;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTriemestre2 implements CreacionInformeFinanciero {

	@Override public String getInformeFinaciero() {
		// TODO Esbozo de método generado automáticamente
		return "Presentación de Informe Extremadamente exitos del trimestre 2 (AnnotationsQualifier)";
	}

}
