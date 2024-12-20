package es.pildorasIoC.AnnotationsCicloVidaDelBean; // * Declaración del paquete al que pertenece esta clase

import javax.annotation.PostConstruct; // * Importación de la anotación @PostConstruct para métodos que deben ejecutarse después de la creación del bean
import javax.annotation.PreDestroy; // * Importación de la anotación @PreDestroy para métodos que deben ejecutarse antes de la destrucción del bean

import org.springframework.stereotype.Component; // * Importación de la anotación @Component de Spring para la detección automática de beans

// @Scope("singleton")
// @Component("ComercialExperimentadoAutowired")
// @Scope("prototype")
@Component // * Sin especificar el id, registra el bean con el nombre de la clase en minúscula y por defecto en singleton
public class ComercialExperimentadoCicloVidaBean implements Empleados { // * Declaración de la clase ComercialExperimentadoCicloVidaBean que implementa la interfaz Empleados

	// Constructor
	public ComercialExperimentadoCicloVidaBean( ) { // * Constructor vacío de la clase
	}

	private CreacionInformeFinanciero nuevoInforme; // * Campo privado para almacenar la instancia de CreacionInformeFinanciero

	// Ejecución de código después de creación del bean
	@PostConstruct // * No permite trabajar con el scope prototype
	public void init_ejecutaDespuesDeCreacion() { // * Puede tener cualquier modificador de acceso, no reciben argumentos
		System.out.println("________ Todo el código que se quiere ejecutar después de la ejecución del bean _________");
		System.out.println();
	}

	// Ejecución de código después de apagado del contenedor Spring
	@PreDestroy // * No permite trabajar con el scope prototype
	public void destroject_ejecutaAntesDestrucción_bean() { // * Puede tener cualquier modificador de acceso, no reciben argumentos
		System.out.println("_______ Todo el código que se quiere ejecutar después de apagar el contenedor Spring ________");
	}

	// Implementación de métodos de la interfaz
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return null;
	}

}
