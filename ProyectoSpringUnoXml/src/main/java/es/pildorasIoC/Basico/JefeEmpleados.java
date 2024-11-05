package es.pildorasIoC.Basico;

public class JefeEmpleados implements Empleados {


	private CreacionInformes informeNuevo;




	/*
	 * public void setInformeNuevo(CreacionInformes informeNuevo) {
	 * this.informeNuevo = informeNuevo;
	 * }
	 *
	 * public CreacionInformes getInformeNuevo() {
	 * return this.informeNuevo;
	 * }
	 */


	@Override public String getTareas() {
		return "Soy JefeEmpleados y Gestiono todo lo relacionado a los empleados";
	}


	@Override
	public String getInforme() {
		return "Informe presentado por el JefeEmpleado" + this.informeNuevo.getInforme();
	}

}
