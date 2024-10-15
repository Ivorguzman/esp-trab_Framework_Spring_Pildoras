package es.pildorasIoC.CicloVidaDelBean;

public class JefeEmpleados implements Empleados {


	// Creacion de campo tipo: CreaciondeInforme(intefaz)
	private CreacionInformes informeNuevo;



	// PASO 2: Creacion del contructor que inyecta la dependencia
	public JefeEmpleados(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}


	@Override public String getTareas() {
		return "Soy JefeEmpleados y Gestiono todo lo relacionado a los empleados";
	}


	@Override public String getInformes() {
		return "Informe presentado por el JefeEmpleado" + this.informeNuevo.getInformes();
	}

}
