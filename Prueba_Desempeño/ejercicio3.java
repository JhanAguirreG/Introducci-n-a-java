import java.util.Scanner;

public class ejercicio3 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //hacemos una función que nos pida un numero 
        System.out.println("Ingrese un numero :");
        int x = sc.nextInt();
        //acá determinamos si el modulo de la división del numero que pusimos es igual a 0, si es así dirá que es par
        // si no es así dirá que es impar
        if (x%2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("No es par");
        }
    }
}
