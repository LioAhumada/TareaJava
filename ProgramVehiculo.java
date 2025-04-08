// Archivo: ProgramVehiculo.java
// Se importa la clase Scanner para permitir la lectura de datos desde el teclado
import java.util.Scanner;

// Se declara la clase pública llamada ProgramVehiculo
public class ProgramVehiculo {
    // Método principal del programa, punto de entrada
    public static void main(String[] args) {
        // Se solicita al usuario que ingrese sus datos mediante el método ingresarDatosPersona
        Usuario usuario = Usuario.ingresarDatosPersona();

        // Se crea un objeto Scanner para leer entradas desde la consola
        Scanner scanner = new Scanner(System.in);

        // Se pide al usuario ingresar la marca del vehículo
        System.out.print("\nIngrese la marca del vehículo: ");
        // Se almacena la entrada en la variable 'marca'
        String marca = scanner.nextLine();

        // Se pide al usuario ingresar el modelo del vehículo
        System.out.print("Ingrese el modelo del vehículo: ");
        // Se almacena la entrada en la variable 'modelo'
        String modelo = scanner.nextLine();

        // Se pide al usuario ingresar la cilindrada del vehículo (por ejemplo: 2000 cc)
        System.out.print("Ingrese la cilindrada (ej: 2000): ");
        // Se almacena la entrada como un número entero en la variable 'cilindrada'
        int cilindrada = scanner.nextInt();
        // Se limpia el buffer del scanner para evitar errores de lectura posteriores
        scanner.nextLine();

        // Se pide al usuario ingresar el tipo de combustible del vehículo
        System.out.print("Ingrese el tipo de combustible: ");
        // Se almacena la entrada en la variable 'combustible'
        String combustible = scanner.nextLine();

        // Se pide al usuario ingresar la capacidad de pasajeros del vehículo
        System.out.print("Ingrese la capacidad de pasajeros: ");
        // Se almacena la entrada como número entero en la variable 'pasajeros'
        int pasajeros = scanner.nextInt();

        // Se muestra por pantalla un resumen con los datos ingresados por el usuario
        System.out.println("\n--- Datos del Usuario y Vehículo ---");
        // Se muestra el nombre del usuario (obtenido a través del método getter)
        System.out.println("Nombre: " + usuario.getNombre());
        // Se muestra la edad del usuario
        System.out.println("Edad: " + usuario.getEdad());
        // Se muestra la marca del vehículo
        System.out.println("Marca del vehículo: " + marca);
        // Se muestra el modelo del vehículo
        System.out.println("Modelo: " + modelo);
        // Se muestra la cilindrada con la unidad "cc"
        System.out.println("Cilindrada: " + cilindrada + " cc");
        // Se muestra el tipo de combustible
        System.out.println("Combustible: " + combustible);
        // Se muestra la capacidad de pasajeros
        System.out.println("Capacidad: " + pasajeros + " pasajeros");

        // Se cierra el objeto Scanner para liberar recursos
        scanner.close();
    }
}
