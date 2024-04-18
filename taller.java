import java.util.Scanner;
public class taller {
    
    public static void main(String[] args) {
       int name;
       double radio=0;
        
       Scanner Scanner = new Scanner(System.in);

     System.out.println("Hola, porfavor introduce tu nombre");
         name = Scanner.nextInt(); 
         System.out.print("perfecto, "+name );
         System.out.print(" ahora digita un radio que deses calcular");
         radio =Scanner.nextInt();
         double area=Math.PI*Math.pow(radio, 2);



    }
}
