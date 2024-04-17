import java.util.Scanner;

public class main7 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que introduzca un número
        System.out.print("Por favor, introduce un número entero: ");
        int numero = scanner.nextInt();
        
        // Convertir el número a un carácter ASCII
        char caracter = (char) numero;
        
        // Mostrar el carácter por consola
        System.out.println("El carácter correspondiente al número " + numero + " en la tabla ASCII es: " + caracter);
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
}
