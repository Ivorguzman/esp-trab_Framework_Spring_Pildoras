package es.pildorasIoC.AnnotationsConfiguration; // * Declaración del paquete al que pertenece esta interfaz

import org.springframework.stereotype.Component; // * Importación de la anotación @Component de Spring para la detección automática de beans

// Marca esta interfaz como un componente de Spring
@Component // * Indica que esta interfaz es un componente gestionado por Spring
public interface CreacionInformeFinanciero { // * Declaración de la interfaz CreacionInformeFinanciero

	// Método para obtener el informe financiero
	public String getInformeFinanciero(); // * Declaración del método getInformeFinanciero que deberá ser implementado por las clases que implementen esta interfaz

}
