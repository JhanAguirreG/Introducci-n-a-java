import java.util.Scanner;

public class ejercicioocho {
    // Constante para el IVA
    private static final double IVA = 0.21;

    // Variables de instancia
    private double precio;
    private String descripcion;
    private boolean enStock;

    // Constructor
    public VentaProducto(double precio, String descripcion, boolean enStock) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.enStock = enStock;
    }

    // Método para calcular el precio final con IVA
    public double calcularPrecioFinal() {
        return precio * (1 + IVA);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto:");
        double precio = scanner.nextDouble();

        scanner.nextLine(); // Limpiar el buffer

        System.out.println("Ingrese la descripción del producto:");
        String descripcion = scanner.nextLine();

        System.out.println("¿Está el producto en stock? (true/false):");
        boolean enStock = scanner.nextBoolean();

        VentaProducto producto = new VentaProducto(precio, descripcion, enStock);

        System.out.println("El precio final con IVA es: " + producto.calcularPrecioFinal());

        scanner.close();
    }
}
