package co.uniquindio.biblioteca.model;


public enum EstadoCopia {

	BIBLIOTECA(0), PRESTADO(1), RETASO(2), REPARACION(3);
	
	private int codigo ;

	/**
	 * @param codigo
	 */
	private EstadoCopia(int codigoDoc) {
		this.codigo = codigoDoc;
	}



	public EstadoCopia getEstadoCopia (int index)
	{
		switch (index)
		{
		    case 0 : return EstadoCopia.BIBLIOTECA;

		    case 1 : return EstadoCopia.PRESTADO;

		    case 2 : return EstadoCopia.RETASO;

		    case 3 : return EstadoCopia.REPARACION;

		    default : return null;
		}
	}
}
