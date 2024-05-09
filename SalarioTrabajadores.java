import java.util.Scanner;

class Empleado {
    private String Nombre;
    private double horasTrabajadas;
    private double valorxHora;

    public Empleado (String Nombre, double horasTrabajadas, double valorxHora) {
        this.Nombre = Nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.valorxHora = valorxHora;
    }

    public double promediarSalario() {
        return horasTrabajadas * valorxHora;
    }

    public double calcularSalud() {
        return promediarSalario() * 0.04;
    }

    public double calcularPension() {
        return promediarSalario() * 0.03;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print(" Ingrese las horas trabajadas: ");
        double horasTrabajadas = scanner.nextDouble();

        System.out.print(" Ingrese el valor de la hora: ");
        double valorHora = scanner.nextDouble();

        Empleado empleado = new Empleado(nombre, horasTrabajadas, valorHora);

        double salario = empleado.promediarSalario();
        double salud = empleado.calcularSalud();
        double pension = empleado.calcularPension();

        System.out.println(" La nómina de " + empleado.Nombre + " es: $" + salario);
        System.out.println(" El porcentaje de salud es: $" + salud);
        System.out.println(" Y el porcentaje de la pensión es: $" + pension);
    }
}
