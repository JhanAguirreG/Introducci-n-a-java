import java.util.Scanner;
public class TresNumerosMayores {
    public static void main(String[] args) {
        // Creamos un scanner para obtener la entrada del usuario desde el teclado
        Scanner scanner = new Scanner(System.in);

        //Ingresamos el primer número, el segundo y el tercero
        System.out.println(" Ingrese el primer número:");

        //Lo relacionamos como Double para detectarlo como número decimal
        double n1 = scanner.nextDouble();

        System.out.println(" Ingrese el segundo número:");
        double n2 = scanner.nextDouble();

        System.out.println(" Ingrese el tercer número:");
        double n3 = scanner.nextDouble();

        //Seleccionamos para así mostrar el resultado
        double max = n1;

        //Indicamos una función para determinar el número mayor
        if (n2 > max) {max = n2;}

        if (n3 > max) {max = n3;}

        //Se "imprime" o se muestra en pantalla el resultado deseado
        System.out.println(" El número mayor es: " + max);
    }
}