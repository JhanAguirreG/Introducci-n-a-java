import java.util.Scanner;
public class NumeroPorTeclado {
    public static void main(String[] args) {
        //se crea el scanner para poder ingresar a la terminal
        Scanner scanner = new Scanner(System.in);
        
        // se escribe un numero que siempre sea entero
        System.out.print("Por favor, introduce un número entero: ");
        int numero = scanner.nextInt();
        
        // con un condicinal se puede saber si se puede dividir entre 2
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es divisible entre 2.");
        } else {
            System.out.println("El número " + numero + " no es divisible entre 2.");
        }
    }
}