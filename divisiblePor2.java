import java.util.Scanner;

public class divisiblePor2 {

    public class Tarea4 {
public static void main(String[] args) {
    try {
        Scanner teclado;
        int numero;
        int divi2 = 2;
        System.out.print("Introduce un número: ");
        teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        if ((numero % divi2 == 0) ){
            System.out.println("El número que has introducido, es divisible: "  + divi2);                
        }else{
                System.out.println("El número que has introducido, no es divisible o no has introducido un número.");
        }
    
    }
 }
}
    
}
