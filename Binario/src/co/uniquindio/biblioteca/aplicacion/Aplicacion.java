package co.uniquindio.biblioteca.aplicacion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.sound.midi.SysexMessage;
import javax.swing.JOptionPane;

import co.uniquindio.biblioteca.exceptions.exceptionCrearLector;
import co.uniquindio.biblioteca.model.*;

public class Aplicacion {

	public static void main(String[] args) {

		int opcion;
		Biblioteca biblioteca = new Biblioteca();
		
		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion segun el menu : \n"
					+ " 1 - Crear lector \n" + " 2 -  Crear autores \n" + " 3 -Crear libro \n" + " 4 -Crear copias de un libro "));

			switch (opcion) {
			case 1:

				int numeroLectores = 3;

				for (int i = 0; i < numeroLectores; i++) {

					String id        = JOptionPane.showInputDialog(" ingrese el id");
					String nombre    = JOptionPane.showInputDialog(" ingrese el nombre");
					String telefono  = JOptionPane.showInputDialog(" ingrese el telefono");
					String direccion = JOptionPane.showInputDialog(" ingrese la direccion");

					try {
						biblioteca.crearLector(id, nombre, telefono, direccion);
						
					} catch (exceptionCrearLector e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

				/**
				 * como imprimir un arraylist
				 */

				String contenido = "";
				ArrayList<Lector> listalectores = biblioteca.getListaLectores();
				for (Lector lector0 : listalectores) {

					contenido += lector0.toString();

				}

				JOptionPane.showMessageDialog(null, contenido);

				break;

			case 2:

				int numeroAutores = 2;

				for (int i = 0; i < numeroAutores; i++) {

					String nombre          = JOptionPane.showInputDialog(" ingrese la nombre del autor");
					String nacionalidad    = JOptionPane.showInputDialog(" ingrese la nacionalidad");
					Date   fechaNacimiento = null; //System.out.println("Date-1: " +  fecha.format(date));
                           
		            

					biblioteca.crearAutor(nombre, nacionalidad, fechaNacimiento);


				}

				/**
				 * como imprimir un arraylist
				 */

				String contenido3 = "";
				ArrayList<Autor> listaAutores = biblioteca.getListaAutores();
				for (Autor autor : listaAutores) {

					contenido3 += autor.toString();

				}

				JOptionPane.showMessageDialog(null, contenido3);

				break;

			case 3:

				int numeroLibros = 2;

				for (int i = 0; i < numeroLibros; i++) {

					String nombre     = JOptionPane.showInputDialog(" ingrese el nombre del libro");
					int    tipoLibrot = Integer.parseInt(JOptionPane.showInputDialog(
							          " \nIngrese el tipo de documento del Libro: \n0 - NOVELA \n1 - TEATRO \n2 - POESIA \n3 -ENSAYO"));

					String editorial = JOptionPane.showInputDialog(" ingrese la editorial");
					String autor = JOptionPane.showInputDialog(" ingrese el autor"); // buscar el objeto en el arraylist
					

					biblioteca.crearLibro(nombre, tipoLibrot, editorial, autor);

				}

				/**
				 * como imprimir un arraylist
				 */

				String contenido1 = "";
				ArrayList<Libro> listalibros = biblioteca.getListaLibros();
				for (Libro libro : listalibros) {

					contenido1 += libro.toString();

				}

				JOptionPane.showMessageDialog(null, contenido1);

				break;
				
			case 4:

				int numeroCopias = 3;

				for (int i = 0; i < numeroCopias; i++) {

					String id            = JOptionPane.showInputDialog(" ingrese el id para copia");
					int lugar            = Integer.parseInt(JOptionPane.showInputDialog(
							             " ingrese el estado de la copia /n 0 para BIBLIOTECA /n 1 para PRESTADO /n 2 RETASO /n 3 REPARACION "));
					
					
					
				   biblioteca.crearCopias (id, lugar);


				}

				break;
				
			case 5:

				int numeroPrestamos = 3;

				for (int i = 0; i < numeroPrestamos; i++) {
					
					String idCopia       = JOptionPane.showInputDialog(" ingrese el nombre del libro que desea prestar");
					String idLector      = JOptionPane.showInputDialog(" ingrese el id del lector");
					Date fechaInicial    = null;
					Date fechaFinal      = null;
					

					
					
					
				   Lector.prestamo (idCopia, idLector, fechaInicial, fechaFinal);


				}

				break;
				
				
			
			}
			
	

		}while (opcion != 5);

	}
}
	
