package proyecto.final1;

import java.time.LocalDate;

public class LibroEstudiante {

	private String codigo; 
	private String nombre; 
	private String anio; 
	private String estado; 
	private LocalDate fecha;
	private String autor;
	private String cedula;


	String getCodigo() {
		return codigo;
	}


	void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	String getNombre() {
		return nombre;
	}


	void setNombre(String nombre) {
		this.nombre = nombre;
	}


	String getAnio() {
		return anio;
	}


	void setAnio(String anio) {
		this.anio = anio;
	}


	String getEstado() {
		return estado;
	}


	void setEstado(String estado) {
		this.estado = estado;
	}


	LocalDate getFecha() {
		return fecha;
	}


	void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	String getAutor() {
		return autor;
	}


	void setAutor(String autor) {
		this.autor = autor;
	}


	String getCedula() {
		return cedula;
	}


	void setCedula(String cedula) {
		this.cedula = cedula;
	}


	@Override
	public String toString() {
		return "LibroEstudiante [codigo=" + codigo + ", nombre=" + nombre + ", anio=" + anio + ", estado=" + estado
				+ ", fecha=" + fecha + ", autor=" + autor + ", Reservado por: " + cedula + "]";
	}
	

}


