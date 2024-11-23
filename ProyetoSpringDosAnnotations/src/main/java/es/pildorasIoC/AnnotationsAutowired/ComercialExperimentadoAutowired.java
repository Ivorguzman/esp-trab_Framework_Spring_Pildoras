package es.pildorasIoC.AnnotationsAutowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/*
 * @Component es una anotación de nivel de clase que le permite a Spring
 * detectar automáticamente nuestros beans personalizados.
 * En otras palabras, sin tener que escribir ningún código explícito, Spring hará lo siguiente:
 * 01 Escaneará nuestra aplicación en busca de clases anotadas con @Component
 * 02 Las instanciará e inyectará las dependencias especificadas en ellas
 * 03 Las inyectará donde sea necesario
 */



// @Component // Sin espesificar el id registra el bean con el nombre de la la clase en minuscula
@Component("Experimentado")
public class ComercialExperimentadoAutowired implements Empleados {


	private CreacionInformeFinanciero nuevoInformeFinanciero;



	/*
	 * 1. Spring escanea la clase `ComercialExperimentadoAutowired` y ve `@Autowired` en el constructor.
	 * 2. Spring busca un bean del tipo `CreacionInformeFinanciero`.
	 * 3. Encuentra `InformeFinacieroTrimestre1`.
	 * 4. Inyecta `InformeFinacieroTrimestre1` en el constructor.
	 * 5. Crea una instancia de `ComercialExperimentadoAutowired` con `nuevoInforme` correctamente configurado.
	 * Resumen
	 * Un Constructor Único: No requiere @Autowired.
	 * 
	 * Múltiples Constructores: Necesita @Autowired para indicar el constructor correcto.
	 * 
	 * Inyección de Campos: Requiere @Autowired.
	 * 
	 * Inyección de Métodos Setter: Requiere @Autowired.
	 * 
	 * Inyección en Métodos: Requiere @Autowired.
	 */
	@Autowired // IoC por medio del constructor
	public ComercialExperimentadoAutowired(CreacionInformeFinanciero nuevoIFinanciero) { // (IoC)
		this.nuevoInformeFinanciero = nuevoIFinanciero;
	}






	// Método sobrescrito de (interface Empleados) para devolver las tareas del empleado
	@Override
	public String getTareas() {
		return "Gran volumen de ventas de alta facturación";
	}





	// Método sobrescrito de (interface Empleados) para devolver informes generados por el comercial
	@Override
	public String getInformes() {
		// return "Informe generado por el comercial";
		return this.nuevoInformeFinanciero.getInformeFinaciero();
	}





	/*
	 * ¿Qué es @Autowired?
	 * 
	 * @Autowired es una anotación proporcionada por Spring para facilitar la Inyección de Dependencias (IoC).
	 * 
	 * Se puede aplicar a campos, métodos y constructores para indicar a Spring que debe inyectar automáticamente una dependencia en ese punto.
	 * 
	 * Funcionamiento
	 * Escaneo de Componentes:
	 * 
	 * Spring escanea las clases en busca de la anotación @Autowired.
	 * 
	 * Esta detección se realiza durante el proceso de configuración del contexto de la aplicación.
	 * 
	 * Inyección en el Constructor:
	 * 
	 * En tu caso, @Autowired se usa en el constructor de la clase ComercialExperimentadoAutowired_constructor.
	 * 
	 * Spring ve que el constructor necesita un objeto de tipo CreacionInformeFinanciero.
	 * 
	 * Resolución de Dependencias:
	 * 
	 * Spring busca en el contenedor de beans un bean que coincida con el tipo CreacionInformeFinanciero.
	 * 
	 * En tu configuración, Spring encuentra el bean InformeFinacieroTrimestre1 que implementa CreacionInformeFinanciero.
	 * 
	 * Inyección de la Dependencia:
	 * 
	 * Spring crea una instancia del bean InformeFinacieroTrimestre1 (si aún no está creada) y la inyecta como parámetro del constructor nuevoIFinanciero.
	 * 
	 * El constructor de ComercialExperimentadoAutowired_constructor se invoca con este parámetro, y la instancia se asigna a this.nuevoInforme.
	 * 
	 * Instanciación del Bean:
	 * 
	 * Finalmente, Spring crea e inicializa una instancia de ComercialExperimentadoAutowired_constructor con la dependencia CreacionInformeFinanciero inyectada.
	 *
	 */
}



















