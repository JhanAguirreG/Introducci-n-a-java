import java.util.Scanner;

class Venta {
    private double precio;
    private String descripcion;
    private String hora;
    private String nombreEmpleado;

    public Venta(double precio, String descripcion, String hora, String nombreEmpleado) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.hora = hora;
        this.nombreEmpleado = nombreEmpleado;
    }

    public double getPrecio() {
        return precio;
    }
}

public class tareatres {
    public static void tareatres (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de ventas: ");
        int numVentas = scanner.nextInt();

        Venta[] ventas = new Venta[numVentas];

        for (int i = 0; i < numVentas; i++) {
            System.out.println("Venta #" + (i + 1));
            System.out.print("Precio: ");
            double precio = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Descripción: ");
            String descripcion = scanner.nextLine();

            System.out.print("Hora: ");
            String hora = scanner.nextLine();

            System.out.print("Nombre del empleado: ");
            String nombreEmpleado = scanner.nextLine();

            ventas[i] = new Venta(precio, descripcion, hora, nombreEmpleado);
        }

        
        double sumaTotal = 0;
        for (Venta venta : ventas) {
            sumaTotal += venta.getPrecio();
        }

        System.out.println("Suma total de ventas: $" + sumaTotal);

       }
    }
