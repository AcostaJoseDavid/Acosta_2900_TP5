package ar.edu.unju.fi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Acosta Jose David
 */
@Component
public class Equipo {
	/** Atributo que representa el nombre del Equipo */
	private String nombre;
	/** Atributo que representa el estadio del Equipo */
	private Estadio estadio;
	
	//------CONSTRUCTORES------
	/**
	 * Constructor por defecto
	 */
	public Equipo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre valor del nombre de Equipo
	 * @param estadio valor del estadio de Equipo
	 */
	public Equipo(String nombre, Estadio estadio) {
		super();
		this.nombre = nombre;
		this.estadio = estadio;
	}

	/**
	 * 
	 * @param estadio
	 */
	@Autowired
	public Equipo(Estadio estadio) {
		super();
		this.estadio = estadio;
	}

	//--------METODOS--------
	/**
	 * Devuelve el nombre de Equipo
	 * @return this.nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asigna un valor a nombre de Equipo
	 * @param nombre valor del nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el estadio de Equipo
	 * @return this.estadio
	 */
	public Estadio getEstadio() {
		return estadio;
	}

	/**
	 * Asigna un valor a estadio de Equipo
	 * @param estadio valor de estadio
	 */
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
	
	/**
	 * Sobreescribe el metodo para que muestre el nombre y estadio de Equipo
	 */
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", estadio=" + estadio + "]";
	}
	
}
