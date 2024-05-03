import java.util.Scanner;
public class T2 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        //le pedimos al ususario que ingrese los numeros
        System.out.println("Ingrese el número 1:");
        //El sistena escanea y guarda la informacion
        double n1 = scanner.nextDouble();

        System.out.println("Ingrese el número 2:");
        double n2 = scanner.nextDouble();

        System.out.println("Ingrese el número 3 :");
        double n3 = scanner.nextDouble();

        //Definimos el numero mayor
        double max = n1;

        //colocamos un condicional para determinar el numero mayor
        if (n2 > max) {max = n2;}

        if (n3 > max) {max = n3;}

        //le decimos al programa que indique el numero mayor
        System.out.println("El número mayor es: " + max);
    }
}
