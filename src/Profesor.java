
public class Profesor {
	
	private String nombre;
	private String dni;
	private int telefono;
	
	
	/**
	 * @param nombre
	 * @param dni
	 * @param telefono
	 */
	public Profesor(String nombre, String dni, int telefono) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	

}
