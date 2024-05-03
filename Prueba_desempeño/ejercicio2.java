import java.util.Scanner;
public class ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.println("ingrese el numero 1");
        num1= sc.nextInt();
        System.out.println("ingrese el numero 2");
        num2= sc.nextInt();
        System.out.println("ingrese el numero 3");
        num3= sc.nextInt();
        if (num1>num2 && num1>num3){
            System.out.println("el numero 1 es mayor");
            
        }else if (num2>num1 && num2>num3) {
                System.out.println("numero 2 es mayor");

                
        }else if(num3>num1 && num3>num1){ 
            System.out.println("numero 3 es mayor");


        }
        
        
    

        

    }
    
}
