package es.pildorasIoC.Basico;

public class JefeEmpleados implements Empleados {


	private CreacionInformes informeNuevo;

	// Propiedad que almacena la inyección del nombreEmpresa
	private String telefono;// (Ioc)

	// Propiedad que almacena la inyección del nombreEmpresa
	private String telefono2;// (Ioc)



	public String getTelefono() {
		return this.telefono;
	}



	// Establece el valor de los campos del AplicationContext.xml
	// Realiza la inyeccion de la dependencia por el metodo setter (Ioc)
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public String getTelefono2() {
		return this.telefono2;
	}



	// Establece el valor de los campos del AplicationContext.xml
	// Realiza la inyeccion de la dependencia por el metodo setter (Ioc)
	public void setTelefono2(String telefono2) {
		this.telefono2 = telefono2;
	}


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
