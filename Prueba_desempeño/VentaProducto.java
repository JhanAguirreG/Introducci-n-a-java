import java.util.Scanner;

public class VentaProducto {
    // Constante para el valor del IVA
    private static final double IVA = 0.21;

    // Variables de instancia para el precio, descripción y disponibilidad en stock
    private double precio;
    private String descripcion;
    private boolean enStock;

    // Constructor para inicializar los atributos de la clase
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
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el precio del producto
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();

        // Consumir el salto de línea después de leer el double
        scanner.nextLine();

        // Pedir al usuario que ingrese la descripción del producto
        System.out.print("Ingrese la descripción del producto: ");
        String descripcionProducto = scanner.nextLine();

        // Pedir al usuario que ingrese si el producto está en stock
        System.out.print("¿El producto está en stock? (true/false): ");
        boolean enStockProducto = scanner.nextBoolean();

        // Crear una instancia de la clase VentaProducto con los datos proporcionados por el usuario
        VentaProducto producto = new VentaProducto(precioProducto, descripcionProducto, enStockProducto);

        // Calcular y mostrar el precio final con IVA
        double precioFinal = producto.calcularPrecioFinal();
        System.out.println("El precio final con IVA es: $" + precioFinal);

        // Cerrar el Scanner
        scanner.close();
    }
}import java.util.Scanner;

public class VentaProducto {
    // Constante para el valor del IVA
    private static final double IVA = 0.21;

    // Variables de instancia para el precio, descripción y disponibilidad en stock
    private double precio;
    private String descripcion;
    private boolean enStock;

    // Constructor para inicializar los atributos de la clase
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
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el precio del producto
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();

        // Consumir el salto de línea después de leer el double
        scanner.nextLine();

        // Pedir al usuario que ingrese la descripción del producto
        System.out.print("Ingrese la descripción del producto: ");
        String descripcionProducto = scanner.nextLine();

        // Pedir al usuario que ingrese si el producto está en stock
        System.out.print("¿El producto está en stock? (true/false): ");
        boolean enStockProducto = scanner.nextBoolean();

        // Crear una instancia de la clase VentaProducto con los datos proporcionados por el usuario
        VentaProducto producto = new VentaProducto(precioProducto, descripcionProducto, enStockProducto);

        // Calcular y mostrar el precio final con IVA
        double precioFinal = producto.calcularPrecioFinal();
        System.out.println("El precio final con IVA es: $" + precioFinal);

        // Cerrar el Scanner
        scanner.close();
    }
}


