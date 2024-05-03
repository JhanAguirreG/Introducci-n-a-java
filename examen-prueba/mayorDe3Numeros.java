import java.util.Scanner;
public class MayorDe3Numneros {
    public static void main(String[] args) {
        // se crea un scanner para poder ingresar al terminal
        Scanner scanner = new Scanner(System.in);

        //se ingresa el primer numero 
        System.out.println("Ingrese el número 1:");
        //se escanea el sistema con un double para que este pueda ser decimal 
        double n1 = scanner.nextDouble();

// SE REPITRE LOS MISMOS COMENTARIOS QUE EN EL PRIMER NUMERO
        System.out.println("Ingrese el número 2:");
        double n2 = scanner.nextDouble();

        System.out.println("Ingrese el número 3 :");
        double n3 = scanner.nextDouble();

        //se selecciona el numero mayor por seleccion 
        double max = n1;

        //se indica una funcion para poder determinar el numero mayor 
        if (n2 > max) {max = n2;}

        if (n3 > max) {max = n3;}

        //se imprime el resultado de toda la operacion 
        System.out.println("El número mayor es: " + max);
    }
}