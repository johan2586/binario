package co.uniquindio.biblioteca.model;

import java.util.Calendar;
import java.util.Date;


public class Lector extends Persona {


	String id, telefono, direccion;
	Multa multa;
	Prestamo prestamo1;
	Prestamo prestamo2;
	Prestamo prestamo3;
	

	public Lector(String nombre, String id, String telefono, String direccion) {
		super(nombre);
		this.id        = id;
		this.telefono  = telefono;
		this.direccion = direccion;
	}



	public Lector() {
		// TODO Auto-generated constructor stub
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	@Override
	public String toString() {
		return super.toString()+ " id "+ getId() +  "telefono "+  getTelefono() + " direccion " + getDireccion();
	}

	
	




public static void prestamo(String idCopia, String idLector, Date fechaInicial, Date fechaFinal) {
	// TODO Auto-generated method stub
	int dias = (int) (fechaFin.getTimeInMillis() - fechaInicio.getTimeInMillis());
	
	Copia cop = buscarCopia(idCopia);
	
	Prestamo prestamo = new Prestamo();
	
	if (multa==null && dias <30)
		
	{
		if(prestamo1== null) {
			prestamo1 = new Prestamo(fechaInicio, fechaFin, copia);
				copia.setLugar(EstadoCopia.PRESTADO);
			
		}
		
		if(prestamo2== null) {
			prestamo2 = new Prestamo(fechaInicio, fechaFin, copia);
				copia.setLugar(EstadoCopia.PRESTADO);
			
		}
		
		if(prestamo3== null) {
			prestamo3 = new Prestamo(fechaInicio, fechaFin, copia);
				copia.setLugar(EstadoCopia.PRESTADO);
			
		}
		
		
		
	}
	
	
	
	
	

}



private static Copia buscarCopia(String idCopia) {
	// TODO Auto-generated method stub
	return null;
}
}

//public void devolver (Calendar diaE, Prestamo prestamo) {
//	
//	
//	
//	if (diaE.getTimeInMillis() <= prestamo.getFechaFinal()) {
//		
//	}
//	
//	
//	
//	
//}


}
