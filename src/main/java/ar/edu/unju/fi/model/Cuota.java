package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Acosta Jose David
 */
@Component
public class Cuota {
	/** Atributo que representa el Id de Cuota*/
	private long id;
	/** Atributo que representa la fecha de pago de la Cuota*/
	private LocalDate fechaPago;
	/** Atributo que representa el periodo de la Cuota*/
	private String periodo;
	/** Atributo que representa el monto de la Cuota*/
	private double monto;
	/** Atributo que representa el esta de la Cuota*/
	private String estado;
	/** Atributo que representa al usuario de la Cuota*/
	@Autowired
	private Usuario usuario;
	
	//----CONSTRUCTORES----
	/**
	 * Constructor por defecto
	 */
	public Cuota() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id valor del id de Cuota
	 * @param fechaPago valor de la fecha pago de Cuota
	 * @param periodo valor del periodo de Cuota
	 * @param monto valor del monto de Cuota
	 * @param estado valor de estado de Cuota
	 * @param usuario valor del usuario de la Cuota 
	 */
	public Cuota(long id, LocalDate fechaPago, String periodo, double monto, String estado, Usuario usuario) {
		super();
		this.id = id;
		this.fechaPago = fechaPago;
		this.periodo = periodo;
		this.monto = monto;
		this.estado = estado;
		this.usuario = usuario;
	}

	//------METODOS------
	/**
	 * Devuelve el Id de Cuota
	 * @return this.id
	 */
	public long getId() {
		return id;
	}
	/**
	 * Asigna un valor al id de Cuota
	 * @param id valor del id
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * Devuelve fecha pago de Cuota
	 * @return this.fechaPago
	 */
	public LocalDate getFechaPago() {
		return fechaPago;
	}
	/**
	 * Asigna un valor a fecha pago de Cuota
	 * @param fechaPago valor de fechaPago
	 */
	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}
	/**
	 * Devuelve periodo de Cuota
	 * @return this.periodo
	 */
	public String getPeriodo() {
		return periodo;
	}
	/**
	 * Asigna un valor a periodo de Cuota
	 * @param periodo valor de periodo
	 */
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	/**
	 * Devuelve monto de Cuota
	 * @return this.monto
	 */
	public double getMonto() {
		return monto;
	}
	/**
	 * Asigna un valor a monto de Cuota
	 * @param monto valor de monto
	 */
	public void setMonto(double monto) {
		this.monto = monto;
	}
	/**
	 * Devuelve estado de Cuota
	 * @return this.estado
	 */
	public String getEstado() {
		return estado;
	}
	/**
	 * Asigna un valor a estado de Cuota
	 * @param estado valor de estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	/**
	 * Devuelve usuario de Cuota
	 * @return this.cuota
	 */
	public Usuario getUsuario() {
		return usuario;
	}
	/**
	 * Asigna un valor a usuario de Cuota
	 * @param usuario valor de usuario
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	/**
	 * Sobreescribe el metodo para que muestre el id, la fecha de pago, el periodo, monto estado y usuario
	 * de la Cuota
	 */
	@Override
	public String toString() {
		return "Cuota [id=" + id + ", fechaPago=" + fechaPago + ", periodo=" + periodo + ", monto=" + monto
				+ ", estado=" + estado + ", usuario=" + usuario + "]";
	}
	
}
