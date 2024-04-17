import java.util.Scanner;

public class main6 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que introduzca un número
        System.out.print("Por favor, introduce un número entero: ");
        int numero = scanner.nextInt();
        
        // Comprobar si el número es divisible entre 2
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es divisible entre 2.");
        } else {
            System.out.println("El número " + numero + " no es divisible entre 2.");
        }
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
}
