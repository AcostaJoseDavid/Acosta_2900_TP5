package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;
/** 
 * @author Acosta Jose David 
 */
@Component
public class Noticia {
	/** Atributo que representa la feche de la Noticia*/
	private LocalDate fecha;
	/** Atributo que representa el titulo de la Noticia*/
	private String titulo;
	/** Atributo que representa el resumen de la Noticia*/
	private String resumen;
	
	//------CONSTRUCTORES------
	/**
	 * constructor por defecto
	 */
	public Noticia() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param fecha valor de la fecha de Noticia
	 * @param titulo valor del titulo de Noticia
	 * @param resumen valor del resumen de Noticia 
	 */
	public Noticia(LocalDate fecha, String titulo, String resumen) {
		super();
		this.fecha = fecha;
		this.titulo = titulo;
		this.resumen = resumen;
	}

	//-------METODOS--------
	/**
	 * Devuelve la fecha de Noticia
	 * @return this.fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}
	/**
	 * Asigna un valor a fecha de Noticia 
	 * @param fecha valor de fecha
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	/**
	 * Devuelve el titulo de Noticia
	 * @return this.titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * Asigna un valor a titulo de Noticia
	 * @param titulo valor de titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * Devuelve el resumen de Noticia
	 * @return this.resumen
	 */
	public String getResumen() {
		return resumen;
	}
	/**
	 * Asigna un valor a resumen de Noticia
	 * @param resumen valor de resumen
	 */
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	
	/**
	 * Sobreescribe el metodo para que muestre la fecha, el titulo y un resumen de Noticia
	 */
	@Override
	public String toString() {
		return "Noticia [fecha=" + fecha + ", titulo=" + titulo + ", resumen=" + resumen + "]";
	}
}
