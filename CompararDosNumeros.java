import java.util.Scanner;

public class CompararDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar a la persona que ingrese los números
        System.out.println(" Ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.println(" Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        // Proceso de comparar los números
        if (numero1 == numero2) {
            System.out.println(" Los números son iguales ");
        } else {
            System.out.println(" Los números no son iguales ");
        }
    }
}
