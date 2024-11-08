package es.pildorasIoC.Basico;

public class SecretarioEmpleados implements Empleados {


	// Propiedad que almacena informeNuevo(CreacionInformes informeNuevo) recivida en el seter
	private CreacionInformes informeNuevo; // (Ioc)


	// Propiedad que almacena la inyección del email
	private String email;// (Ioc)

	// Propiedad que almacena la inyección del nombreEmpresa
	private String nombreEmpresa;// (Ioc)

	// Propiedad que almacena la inyección del nombreEmpresa
	private String telefono;// (Ioc)

	// Propiedad que alamacena direccion Pagina Web
	private String paginaWeb;// (Ioc)





	//*************** Setters Y Getters *****************
	
	public String getPaginaWeb() {
		return this.paginaWeb;
	}




	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}



	public String getTelefono() {
		return this.telefono;
	}




	// Establece el valor de los campos del AplicationContext.xml
	// Realiza la inyeccion de la dependencia por el metodo setter (Ioc)
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	// Establece el valor de los campos del AplicationContext.xml
	// Realiza la inyeccion de la dependencia por el metodo setter (Ioc)
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}



	public CreacionInformes getInformeNuevo() {
		return this.informeNuevo;
	}





	public String getEmail() {
		return this.email;
	}


	// Establece el valor de los campos del AplicationContext.xml
	// Realiza la inyeccion de la dependencia por el metodo setter (Ioc)
	public void setEmail(String email) {
		this.email = email;
	}



	public String getNombreEmpresa() {
		return this.nombreEmpresa;
	}


	// Establece el valor de los campos del AplicationContext.xml
	// Realiza la inyeccion de la dependencia por el metodo setter (Ioc)
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}



	@Override public String getTareas() {
		return " Soy SecretarioEmpleados y gestiono todo lo del secretariado";
	}
		
	
	  @Override public String getInforme() {
	  return "Esteinforme  es presentado por SeretarioEmpleado " + this.informeNuevo.getInforme();
	  }
	 

	

}



