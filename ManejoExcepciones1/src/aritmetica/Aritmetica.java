package aritmetica;

import excepciones.OperacionExcepcion;

public class Aritmetica {
												//puede arrojar una excepcion de este tipo(mi propio tipo)
	public static int division(int numerador, int denominador) throws OperacionExcepcion {
		
		if (denominador == 0) {
			throw new OperacionExcepcion("Division entre cero");
		}
		
		return numerador/denominador;
	}
}
