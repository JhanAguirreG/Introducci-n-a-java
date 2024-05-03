import java.util.Scanner;

class pagosempleados {
    double salario; // esta es la clase del salario para el empleado

    public pagosempleados(double salario) { // acá creamos un contructor con entradade datos
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de empleados: "); // acá determinamos la cantidad que va a tener nuestro array
        int numEmpleados = scanner.nextInt();

        pagosempleados[] ventas = new pagosempleados[numEmpleados]; //este es el array

        for (int i = 0; i < numEmpleados; i++) {
            System.out.println("Empleado #" + (i + 1));
            System.out.print("Salario: ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea

            ventas[i] = new pagosempleados(salario);
        }

        // Acá nos calcula la suma total de los salarios
        double sumaTotal = 0; // Cambio a double para manejar decimales
        for (pagosempleados venta : ventas) {
            sumaTotal += venta.getSalario();
        }

        // acá se pone a calcular la media de los salarios
        double mediaSalarios = sumaTotal / numEmpleados; // Cambio a double para manejar decimales
        System.out.printf("La media de los salarios es $%.2f\n", mediaSalarios);

        // Acá encuentra en los arrays el salario más alto 
        double salarioMaximo = Double.MIN_VALUE; // Inicializamos con el valor mínimo posible
        for (pagosempleados venta : ventas) {
            if (venta.getSalario() > salarioMaximo) {
                salarioMaximo = venta.getSalario();
            }
        }
        // acá nos imprime en pantalla el salario maximo
        System.out.println("Salario más alto: $" + salarioMaximo);
    }
}

