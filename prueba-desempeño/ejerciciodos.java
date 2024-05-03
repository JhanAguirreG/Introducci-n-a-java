import java.util.Scanner;

public class ejerciciodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double numero2 = scanner.nextDouble();

        System.out.println("Ingrese el tercer número:");
        double numero3 = scanner.nextDouble();

        double mayor = numero1;

        if (numero2 > mayor) {
            mayor = numero2;
        }

        if (numero3 > mayor) {
            mayor = numero3;
        }

        System.out.println("El mayor de los tres números es: " + mayor);

        scanner.close();
    }
}