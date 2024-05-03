import java.util.Scanner;

public class NumeroDivisible {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Ingrese su numero: ");
        int numero= sc.nextInt();

        //se da el proceso de "division" para saber si es divisible entre 2
        if (numero % 2 == 0){
            System.out.println("El numero ingresado es divisible entre 2");
        }
         else {
            System.out.println("El numero ingresado no es divisible entre 2");
         }

    }
}
