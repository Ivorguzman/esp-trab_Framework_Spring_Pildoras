package es.pildorasIoC.Basico;

public class DirectorEmpleado implements Empleados {

	// Paso:1 Creacion de campo tipo: CreaciondeInforme(intefaz)
	private CreacionInformes informeNuevo;


	// PASO 2: Creacion del contructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}




	@Override public String getTareas() {
		return "Soy DirectorEmpleado y realizo tareas de  director";
	}

	@Override public String getInformes() {
		return "Informe creado por el director" + this.informeNuevo.getInformes();
	}





}
