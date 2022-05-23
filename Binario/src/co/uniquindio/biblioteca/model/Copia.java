package co.uniquindio.biblioteca.model;

public class Copia {
	
	
	String id;
	EstadoCopia lugar;
	
	public Copia(String id, EstadoCopia lugar) {
		super();
		this.id = id;
		this.lugar = lugar;
	}

	public Copia() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public EstadoCopia getLugar() {
		return lugar;
	}

	public void setLugar(EstadoCopia lugar) {
		this.lugar = lugar;
	}

	@Override
	public String toString() {
		return "Copia [id=" + id + ", lugar=" + lugar + "]";
	}
	
	

}
