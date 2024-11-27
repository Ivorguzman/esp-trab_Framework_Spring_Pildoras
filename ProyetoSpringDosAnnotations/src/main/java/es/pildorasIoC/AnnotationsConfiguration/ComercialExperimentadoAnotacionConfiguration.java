package es.pildorasIoC.AnnotationsConfiguration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;


@Component // metodo getBean toma como ID(name:) Nombre de la clase con la primera letra en miniscula
public class ComercialExperimentadoAnotacionConfiguration implements Empleados {


	// Contructor
	public ComercialExperimentadoAnotacionConfiguration( ) {
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
















