package proyecto.final1;

public class LibroBibliotecario {

    String codigo;
	String nombre; 
    String autor; 
    String anioPublicacion; 
    String editorial; 
    int cantidadPaginas; 
    double precio;
    String cedula; 
    
	String getCedula() {
		return cedula;
	}
	void setCedula(String cedula) {
		this.cedula = cedula;
	}
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
	String getAutor() {
		return autor;
	}
	void setAutor(String autor) {
		this.autor = autor;
	}
	String getAnioPublicacion() {
		return anioPublicacion;
	}
	void setAnioPublicacion(String anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	String getEditorial() {
		return editorial;
	}
	void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	int getCantidadPaginas() {
		return cantidadPaginas;
	}
	void setCantidadPaginas(int cantidadPaginas) {
		this.cantidadPaginas = cantidadPaginas;
	}
	double getPrecio() {
		return precio;
	}
	void setPrecio(double precio) {
		this.precio = precio;
	}
    
	

}
