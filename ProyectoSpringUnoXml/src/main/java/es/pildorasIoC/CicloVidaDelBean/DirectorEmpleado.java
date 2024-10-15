package es.pildorasIoC.CicloVidaDelBean;

public class DirectorEmpleado implements Empleados {


	// Paso:1 Creacion de propiedada tipo(intefaz CreacionInformes) para el bean 01(miInforme)
	private CreacionInformes informeNuevo;


	// PASO 2: Creacion del contructor que inyecta la dependencia del bean 01(miInforme)
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}




	@Override public String getTareas() {
		return "Soy DirectorEmpleado y realizo tareas de  director";
	}

	@Override public String getInformes() {
		return "Informe creado por el director" + this.informeNuevo.getInformes();
	}






	@Override public String toString() {
		return "DirectorEmpleado [informeNuevo=" + this.informeNuevo + ", email=" + this.email + ", nombreEmpresa=" + this.nombreEmpresa + ", getInformes()=" + this
				.getInformes() + "]";
	}






	// Creacion de campo o instancias
	private String email;
	private String nombreEmpresa;





	// Creación de Seter y Getters

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






	// Metodo <init>. Ejecutar tareas antes que le bean este disponible
	public void inicio() {
		System.out.println("Ejecutar   culaquier tipo de tarea ANTES que le bean este disponible");
	}


	// Metodo <destroy>. Ejecutar tareas despues de usar el bean
	public void fin() {
		System.out.println("Ejecutar   culaquier tipo de tarea DESPUES que le bean este disponible");

	}

}
