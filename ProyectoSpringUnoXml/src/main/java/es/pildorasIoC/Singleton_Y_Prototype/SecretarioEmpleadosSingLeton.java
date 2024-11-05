package es.pildorasIoC.Singleton_Y_Prototype;

public class SecretarioEmpleadosSingLeton implements Empleados {

	// Creacion de campo tipo: CreaciondeInforme(intefaz)
	private CreacionInformes informeNuevo;
	
	
	public CreacionInformes getInformeNuevo() {
		return this.informeNuevo;
	}

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}


	private String email;
	private String nombreEmpresa;
	

	// Injeccion de dependencia con metodo seter
	// PASO 2: Creacion del SETER que inyecta la dependencia

	/*
	 * public void setInformeNuevo(CreacionInformes informeNuevo) {
	 * this.informeNuevo = informeNuevo;
	 * }
	 */


	@Override public String getTareas() {
		return " Soy SecretarioEmpleados y gestiono todo lo del secretariado";
	}


	@Override public String getInformes() {
		return "Esteinforme  es presentado por SeretarioEmpleado " + this.informeNuevo.getInformes();
	}


	public String getCorreo() {
		return this.email;
	}


	public void setCorreo(String email) {
		this.email = email;
	}


	public String getEmpresa() {
		return this.nombreEmpresa;
	}


	public void setEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}




}
