package modelo;

public class Cliente {
	
	private String nombres;
	private String apellidos;
	private String telefonos;
	private String afp;
	private int sistemaSalud;
	private String direccion;
	private String comuna;
	private byte edad;
	
	
	// constructores  
	
	public Cliente() {
		
	}


	public Cliente(String nombres, String apellidos, String telefonos, String afp, int sistemaSalud, String direccion,
			String comuna, byte edad) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefonos = telefonos;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getTelefonos() {
		return telefonos;
	}


	public void setTelefonos(String telefonos) {
		this.telefonos = telefonos;
	}


	public String getAfp() {
		return afp;
	}


	public void setAfp(String afp) {
		this.afp = afp;
	}


	public int getSistemaSalud() {
		return sistemaSalud;
	}


	public void setSistemaSalud(int sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getComuna() {
		return comuna;
	}


	public void setComuna(String comuna) {
		this.comuna = comuna;
	}


	public byte getEdad() {
		return edad;
	}


	public void setEdad(byte edad) {
		this.edad = edad;
	}
	
}
