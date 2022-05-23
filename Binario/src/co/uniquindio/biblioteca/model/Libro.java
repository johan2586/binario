package co.uniquindio.biblioteca.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Libro {

	String nombre, editorial;
	TipoLibro tipolibro;
	Autor autor;
	ArrayList<Autor> listaAutores = new ArrayList<>();

	

	public Libro(String nombre, String editorial, TipoLibro tipolibro, Autor autor, ArrayList<Autor> listaAutores) {
		super();
		this.nombre    = nombre;
		this.editorial = editorial;
		this.tipolibro = tipolibro;
		this.autor     = autor;
		this.listaAutores = listaAutores;
	}



	public Libro() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}



	public TipoLibro getTipolibro() {
		return tipolibro;
	}

	public void setTipolibro(TipoLibro tipolibro) {
		this.tipolibro = tipolibro;
	}


	public String obtenerNombreAutor(String nombreAutor) {

		for (Autor autor : listaAutores) {
			if (autor.getNombre().equalsIgnoreCase(nombreAutor));
			return nombreAutor;



		}
		return null;
	}

	public void setListaAutores(ArrayList<Autor> listaAutores) {
		this.listaAutores = listaAutores;
	}

//	public String getAutor() {
//		return autor.getNombre();
//	}
//
//	public void setAutor(Autor autor) {
//		this.autor = autor;
//	}

	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", editorial=" + editorial + ", tipolibro=" + tipolibro +"]";
	}






}
