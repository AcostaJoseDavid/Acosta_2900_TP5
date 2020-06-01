package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;
/**
 * @author Acosta Jose David
 */
@Component
public class Estadio {
	/** Atributo que representa el nombre de Estadio*/
	private String nombre;
	/** Atributo que representa la fecha de fundasion de Estadio*/
	private LocalDate fechaFundacion;
	/** Atributo que representa la ciudad de Estadio*/
	private String ciudad;
	/** Atributo que representa la capacidad de Estadio*/
	private int capacidad;
	/** Atributo que representa la direccion de Estadio*/
	private String direccion;
	
	//------CONSTRUCTORES------
	/**
	 * Constructor por defecto
	 */
	public Estadio() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param nombre valor del nombre de Estadio
	 * @param fechaFundacion valor de la fecha de fundacion de Estadio
	 * @param ciudad valor de la ciudad de Estadio
	 * @param capacidad valor de la capacidad de Estadio
	 * @param direccion valor de direccion de Estadio
	 */
	public Estadio(String nombre, LocalDate fechaFundacion, String ciudad, int capacidad, String direccion) {
		super();
		this.nombre = nombre;
		this.fechaFundacion = fechaFundacion;
		this.ciudad = ciudad;
		this.capacidad = capacidad;
		this.direccion = direccion;
	}
	//--------METODOS--------
	/**
	 * Devuelve el nombre de Estadio
	 * @return this.nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Asigna un valor a nombre de Estadio
	 * @param nombre valor de nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Devulve la fecha de fundacion de Estadio
	 * @return this.fechaFundacion
	 */
	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}
	/**
	 * Asigna un valor a fecha de fundacion de Estadio
	 * @param fechaFundacion valor de fechaFundacion
	 */
	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}
	/**
	 * Devuelve la ciudade de Estadio
	 * @return this.ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}
	/**
	 * Asigna un valor a ciudad de Estadio
	 * @param ciudad valor de ciudad
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	/**
	 * Devuelve la capacidad de Estadio
	 * @return this.capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}
	/**
	 * Asigna un valor a capacidad de Estadio
	 * @param capacidad valor de capacidad
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	/**
	 * Devuelve la direccion de Estadio
	 * @return this.direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * Asigna un valor a direccion de Estadio
	 * @param direccion valor de direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	/**
	 * Sobreescribe el metodo para que muestre el nombre, fecha de fundacion, ciudad, capacidad
	 * y direccion de Estadio
	 */
	@Override
	public String toString() {
		return "Estadio [nombre=" + nombre + ", fechaFundacion=" + fechaFundacion + ", ciudad=" + ciudad
				+ ", capacidad=" + capacidad + ", direccion=" + direccion + "]";
	}
}
