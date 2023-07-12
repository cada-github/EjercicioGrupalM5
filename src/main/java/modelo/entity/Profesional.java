package modelo.entity;

/** 
 * @version 1.0.0  Trabajo Sprint M5
 * @author Fabiana Vega
 * @author Cristian Díaz
 */

/** Clase Profesional extiende de clase Usuario
* Atributos:
* titulo
* fechaIngreso
*/
public class Profesional extends Usuario {
	
	private String titulo;
	private String fechaIngreso;
	
	// Constructores
	
	public Profesional() {}
	
	public Profesional(int runUsuario, String nombreUsuario, String fechaNacimiento, String tipo,
			String titulo, String fechaIngreso) {
		super(runUsuario, nombreUsuario, fechaNacimiento, tipo);
		
		this.setTitulo(titulo);
		this.setFechaIngreso(fechaIngreso);
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
	
	// Metodos sobreescritos

	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + 
				", fechaIngreso=" + fechaIngreso + 
				", toString()=" + super.toString()
				+ "]";
	}
	
}
