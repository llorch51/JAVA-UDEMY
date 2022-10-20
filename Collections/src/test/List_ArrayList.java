package test;

import java.util.ArrayList;
import java.util.List;

import jdk.jshell.Diag;

public class List_ArrayList {
	
	public static void main(String[] args) {
		//interfaz					Clase
		List<String> miLista = new ArrayList();//cuando no se define el tipo de la lista
												//se asume que son de tipo 'Object'
		
		miLista.add("Lunes");//ArrayList respeta el orden en que se añadieron los objetos
		miLista.add("Martes");// y puede haber duplicados
		miLista.add("Miercoles");
		miLista.add("Jueves");
		miLista.add("Viernes");
		
		for (String dia : miLista) {
			System.out.println(dia);
		}
		System.out.println("----------------------------");
		
		//funcion Lamba/flecha
		miLista.forEach(dia -> {
			System.out.println(dia);
		});
	}

}
