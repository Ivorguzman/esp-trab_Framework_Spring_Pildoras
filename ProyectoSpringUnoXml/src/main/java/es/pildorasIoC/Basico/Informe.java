package es.pildorasIoC.Basico;


// PASO 1: Creacion de la imterfaz para la dependencia
public class Informe implements CreacionInformes {

	@Override public String getInforme() {
		return " y esta es la presentación del informe  ";
	}

}
