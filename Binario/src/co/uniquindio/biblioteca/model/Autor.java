package co.uniquindio.biblioteca.model;
import java.util.Date;

public class Autor extends Persona {

	String nacionalidad;
	Date fechaNacieminto;


	public Autor() {
		// TODO Auto-generated constructor stub
	}

	public Autor(String nombre,String nacionalidad, Date fechaNacieminto) {
		super(nombre);
		this.nacionalidad = nacionalidad;
		this.fechaNacieminto = fechaNacieminto;

		// TODO Auto-generated constructor stub
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Date getFechaNacieminto() {
		return fechaNacieminto;
	}

	public void setFechaNacieminto(Date fechaNacieminto) {
		this.fechaNacieminto = fechaNacieminto;
	}

	@Override
	public String toString() {
		return super.toString()+"Autor [nacionalidad=" + nacionalidad + ", fechaNacieminto=" + fechaNacieminto + "]";
	}







}
