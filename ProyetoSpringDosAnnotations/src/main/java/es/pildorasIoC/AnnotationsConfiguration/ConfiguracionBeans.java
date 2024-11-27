package es.pildorasIoC.AnnotationsConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Indica que esta es una clase de configuración de Spring
@Configuration
// Escanea el paquete especificado en busca de componentes
@ComponentScan("es.pildorasIoC.AnnotationsConfiguration")
public class ConfiguracionBeans {

	// Define un bean de tipo CreacionInformeFinanciero con ID "informeDtoCompras"
	@Bean
	public CreacionInformeFinanciero informeDtoCompras() {
		return new InformeFinancieroDtoCompras();
	}

	// Define un bean de tipo Empleados con ID "directorFinanciero" e inyecta el bean "informeDtoCompras"
	@Bean
	public Empleados directorFinanciero() {
		return new DirectorFinanciero(this.informeDtoCompras());
	}
}





/*
 * Beneficios de una Clase de Configuración Separada
 * 
 * 
 * Organización y Modularidad:
 * Mantener las configuraciones separadas ayuda a organizar mejor el código.
 * Puedes tener una clase de configuración para cada grupo de beans o funcionalidad,
 * lo que hace que el proyecto sea más modular y mantenible.
 * 
 * 
 * 
 * Claridad y Mantenimiento:
 * Tener configuraciones separadas hace que sea más fácil localizar
 * y mantener la configuración específica del proyecto.
 * Por ejemplo, si necesitas actualizar cómo se
 * configuran ciertos beans, sabes exactamente dónde buscar.
 * 
 * 
 * 
 * Escalabilidad:
 * A medida que tu proyecto crezca, será más fácil manejar la configuración
 * si está organizada en múltiples clases en lugar de tener
 * una única clase con muchasresponsabilidades.
 * 
 * 
 * 
 * Separación de Preocupaciones:
 * Al separar la lógica de configuración de la lógica del negocio,
 * mantienes una separación clara de responsabilidades.
 * Las clases de configuración se encargan de cómo los
 * beans se crean y gestionan, mientras que las otras clase
 * se centran en la lógica del negocio.
 */

