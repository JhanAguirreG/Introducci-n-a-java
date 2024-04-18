import java.util.Scanner;
public class taller {
    
    public static void main(String[] args) {
       int name;
       double radio=0;
       int num=0;
        
       Scanner Scanner = new Scanner(System.in);

     System.out.println("Hola, porfavor introduce tu nombre");
         name = Scanner.nextInt(); 
         System.out.print("perfecto, "+name );
         System.out.print(" ahora digita un radio que deses calcular");
         radio =Scanner.nextInt();
            double area=Math.PI*Math.pow(radio, 2);
              //___\\
            System.out.print("el areae es: "+area);
            //___________________________________________________________
        if (area%2 ==0){
            System.out.println(area+" Es divisible por 2");
        }else{
            System.out.println(area+" No es divisible por 2");

        }
      //__________________\\
      System.out.println(name+"digita el caracter que desas ver en la tabla ASCII");
      char caracter = sc.next().CharAT(0);
      int codigo = (int) caracter;
 
        System.out.println("ASCII: "+codigo);


    }
}
