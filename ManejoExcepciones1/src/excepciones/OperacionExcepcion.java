package excepciones;

							//Exception obliga al try-catch, es de mayor jerarquía
public class OperacionExcepcion extends Exception {

	public OperacionExcepcion(String mensaje) {//como hereda de Exception, hay que mandar el mensaje
												//a la clase padre por medio de su constructor super
		super(mensaje);
	}
	

}
