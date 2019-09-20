package dad.maven.gson;

public class Persona {
	String nombre;
	String apellidos;
	int edad;
	
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellidos = apellido;
		this.edad = edad;
	}
	public String toString() {
		return "nombre: "+nombre+"\napellido: "+apellidos+"\nedad: "+ edad;
		
	}

}
