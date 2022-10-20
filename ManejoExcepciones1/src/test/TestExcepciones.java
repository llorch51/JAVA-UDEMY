package test;

import aritmetica.Aritmetica;
import excepciones.OperacionExcepcion;

public class TestExcepciones {

	public static void main(String[] args) {
		
		int resultado = 0;
		
		try {
			resultado = Aritmetica.division(10, 0);
			
		}catch (OperacionExcepcion e) {//error de menor jerarqu�a(mi propipa clase de excepcion)
			System.out.println("Error de operacionExcepcion");
			e.printStackTrace(System.out);
			
		}
		catch (Exception e) {//Exception clase padre. Errores que heredan de aqui(Check-exception). Obliga Try-catch
								//Errores que herean de RuntimeException(uncheck-exception). No obliga Try-catch
			//System.out.println("Ocurri� un error. No se puede.");
			e.printStackTrace(System.out);
			
		}finally {//finally siempre se ejecuta
			System.out.println("Se revis� la divisi�n");
		}
		System.out.println("El resultado es: "+resultado);

	}

}
