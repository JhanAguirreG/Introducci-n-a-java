import java.util.Scanner;

public class VentaProducto {
    private double precio;
    private String descripcion;
    private boolean enStock;
    private static final double IVA = 0.21;

    public VentaProducto(double precio, String descripcion, boolean enStock) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.enStock = enStock;
    }

    public double calcularPrecioFinal() {
        double precioConIVA = precio * (1 + IVA);
        return precioConIVA;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        System.out.print("Ingrese la descripción del producto: ");
        String descripcion = scanner.nextLine();

        System.out.print("¿El producto está en stock? (true/false): ");
        boolean enStock = scanner.nextBoolean();

        VentaProducto producto = new VentaProducto(precio, descripcion, enStock);

        double precioFinal = producto.calcularPrecioFinal();

        System.out.println("\nDetalles del producto:");
        System.out.println("Descripción: " + producto.descripcion);
        System.out.println("Precio final con IVA: $" + precioFinal);

        scanner.close();
    }
}
