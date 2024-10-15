package es.pildorasIoC.Basico;

public class JefeEmpleados implements Empleados {


	private CreacionInformes informeNuevo;



	public CreacionInformes getInformeNuevo() {
		return this.informeNuevo;
	}

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}


	@Override public String getTareas() {
		return "Soy JefeEmpleados y Gestiono todo lo relacionado a los empleados";
	}


	@Override public String getInformes() {
		return "Informe presentado por el JefeEmpleado" + this.informeNuevo.getInformes();
	}

}
