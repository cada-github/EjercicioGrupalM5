package modelo;

/** 
 * @version 1.0.0  Trabajo Sprint M4
 * @author Nicolae Villegas
 * @author Jesus Torres
 * @author Cristian Díaz
 * @author Fabiana Vega
 */

/** Clase Profesional extiende de clase Usuario
* Atributos:
* titulo
* fechaIngreso
*/
public class Profesional extends Usuario{

	private String titulo;
	private String fechaIngreso;
	
	
	// Constructores 
	
	public Profesional() {}


	public Profesional(String nombreUsuario, String fechaNacimiento, int rut,
			String titulo, String fechaIngreso) {
		super(nombreUsuario, fechaNacimiento, rut);
		
		this.setTitulo(titulo);
		this.setFechaIngreso(fechaIngreso);
		this.titulo = this.getTitulo();
		this.fechaIngreso = this.getFechaIngreso();
	}

	// Metodos getters y setters

	/**
	 * @return Retorna cadena titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo Recibe y valida cadena titulo
	 * obligatorio, mínimo 10 caracteres, máximo 50
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return Retorna cadena fechaIngreso
	 */
	public String getFechaIngreso() {
		return fechaIngreso;
	}

	/**
	 * @param fechaIngreso Recibe y valida cadena fechaIngreso
	 * independiente si lo declara como una fecha o un String, 
	 * debe ser desplegado con el formato DD/MM/AAAA
	 */
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
}
