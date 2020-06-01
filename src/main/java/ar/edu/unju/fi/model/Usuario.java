package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;
/**
 * @author Acosta Jose David
 */
@Component
public class Usuario {
	/** Atributo que representa el id de Usuario*/
	private long id;
	/** Atributo que representa el nombre de Usuario*/
	private String nombre;
	/** Atributo que representa el apellido de Usuario*/
	private String apellido;
	/** Atributo que representa la fecha de nacimiento de Usuario*/
	private LocalDate fechaNacimiento;
	/** Atributo que representa la direccion de Usuario*/
	private String direccion;
	/** Atributo que representa el numero de dni de Usuario*/
	private long dni;
	/** Atributo que representa la fecha de alta de Usuario*/
	private LocalDate fechaAlta;
	/** Atributo que representa el tipo de Usuario*/
	private String tipo;
	/** Atributo que representa la constraseña de Usuario*/
	private String password;
	
	//------CONSTRUCTORES------
	/**
	 * Constructor por defecto
	 */
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param id valor del id de Usuario
	 * @param nombre valor del nombre de Usuario
	 * @param apellido valor del apellido de Usuario
	 * @param fechaNacimiento valor de la fechaNacimiento de Usuario
	 * @param direccion valor de la direccion de Usuario
	 * @param dni valor del dni de Usuario
	 * @param fechaAlta valor de la fechaAlta de Usuario
	 * @param tipo valor del tipo de Usuario
	 * @param password valor del password de Usuario
	 */
	public Usuario(long id, String nombre, String apellido, LocalDate fechaNacimiento, String direccion, long dni,
			LocalDate fechaAlta, String tipo, String password) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.dni = dni;
		this.fechaAlta = fechaAlta;
		this.tipo = tipo;
		this.password = password;
	}

	//--------METODOS--------
	/**
	 * Devuelve el id de Usuario
	 * @return this.id
	 */
	public long getId() {
		return id;
	}
	/**
	 * Asigna un valor al id de Usuario 
	 * @param id valor del id
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * Devuelve el nombre de Usuario
	 * @return this.nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Asigna un valor al nombre de Usuario 
	 * @param nombre valor del nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Devuelve el apellido de Usuario
	 * @return this.apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * Asigna un valor al apellido de Usuario 
	 * @param apellido valor del apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * Devuelve la fecha de nacimiento de Usuario
	 * @return this.fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	/**
	 * Asigna un valor a la fechaNacimiento de Usuario
	 * @param fechaNacimiento valor de fechaNacimiento
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	/**
	 * Devuelve la direccion de Usuario
	 * @return this.direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * Asigna un valor a la direccion de Usuario
	 * @param direccion valor de direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * Devuelve el numero de dni de Usuario
	 * @return this.dni
	 */
	public long getDni() {
		return dni;
	}
	/**
	 * Asigna un valor a dni de Usuario
	 * @param dni valor de dni
	 */
	public void setDni(long dni) {
		this.dni = dni;
	}
	/**
	 * devuelve la fecha de alta de Usuario
	 * @return this.fechaAlta
	 */
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}
	/**
	 * Asigna un valor a fechaAlta de Usuario
	 * @param fechaAlta valor de fechaAlta
	 */
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	/**
	 * Devuelve el tipo de Usuario
	 * @return this.tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * Asigna un valor a tipo de Usuario
	 * @param tipo valor de tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * Devuelve el password de Usuario
	 * @return this.password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * Asigna un valor al possword de Usuario
	 * @param password valor de password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * Sobreescribe el metodo para que muestre el id, nombre, apellido, fecha de nacimiento, direccion, dni, fecha de alta
	 * tipo y password de Usuario
	 */
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento="
				+ fechaNacimiento + ", direccion=" + direccion + ", dni=" + dni + ", fechaAlta=" + fechaAlta + ", tipo="
				+ tipo + ", password=" + password + "]";
	}
}
