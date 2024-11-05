package es.pildorasIoC.Basico;

public class SecretarioEmpleados implements Empleados {


	// Propiedad que almacena la instancia informeNuevo(CreacionInformes informeNuevo) recivida en el seter
	private CreacionInformes informeNuevo;
	
	




	// Realiza la inyeccion de la dependencia por el metodo setter
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}



	public CreacionInformes getInformeNuevo() {
		return this.informeNuevo;
	}





	@Override public String getTareas() {
		return " Soy SecretarioEmpleados y gestiono todo lo del secretariado";
	}
		
	
	  @Override public String getInforme() {
	  return "Esteinforme  es presentado por SeretarioEmpleado " + this.informeNuevo.getInforme();
	  }
	 

	

}



