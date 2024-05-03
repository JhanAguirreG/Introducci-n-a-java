import java.util.Scanner;
public class T5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al ususario ingresar el numero de sueldos
        System.out.print("Ingrese el numero de sueldos: ");
        int cantidadsueldos = scanner.nextInt();
        
        // declarar un arreglo para guardar los sueldos
        double[] sueldos = new double[cantidadsueldos];
        
        // Pedir al usuario ingresar cada sueldo y guardarlo
        for (int i = 0; i < cantidadsueldos; i++) {System.out.print("Ingrese el sueldo " + (i+1) + ": ");
            sueldos[i] = scanner.nextDouble();}
        
        // calcular el sueldo mayor 
        double sueldoMaximo = sueldos[0];
        for (int i = 1; i < cantidadsueldos; i++) {
            if (sueldos[i] > sueldoMaximo) {
                sueldoMaximo = sueldos[i];
            }
        }
        
        // Calcular el total de sueldos y el promedio de los sueldos
        double totalsueldos = 0;
        for (double sueldo : sueldos) {
            totalsueldos += sueldo;
        }
        double promediosueldos = totalsueldos / cantidadsueldos;
        
        // Mostrar los resultados
        System.out.println("El sueldo mas alto es: " + sueldoMaximo);
        System.out.println("El promedio de los sueldos: " + promediosueldos);
        System.out.println("El total de los sueldos es: " + totalsueldos);
            }
}
