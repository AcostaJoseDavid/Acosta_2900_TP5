package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * @author Acosta Jose David
 */
@Component
public class Resultado {
	/** Atributo que representa la fecha de Resultado*/
	private LocalDate fecha;
	/** Atributo que representa equipo 1 de Resultado*/
	@Autowired
	private Equipo equipo1;
	/** Atributo que representa equipo 2 de Resultado*/
	@Autowired
	private Equipo equipo2;
	/** Atributo que representa goles de equipo 1 de Resultado*/
	private int golesEquipo1;
	/** Atributo que representa goles de equipo 2 de Resulado*/
	private int golesEquipo2;
	
	//------CONSTRUCTORES------
	/**
	 * Constructor por defecto
	 */
	public Resultado() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param fecha valor de fecha de Resultado
	 * @param equipo1 valor de equipo 1 de Resutado
	 * @param equipo2 valor de equipo 2 de Resultado
	 * @param golesEquipo1 valor de goles de equipo 1 de Resultado
	 * @param golesEquipo2 valor de goles de equipo 2 de Resultado
	 */
	public Resultado(LocalDate fecha, Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
		super();
		this.fecha = fecha;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.golesEquipo1 = golesEquipo1;
		this.golesEquipo2 = golesEquipo2;
	}

	//--------METODOS--------
	/**
	 * Devuelve la fecha de Resultado
	 * @return this.fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}
	/**
	 * Asigna un valor a fecha de Resultado
	 * @param fecha valor de fecha
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	/**
	 * Devuelve equipo1 de Resultado
	 * @return this.equipo1
	 */
	public Equipo getEquipo1() {
		return equipo1;
	}
	/**
	 * Asigna un valor a equipo1 de Resultado
	 * @param equipo1 valor de equipo1
	 */
	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}
	/**
	 * Devuelve equipo2 de Resultado
	 * @return this.equipo2
	 */
	public Equipo getEquipo2() {
		return equipo2;
	}
	/**
	 * Asigna un valor a equipo2 de Resultado
	 * @param equipo2 valor de equipo2
	 */
	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}
	/**
	 * Devuelve los goles de equipo 1 de Resultado
	 * @return this.golesEquipo1
	 */
	public int getGolesEquipo1() {
		return golesEquipo1;
	}
	/**
	 * Asigna un valor a golesEquipo1 de Resultado
	 * @param golesEquipo1 valor de golesEquipo1
	 */
	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}
	/**
	 * Devuelve los goles de equipo 2 de Resultado
	 * @return this.golesEquipo2
	 */
	public int getGolesEquipo2() {
		return golesEquipo2;
	}
	/**
	 * Asigna un valor a golesEquipo2 de Resultado
	 * @param golesEquipo2 the golesEquipo2 to set
	 */
	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}
	/**
	 * Sobreescribe el metodo para que muestre la fecha, equipo 1, equipo 2, goles de equipo 1 y goles de equipo 2
	 * de Resultado 
	 */
	@Override
	public String toString() {
		return "Resultado [fecha=" + fecha + ", equipo1=" + equipo1 + ", equipo2=" + equipo2 + ", golesEquipo1="
				+ golesEquipo1 + ", golesEquipo2=" + golesEquipo2 + "]";
	}
	
}
