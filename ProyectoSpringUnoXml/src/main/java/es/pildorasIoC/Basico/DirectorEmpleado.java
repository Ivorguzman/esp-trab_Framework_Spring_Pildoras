package es.pildorasIoC.Basico;

public class DirectorEmpleado implements Empleados {


	// Paso:1 Creacion de campo tipo CreaciondeInforme(intefaz) para almacenar la instancia
	// inyectada por el contructor(CreacionInformes informeNuevo)
	private CreacionInformes informeNuevo;


	// PASO 2: Creacion del contructor (º )
	public DirectorEmpleado(CreacionInformes informeNuevo) {

		this.informeNuevo = informeNuevo;
	}


	@Override public String getTareas() {
		return "Soy DirectorEmpleado y realizo tareas de  director";
	}


	@Override
	public String getInforme() {
		return "Informe creado por el director" + this.informeNuevo.getInforme();
	}
}
