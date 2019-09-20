package dad.maven.gson;

public class Persona {
	private String nombre;
	private String apellidos;
	private int edad;
	
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellidos = apellido;
		this.edad = edad;
	}
	public String toString() {
		return "nombre: "+nombre+"\napellido: "+apellidos+"\nedad: "+ edad;
	}
}
