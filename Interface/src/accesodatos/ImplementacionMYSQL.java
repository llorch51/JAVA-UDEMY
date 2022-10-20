package accesodatos;

//implementa la interfaz IAcceso datos
public class ImplementacionMYSQL implements IAccesoDatos {

	//se debe implementar los metodos contenidos en la interfaz
	@Override
	public void insertar() {
		System.out.println("Insertar desde Mysql");
		
	}

	@Override
	public void listar() {
		System.out.println("Listar desde Mysql");
		
	}

	@Override
	public void actualizar() {
		System.out.println("Actualizar desde Mysql");
		
	}

	@Override
	public void eliminar() {
		System.out.println("Eliminar desde Mysql");
		
	}

	

}
