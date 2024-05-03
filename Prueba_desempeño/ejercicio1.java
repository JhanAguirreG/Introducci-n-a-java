import java.util.Scanner;
public class ejercicio1{

    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num1;
            int num2;
            System.out.println("ingrese el primer numero");
            num1= scanner.nextInt();
            System.out.println("ingrese el numero 2");
            num2= scanner.nextInt();
            if (num1==num2){
                System.out.println("numeros iguales");
            }else{
                System.out.println("numeros diferentes");
            }
        }
}

