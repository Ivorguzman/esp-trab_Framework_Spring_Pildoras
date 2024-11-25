package es.pildorasIoC.AnnotationsAutowiredSeterCamposMetodos;

import org.springframework.stereotype.Component;

@Component
public class InformeFinacieroTrimestre1 implements CreacionInformeFinanciero, InformePatrimonial {


	@Override public String getInformeFinaciero() {
		return "Presentación del informe financiero trimeste 1(AnnotationsAutowiredSeter)";
	}

	@Override
	public String getPatrimonio() {
		// TODO Auto-generated method stub
		return "Presentación del informe Patimonial al Primer  trimeste";
	}


}
