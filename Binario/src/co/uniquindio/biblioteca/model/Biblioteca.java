package co.uniquindio.biblioteca.model;

import java.util.ArrayList;

import java.util.Date;

import co.uniquindio.biblioteca.exceptions.exceptionCrearLector;

public class Biblioteca {

	ArrayList<Lector>   listaLectores  = new ArrayList<>();
	ArrayList<Prestamo> listaPrestamos = new ArrayList<>();
	ArrayList<Libro>    listaLibros    = new ArrayList<>();
	ArrayList<Copia>    listaCopias    = new ArrayList<>();
	ArrayList<Autor>    listaAutores   = new ArrayList<>();
	
	Lector      lector;
	TipoLibro   tipolibro = null;
	EstadoCopia estadocopia = null;
	Multa       multa;
	

	public ArrayList<Lector> getListaLectores() {
		return listaLectores;
	}

	public void setListaLectores(ArrayList<Lector> listaLectores) {
		this.listaLectores = listaLectores;
	}

	public ArrayList<Prestamo> getListaPrestamos() {
		return listaPrestamos;
	}

	public void setListaPrestamos(ArrayList<Prestamo> listaPrestamos) {
		this.listaPrestamos = listaPrestamos;
	}

	public ArrayList<Libro> getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(ArrayList<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}

	public ArrayList<Copia> getListaCopias() {
		return listaCopias;
	}

	public void setListaCopias(ArrayList<Copia> listaCopias) {
		this.listaCopias = listaCopias;
	}

	public ArrayList<Autor> getListaAutores() {
		return listaAutores;
	}

	public void setListaAutores(ArrayList<Autor> listaAutores) {
		this.listaAutores = listaAutores;
	}

	public void crearLector(String id, String nombre, String telefono, String direccion) throws exceptionCrearLector {

		if (buscarLector(id) == null) {

			Lector lector = new Lector();

			lector.setId(id);
			lector.setNombre(nombre);
			lector.setTelefono(telefono);
			lector.setDireccion(direccion);

			listaLectores.add(lector);

		}
		throw new exceptionCrearLector ( " este lector ya esta creado");
		
		

	}

	private Lector buscarLector(String id)  {

		for (Lector lector : listaLectores) {
			if (lector.getId().equalsIgnoreCase(id)) {
				
			}
			
		}
		return lector;

		
	}

	public void crearLibro(String nombre, int tipoLibrot, String editorial, String nombreAutor) {

		if (buscarLibro(nombre) == null) {
			
			Autor aut = buscarAutores(nombreAutor);

			Libro libro = new Libro();


			libro.setNombre(nombre);

			if (tipoLibrot == 0) {
				tipolibro = TipoLibro.NOVELA;
			}
			if (tipoLibrot == 1) {
				tipolibro = TipoLibro.TEATRO;
			}
			if (tipoLibrot == 2) {
				tipolibro = TipoLibro.POESIA;
			}
			if (tipoLibrot == 3) {
				tipolibro = TipoLibro.ENSAYO;
			}

			libro.setTipolibro(tipolibro);

			libro.setEditorial(editorial);

			System.out.println(getListaLibros() + aut.getNombre());

			listaLibros.add(libro);
		}

	}


	private Libro buscarLibro(String nombre) {
		for (Libro libro : listaLibros) {
			if (libro.getNombre().equalsIgnoreCase(nombre)){
				return libro;
			}
		}
		return null;
	}

	public void crearAutor(String nombre, String nacionalidad, Date fechaNacimiento) {
		// TODO Auto-generated method stub

		if (buscarAutores(nombre) == null) {

			Autor autor = new Autor();

			autor.setNombre(nombre);
			autor.setNacionalidad(nacionalidad);
			autor.setFechaNacieminto(fechaNacimiento);

			listaAutores.add(autor);

		}

	}

	private Autor buscarAutores(String nombre) {

		for (Autor autor : listaAutores) {
			if (autor.getNombre().equalsIgnoreCase(nombre)) {
				return autor;
			}

		}

		return null;
	}

	public void crearCopias(String id, int lugar) {
		// TODO Auto-generated method stub
		
		if (buscarCopia(id) == null) {
			
			Copia copia = new Copia();


			copia.setId(id);

			if (lugar == 0) {
				estadocopia = EstadoCopia.BIBLIOTECA;
			}
			if (lugar == 1) {
				estadocopia = EstadoCopia.PRESTADO;
			}
			if (lugar == 2) {
				estadocopia = EstadoCopia.RETASO;
			}
			if (lugar == 3) {
				estadocopia = EstadoCopia.REPARACION;
			}

			copia.setLugar(estadocopia);


			listaCopias.add(copia);
		}

	}

	public Copia buscarCopia (String id) {
		// TODO Auto-generated method stub
		for (Copia copia : listaCopias) {
			if (copia.getId().equalsIgnoreCase(id)) {
				return copia;
			}
		}
		return null;
		
	
	}

	


	public void crearPrestamos(String idCopia, String idLector, Date fechaInicial, Date fechaFinal) {
		// TODO Auto-generated method stub
		
		Copia cop = buscarCopia(idCopia);
			
			Prestamo prestamo = new Prestamo();
			
		
	}

	
//	public void Multa(Date fechaInicial, Date fechaFinal) {
//		// TODO Auto-generated method stub
//		
//		
//		if (diaE.getTimeInMillis() < multa.getFechaFinal())
//			
//			Multa multa = new Multa();
//		
//		    
//			int multa = multa + 1;
//		
//	}

}



