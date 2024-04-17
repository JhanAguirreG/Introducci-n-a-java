import java.util.Scanner;

public class main8 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que introduzca un carácter
        System.out.print("Por favor, introduce un carácter: ");
        char caracter = scanner.next().charAt(0); // Leemos solo el primer carácter
        
        // Obtener el código ASCII del carácter
        int codigoASCII = (int) caracter;
        
        // Mostrar el código ASCII por consola
        System.out.println("El código ASCII del carácter '" + caracter + "' es: " + codigoASCII);
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
}
