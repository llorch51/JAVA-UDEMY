package test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Map_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map miMapa = new HashMap();
			miMapa.put("valor1", "Juan");
			miMapa.put("valor2", "Karla");
			miMapa.put("valor3", "Rosario");
		String elemento = (String) miMapa.get("valor1");
		
		System.out.println("Elemento: "+ elemento);
		
		imprimir(miMapa.keySet());//llaves
		imprimir(miMapa.values());//valores

	}
	
	public static void imprimir(Collection<String> coleccion) {//Collection---tipo más generico
		
		coleccion.forEach(elemento -> {
			System.out.println("Elemento : " + elemento);
		});
	}

}
