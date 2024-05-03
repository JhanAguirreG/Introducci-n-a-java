
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        

        System.out.println("Por favor digita el primer numero.");
        int numero1 = sc.nextInt();

        System.out.println("Ahora digita el segundo numero.");
        int numero2 = sc.nextInt();
     /* de la linea 17 hasta la 22 es donde se ejecuta la operacion
      * para saber si son iguales o no
      */
        if ( numero1 == numero2) {
            System.out.println("Los numeros son los mismos.");

        }else if ( numero1 != numero2 ){
            System.out.println("los numeros no son iguales.");
        }
        
            
        
    }
}
