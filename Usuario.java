// Archivo: Usuario.java
// Se importa la clase Scanner para poder leer entradas por teclado
import java.util.Scanner;

// Se define la clase pública llamada "Usuario"
public class Usuario {
    // Se declara un atributo privado de tipo String para almacenar el nombre del usuario
    private String nombre;
    // Se declara un atributo privado de tipo int para almacenar la edad del usuario
    private int edad;

    // Constructor de la clase Usuario que recibe dos parámetros: nombre y edad
    public Usuario(String nombre, int edad) {
        // Se asigna el valor del parámetro nombre al atributo de instancia nombre
        this.nombre = nombre;
        // Se asigna el valor del parámetro edad al atributo de instancia edad
        this.edad = edad;
    }

    // Método estático que permite ingresar los datos de una persona por teclado
    public static Usuario ingresarDatosPersona() {
        // Se crea un objeto Scanner para leer entradas del usuario por consola
        Scanner scanner = new Scanner(System.in);

        // Se solicita al usuario que ingrese su nombre
        System.out.print("Ingrese su nombre: ");
        // Se lee el nombre ingresado y se guarda en una variable local
        String nombre = scanner.nextLine();

        // Se solicita al usuario que ingrese su edad
        System.out.print("Ingrese su edad: ");
        // Se lee la edad como un número entero y se guarda en una variable local
        int edad = scanner.nextInt();
        // Se limpia el buffer del scanner para evitar errores con lecturas posteriores
        scanner.nextLine();

        // Se crea y retorna un nuevo objeto Usuario con los datos ingresados
        return new Usuario(nombre, edad);
    }

    // Método getter que retorna el nombre del usuario
    public String getNombre() {
        return nombre;
    }

    // Método getter que retorna la edad del usuario
    public int getEdad() {
        return edad;
    }
}
