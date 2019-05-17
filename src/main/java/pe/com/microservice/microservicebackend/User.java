package pe.com.microservice.microservicebackend;

public class User {

	private String usuario;
	private String nombre;
	private String email;
	private String telefono;
	
	public User(String usuario, String nombre, String email, String telefono) {
		super();
		this.usuario = usuario;
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
}
