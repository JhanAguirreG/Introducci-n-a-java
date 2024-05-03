import java.util.Scanner;

    public class MayorMenor1 {   

        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);

                System.out.println("Ingrese su primer numero: ");
                int numero_1= sc.nextInt();
                
                System.out.println("Ingrese su segundo numero: ");
                int numero_2= sc.nextInt();
                
                System.out.println("Ingrese su tercer numero: ");
                int numero_3= sc.nextInt();

                //se inicializa como mayor el numero 1
                int Mayor = numero_1;
                
                //si el numero 2 es mayor que el nuemro 1 se actualiza el mayor
                if (numero_2 > Mayor) {
                        Mayor=numero_2;
                }
                
                //si el numero 3 es mayor que el nuemro 2 se actualiza el mayor
                if (numero_3 > Mayor) {
                        Mayor = numero_3;
                }

                System.out.println("El numero mayor entre los tres es: "+ Mayor);
        }
    }