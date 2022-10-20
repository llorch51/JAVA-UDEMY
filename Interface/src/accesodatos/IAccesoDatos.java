package accesodatos;

public interface IAccesoDatos {
	
	int MAX_REGISTROS =10; //Toda propiedad en interface es una CONSTANTE(public-final-static)
	
	//metodos abstractos-se declaran pero no se implementan
	void insertar();
	void listar();
	void actualizar();
	void eliminar();
	
	
}
