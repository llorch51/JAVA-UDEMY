package test;

import accesodatos.IAccesoDatos;
import accesodatos.ImplementacionMYSQL;
import accesodatos.ImplementacionORACLE;

public class TestInterface {

	public static void main(String[] args) {
		
		IAccesoDatos datos = new ImplementacionMYSQL(); //se declara de tipo interfaz, pero se instancia de
														//clase que implementa esa interfaz
		//datos.listar();
		imprimir(datos);
		
		datos = new ImplementacionORACLE();//cambiamos el tipo
		//datos.listar();
		imprimir(datos);//polimorfismo
		
		
		

	}
	
	public static void imprimir(IAccesoDatos datos) {//recibe un tipo interfaz como parametro
		datos.listar();
	}

}
