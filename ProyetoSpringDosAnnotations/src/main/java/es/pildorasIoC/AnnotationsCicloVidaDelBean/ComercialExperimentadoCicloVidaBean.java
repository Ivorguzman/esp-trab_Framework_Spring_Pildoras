package es.pildorasIoC.AnnotationsCicloVidaDelBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;


// @Scope("singleton")
// @Component("ComercialExperimentadoAutowired")
// @Scope("prototype")
@Component // Sin espesificar el id registra el bean con el nombre de la la clase en minuscula y por defecto en singleton
public class ComercialExperimentadoCicloVidaBean implements Empleados {


	// Contructor
	public ComercialExperimentadoCicloVidaBean( ) {
	}


	private CreacionInformeFinanciero nuevoInforme;

	// Ejecución de código después de creacón del bean
	@PostConstruct // No permmite trabajar con el scope protptype
	public void init_ejecutaDespuesDeCreacion() { // Puede tene cualquier modificador de acceso no reciben argumento
		System.out.println("________ Todo el codigo que se quiere ejecutar después de la ejecución del bean _________");
		System.out.println();
	}


	// Ejecucíon de código después de apagado contenedor Spring
	@PreDestroy // No permmite trabajar con el scope protptype
	public void destroject_ejecutaAntesDestrucuin_bean() { // Puede tene cualquier modificador de acceso no reciben argumento
		System.out.println("_______ Todo el codigo que se quiere ejucatar después de apagado el contenedor Spring ________");


	}

	// Implementación de metodos de la interfas
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
















