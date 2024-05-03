import java.util.Scanner;
/*Realiza un programa que permita ingresar una cantidad n de salarios, luego deberá
mostrar el salario máximo ingresado, promedio y el total de salarios pagados*/
public class ejerciciocinco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de salarios:");
        int cantidadsalarios = scanner.nextInt();

        double salariomaximo = 0;
        double sumasalarios = 0;

        for (int i = 1; i <= cantidadsalarios; i++) {
            System.out.print("por favor ingrese el salario " + i + ": ");
            double salario = scanner.nextDouble();
            sumasalarios = sumasalarios+salario;
            
            if (salario > salariomaximo) {
                salariomaximo = salario;

                
            
            }
        }
        double promediosalarios = sumasalarios / cantidadsalarios;

        System.out.println("Este es el salario máximo ingresado: " + salariomaximo);
        System.out.println("Promedio de salarios: " + promediosalarios);
        System.out.println("Total de salarios pagados: " + sumasalarios);
   

}
}