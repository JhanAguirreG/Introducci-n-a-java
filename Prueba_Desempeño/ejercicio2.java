import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Acá pedimos 3 numeros
        System.out.println("Ingrese el valor de x:");
        int x = sc.nextInt();
        System.out.println("Ingrese el valor de y:");
        int y = sc.nextInt();
        System.out.println("Ingrese el valor de z:");
        int z = sc.nextInt();
        //con estos if anidados determinamos al mayor de todos los numeros y de paso si son iguales también lo va a determinar
        if (x > y && x > z) {
            System.out.println("el primer numero es el mayor");
        } else {
            if (y > x && y > z) {
                System.out.println("el segundo numero es el mayor");
            } else {
                if (z > x && z > y) {
                    System.out.println("el tercer numero es el mayor");
                } else {
                    System.out.println("Son iguales");
                }
            }
        }
    }
}
