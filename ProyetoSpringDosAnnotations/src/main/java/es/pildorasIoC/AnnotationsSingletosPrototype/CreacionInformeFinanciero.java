package es.pildorasIoC.AnnotationsSingletosPrototype; // * Declaración del paquete al que pertenece esta interfaz

import org.springframework.stereotype.Component; // * Importación de la anotación @Component de Spring para la detección automática de beans

@Component // * Indica que esta interfaz es un componente gestionado por Spring
public interface CreacionInformeFinanciero { // * Declaración de la interfaz CreacionInformeFinanciero

	public String getInformeFinanciero(); // * Declaración del método getInformeFinanciero que deberá ser implementado por las clases que implementen esta interfaz

}
