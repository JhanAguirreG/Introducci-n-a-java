import java.util.Scanner;
/*Crear un programa donde se implemente una clase en la cual calcule el salario de
un empleado a partir de sus horas trabajadas y el valor de la hora ingresados
previamente, crear un método que permita calcular el 4% de salud y un método para
calcular la pensión del 3%.*/

class empleado {
    private double salario;
    private double horastrabajadas;
    private double valor;
    
    public empleado (int salario, int horastrabajadas, int valor) {
        this.salario = salario;
        this.horastrabajadas = horastrabajadas;
        this.valor = valor;
        
    }
     public double calculadorasalario () {
        return this.valor*horastrabajadas;
    }
    public double calculadorasalud() {
        return 0.04*salario;
    }           
}   
        public class ejercicioseis {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("ingrese el salario del empleado: ");
            double salario = scanner.nextDouble();
            
            System.out.print("Ingrese las horas laboradas: ");
            double horastrabajadas = scanner.nextDouble();
    
            System.out.print("Ingrese el valor de la hora laborada: ");
            double valor = scanner.nextDouble();

            
            System.out.println("Salario: " + salario);
            System.out.println("Deducción por salud (4%): " + salud);
            System.out.println("Deducción por pensión (3%): " + pension);
    

}
}
