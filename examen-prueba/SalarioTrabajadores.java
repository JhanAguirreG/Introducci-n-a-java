import java.util.Scanner;

class Empleado {
    private String nombre;
    private double horasTrabajadas;
    private double valorHora;

    public Empleado(String nombre, double horasTrabajadas, double valorHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public double calcularSalario() {
        return horasTrabajadas * valorHora;
    }

    public double calcularSalud() {
        return calcularSalario() * 0.04;
    }

    public double calcularPension() {
        return calcularSalario() * 0.03;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese las horas trabajadas: ");
        double horasTrabajadas = scanner.nextDouble();

        System.out.print("Ingrese el valor de la hora: ");
        double valorHora = scanner.nextDouble();

        Empleado empleado = new Empleado(nombre, horasTrabajadas, valorHora);

        double salario = empleado.calcularSalario();
        double salud = empleado.calcularSalud();
        double pension = empleado.calcularPension();

        System.out.println("El salario de " + empleado.nombre + " es: $" + salario);
        System.out.println("La contribución a salud es: $" + salud);
        System.out.println("La contribución a pensión es: $" + pension);

        scanner.close();
    }
}
