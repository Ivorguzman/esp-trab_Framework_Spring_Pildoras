package es.pildorasIoC.AnnotationsConfiguration; // * Declaración del paquete al que pertenece esta clase

import org.springframework.stereotype.Component; // * Importación de la anotación @Component de Spring para la detección automática de beans

// Marca esta clase como un bean de Spring
@Component // * Indica que esta clase es un componente gestionado por Spring
public class InformeFinancieroTrimestre3 implements CreacionInformeFinanciero { // * Declaración de la clase InformeFinancieroTrimestre3 que implementa la interfaz CreacionInformeFinanciero

    // Implementa el método de la interfaz para devolver un informe
    @Override
    public String getInformeFinanciero() { // * Implementación del método getInformeFinanciero de la interfaz CreacionInformeFinanciero
        return "Presentación de Informe de Gastos operativos trimestre 3"; // * Retorna la descripción del informe financiero del trimestre 3
    }
}