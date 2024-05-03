import java.util.Scanner;
public class Empleados {
    // creamos la clase
    private String nombre;
    private String cargo;
    private double horasLaboradas;
    private double valorHora;

    // le creamos un constructor a la clase 
    public T6(String nombre, String cargo, double horasLaboradas, double valorHora) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.horasLaboradas = horasLaboradas;
        this.valorHora = valorHora;
    }

    // creamos un método para calcular el salario total
    public double CSalario() {return horasLaboradas * valorHora;}

    // método para calcular la salud (4%)
    public double CSalud() {double salario = CSalario();
        return salario * 0.04;}

    // método para calcular la pensión (3%)
    public double CPension() {double salario = CSalario();
        return salario * 0.03;}

    public static void main(String[] args) {Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la informacion del trabajador
        System.out.println("Ingrese el nombre del trabajador:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el cargo del trabajador:");
        String cargo = scanner.nextLine();

        System.out.println("Ingrese las horas laboradas:");
        double horasLaboradas = scanner.nextDouble();

        System.out.println("Ingrese el valor de la hora:");
        double valorHora = scanner.nextDouble();

        // Crear un objeto con la informacion ingresada
        T6 trabajador = new T6(nombre, cargo, horasLaboradas, valorHora);

        // mostrar el resultado de la informacion
        System.out.println("\nInformacion del trabajador:");
        System.out.println("Nombre: " + trabajador.nombre);
        System.out.println("Cargo: " + trabajador.cargo);
        System.out.println("Horas trabajadas: " + trabajador.horasLaboradas);
        System.out.println("Valor hora: " + trabajador.valorHora);
        System.out.println("Salario total: " + trabajador.CSalario());
        System.out.println("Salud 4%: " + trabajador.CSalud());
        System.out.println("Pensión 3%: " + trabajador.CPension());

    }
}
