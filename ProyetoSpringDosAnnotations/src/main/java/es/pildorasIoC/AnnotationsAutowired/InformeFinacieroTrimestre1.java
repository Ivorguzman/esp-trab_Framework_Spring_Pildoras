package es.pildorasIoC.AnnotationsAutowired;

import org.springframework.stereotype.Component;

@Component
public class InformeFinacieroTrimestre1 implements CreacionInformeFinanciero {


	@Override public String getInformeFinaciero() {
		return "Presentación del informe financiero trimeste 1(AnnotationsAutowired)";
	}


}
