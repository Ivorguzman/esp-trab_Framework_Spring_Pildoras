package es.pildorasIoC.AnnotationsConfiguration;

import org.springframework.stereotype.Component;

// Marca esta interfaz como un componente de Spring
@Component
public interface CreacionInformeFinanciero {

	// Método para obtener el informe financiero
	public String getInformeFinaciero();
}
