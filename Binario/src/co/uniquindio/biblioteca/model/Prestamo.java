package co.uniquindio.biblioteca.model;
import java.util.Calendar;


public class Prestamo {
	
	Calendar fechaInicial;
	Calendar fechaFinal;
	Copia    copia;
	Lector   lector;
	
	public Prestamo(Calendar fechaInicial, Calendar fechaFinal, Copia copia, Lector lector) {
		super();
		this.fechaInicial = fechaInicial;
		this.fechaFinal = fechaFinal;
		this.copia = copia;
		this.lector = lector;
	}

	public Prestamo() {
		// TODO Auto-generated constructor stub
	}
	public Calendar getFechaInicial() {
		return fechaInicial;
	}
	public void setFechaInicial(Calendar fechaInicial) {
		this.fechaInicial = fechaInicial;
	}
	public Calendar getFechaFinal() {
		return fechaFinal;
	}
	public void setFechaFinal(Calendar fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	
	

}
