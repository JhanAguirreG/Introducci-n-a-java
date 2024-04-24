import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un nmero entre 0 y 9999
        System.out.println("Por favor, ingresa un nmero entre 0 y 9999:");
        int numero = scanner.nextInt();
        
        // Validar si el nmero est dentro del rango permitido
        if (numero >= 0 && numero <= 9999) {
            // Convertir el nmero a una cadena para facilitar su manipulaci
            String numeroComoCadena = String.valueOf(numero);
            
            // Crear una cadena para almacenar el nmero al revs
            String numeroAlReves = "";
            for (int i = numeroComoCadena.length() - 1; i >= 0; i--) {
                numeroAlReves += numeroComoCadena.charAt(i);
            }
            
            // Mostrar el nmero con las cifras al revs
            System.out.println("El nmero con las cifras al revs es: " + numeroAlReves);
        } else {
            // Si el nmero no est dentro del rango permitido, mostrar un mensaje de error
            System.out.println("El nmero ingresado est fuera del rango permitido.");
        }
