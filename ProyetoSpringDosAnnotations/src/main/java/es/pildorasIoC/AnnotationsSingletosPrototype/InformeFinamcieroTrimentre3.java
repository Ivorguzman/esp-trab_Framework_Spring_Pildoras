package es.pildorasIoC.AnnotationsSingletosPrototype;

import org.springframework.stereotype.Component;

@Component
public class InformeFinamcieroTrimentre3 implements CreacionInformeFinanciero {

	@Override public String getInformeFinaciero() {
		// TODO Esbozo de método generado automáticamente
		return "Presentacion de Iforme de Gastos operativos trimestre 3";
	}

}
