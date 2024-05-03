import java.util.Scanner;
//Creé una clase la cual me guardara 2 numeros 
class Numeros{
    int numero1;
    int numero2;

// este es el constructor de la clase
    public Numeros(int numero1, int numero2){
        this.numero1=numero1;
        this.numero2=numero2;
    };
    public int getNumero1(){
        return numero1;
    }

    public int getNumero2(){
        return numero2;
    }
}

public class NumerosQuesonIguales {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // En estas lineas pedimos los 2 numeros
        System.out.println("Ingrese el primer numero: ");
        int numero1=sc.nextInt();
        
        
        System.out.println("Ingrese el segundo numero: ");
        int numero2=sc.nextInt();
        
     // y en esta guardamos los numeros en la clase que hicimos anteriormente
        Numeros Numb=new Numeros(numero1,numero2);
 // con estos ifs determinamos si los numeros son iguales o no 
        if (numero1 == numero2) {
            System.out.println("Los numeros son iguales");
        } else {
            System.out.println("Los numeros no son iguales");
        }
}
}
