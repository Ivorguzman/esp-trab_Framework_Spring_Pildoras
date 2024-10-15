package es.pildorasIoC.Basico;

public class SecretarioEmpleados implements Empleados {


	private CreacionInformes informeNuevo;
	
	
	public CreacionInformes getInformeNuevo() {
		return this.informeNuevo;
	}

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}


	



	@Override public String getTareas() {
		return " Soy SecretarioEmpleados y gestiono todo lo del secretariado";
	}


	@Override public String getInformes() {
		return "Esteinforme  es presentado por SeretarioEmpleado " + this.informeNuevo.getInformes();
	}


	}





