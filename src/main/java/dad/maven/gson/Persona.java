package dad.maven.gson;

public class Persona {
	String nombre;
	String apellidos;
	int edad;
	
	public Persona(String n, String a, int e) {
		nombre = n;
		apellidos = a;
		edad = e;
	}
	public String toString() {
		return "nombre: "+nombre+"\napellido: "+apellidos+"\nedad: "+ edad;
		
	}

}
