package es.pildorasIoC.Singleton_Y_Prototype;


// PASO 1: Creacion de la imterfaz para la dependencia
public class Informe implements CreacionInformes {

	@Override public String getInformes() {
		return " y esta es la presentaion del informe  ";
	}

}
