import java.util.Scanner;

public class Salarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de salarios:");
        int cantidadSalarios = scanner.nextInt();
        
        double salarioTotal = 0;
        double salarioMaximo = Double.MIN_VALUE;
        
        for (int i = 1; i <= cantidadSalarios; i++) {
            System.out.println("Ingrese el salario " + i + ":");
            double salario = scanner.nextDouble();
            salarioTotal += salario;
            
            if (salario > salarioMaximo) {
                salarioMaximo = salario;
            }
        }
        
        double promedioSalarios = salarioTotal / cantidadSalarios;
        
        System.out.println("Salario máximo ingresado: " + salarioMaximo);
        System.out.println("Promedio de salarios: " + promedioSalarios);
        System.out.println("Total de salarios pagados: " + salarioTotal);
        
    }
}
