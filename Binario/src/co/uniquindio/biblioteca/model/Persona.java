package co.uniquindio.biblioteca.model;

public class Persona {

	String nombre;

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Persona (){

	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return " lector \n " + " nombre " + getNombre();
	}



}
