package es.pildorasIoC.Singleton_Y_Prototype;

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



	// Creacion de campo o instancias
	private String email;
	private String nombreEmpresa;

	public String getCorreo() {
		return this.email;
	}




	// Creación de Seter y geters
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
