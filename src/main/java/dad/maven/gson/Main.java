package dad.maven.gson;
import java.util.Scanner;
import com.google.gson.*;

public class Main {

	public static void main(String[] args) {
		String nombre, apellido;
		int edad;
		Scanner sc = new Scanner(System.in);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		System.out.println("Introduzca su nombre");
		nombre = sc.nextLine();
		System.out.println("Introduzca su apellido");
		apellido = sc.nextLine();
		System.out.println("Introduzca su edad");
		edad = sc.nextInt();
		Persona p = new Persona(nombre,apellido,edad);
		System.out.println(gson.toJson(p));
		sc.close();

	}

}
