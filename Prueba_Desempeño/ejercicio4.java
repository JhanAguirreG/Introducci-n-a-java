import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //acá pedimos que el usuario nos digite su nombre
        System.out.println("¿Cual es tu nombre? :");
        String nombre = sc.nextLine();
  // acá imprimimos en pantalla una bienvenida, incluyendo con el nombre ingresado
        System.out.println("Bienvenido "+ nombre + " !");
    }
}
