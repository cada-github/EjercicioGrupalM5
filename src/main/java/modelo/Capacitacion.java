package modelo;

/** 
 * @version 1.0.0  Trabajo Sprint M4
 * @author Nicolae Villegas
 * @author Jesus Torres
 * @author Cristian Díaz
 * @author Fabiana Vega
 */

/**
 * Clase Capacitacion
 * Atributos:
 * identificador
 * rutCliente
 * dia
 * hora
 * lugar
 * duracion
 * cantidadAsistentes
 */
public class Capacitacion {
	
	// Variables de clase (atributos)
		private int identificador;
		private int rutCliente;
		private String dia;
		private String hora;
		private String lugar;
		private String duracion;
		private int cantidadAsistentes;
		
	// constructores 	
		
		public Capacitacion() {	}

		public Capacitacion(int identificador,
				int rutCliente,
				String dia,
				String hora,
				String lugar,
				String duracion,
				int cantidadAsistentes) {
			
			this.setIdentificador(identificador);
			this.setRutCliente(rutCliente);
			this.setDia(dia);
			this.setHora(hora);
			this.setLugar(lugar);
			this.setDuracion(duracion);
			this.setCantidadAsistentes(cantidadAsistentes);
			
			this.identificador = this.getIdentificador();
			this.rutCliente = this.getRutCliente();
			this.dia = this.getDia();
			this.hora = this.getHora();
			this.lugar = this.getLugar();
			this.duracion = this.getDuracion();
			this.cantidadAsistentes = this.getCantidadAsistentes();
		}

		// Metodos getters y setters
		
		/**
		 * @return Retorna entero identificador
		 */	
		public int getIdentificador() {
			return identificador;
		}

		/**
		 * @param identificador Recibe y valida entero identificador
		 * obligatorio, número interno de la capacitación manejado por la empresa
		 */
		public void setIdentificador(int identificador) {
			this.identificador = identificador;
		}

		/**
		 * @return Retorna entero rut del cliente
		 */
		public int getRutCliente() {
			return rutCliente;
		}

		/**
		 * @param rutCliente Recibe y valida entero rutCliente
		 * obligatorio
		 */
		public void setRutCliente(int rutCliente) {
			this.rutCliente = rutCliente;
		}

		/**
		 * @return Retorna cadena dia
		 */
		public String getDia() {
			return dia;
		}

		/**
		 * @param dia Recibe y valida dia
		 * texto, día de la semana. 
		 * Debe ser un valor permitido entre lunes y Domingo (en ese formato)
		 */
		public void setDia(String dia) {
			this.dia = dia;
		}

		/**
		 * @return Retorna cadena hora
		 */
		public String getHora() {
			return hora;
		}

		/**
		 * @param hora Recibe y valida cadena hora
		 * debe ser una hora válida del día, 
		 * en formato HH:MM (hora desde 0 a 23, minutos entre 0 y 59)
		 */
		public void setHora(String hora) {
			this.hora = hora;
		}

		/**
		 * @return Retorna cadena lugar
		 */
		public String getLugar() {
			return lugar;
		}

		/**
		 * @param lugar Recibe y valida cadena lugar
		 * obligatorio, mínimo 10 caracteres, máximo 50
		 */
		public void setLugar(String lugar) {
			this.lugar = lugar;
		}

		/**
		 * @return Retorna cadena duracion
		 */
		public String getDuracion() {
			return duracion;
		}

		/**
		 * @param duracion Recibe y valida cadena duracion
		 * máximo 70 caracteres
		 */
		public void setDuracion(String duracion) {
			this.duracion = duracion;
		}

		/**
		 * @return Retorna entero cantidad asistentes
		 */
		public int getCantidadAsistentes() {
			return cantidadAsistentes;
		}

		/**
		 * @param cantidadAsistentes Recibe y valida entero cantidad de asistentes
		 * obligatorio, número entero menor que 1000
		 */
		public void setCantidadAsistentes(int cantidadAsistentes) {
			this.cantidadAsistentes = cantidadAsistentes;
		}
}
