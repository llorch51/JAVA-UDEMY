package domain;

import java.io.Serializable;

//JAVA BEAN
//*****POR LO MENOS UN CONSTRUCTOR VACIO
//****CADA ATRIBUTO/PROPIEDAD  ES PRIVADO Y CON METODO SET-GET publicos
//****IMPLEMENTA INTERFAZ SERIALIZABLE

//---SERIALIZACION: CONVERTIR OBJETOS A BITS(CEROS Y UNOS)
//para transferirlos en la red////un estandar

public class Persona implements Serializable{
	
	private String nombre;
	private String apellido;
	
	public Persona() {//constructor vacio y publico
		
	}
	
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	

}
