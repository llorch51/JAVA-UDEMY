package test;

import java.util.*;

public class Set_HashSet {
	
	//SET más rapido en comparacion con Lista. No guarda orden de entradas. No se pueden repetir elementos

	public static void main(String[] args) {
		
		HashSet<String> miSet = new HashSet<String>();
			miSet.add("Lunes");
			miSet.add("Martes");
			miSet.add("Miercoles");
			miSet.add("Jueves");
			miSet.add("Viernes");
			
			imprimir(miSet);

	}
	
	public static void imprimir(Collection<String> coleccion) {//Collection---tipo más generico
//		for (Object elemento : coleccion) {
//				System.out.println(elemento);
//		}
		
		
		coleccion.forEach(elemento -> {
			System.out.println("Elemento : " + elemento);
		});
	}
	
	

}
