package co.uniquindio.biblioteca.model;
import java.util.Calendar;



public class Multa {
	
	Calendar fechaInicial;
	Calendar fechaFinal;
	
	public Multa(Calendar fechaInicial, Calendar fechaFinal) {
		super();
		this.fechaInicial = fechaInicial;
		this.fechaFinal = fechaFinal;
	}
	public Multa() {
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
