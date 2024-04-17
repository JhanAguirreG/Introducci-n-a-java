import java.util.Scanner;

public class main9 {
    public static void main(String[] args) {
        // Definir la constante del IVA
        final double IVA = 0.21;
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que introduzca el precio del producto
        System.out.print("Por favor, introduce el precio del producto: ");
        double precioProducto = scanner.nextDouble();
        
        // Calcular el precio final con IVA
        double precioFinal = precioProducto * (1 + IVA);
        
        // Mostrar el precio final con IVA por consola
        System.out.println("El precio final con IVA del producto es: " + precioFinal);
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
}
