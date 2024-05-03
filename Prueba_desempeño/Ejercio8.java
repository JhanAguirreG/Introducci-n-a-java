import java.util.Scanner;
/* en estas 5 lineas de codigos damos una clase pribada la cual podemos manipular 
 * siempre y cuando se encuentra en la misma clase 
 */
public class Ejercio8 {
    private String descripcion;
    private double precio;
    private boolean enStock;
    private static final double IVA = 0.21;

    public Ejercio8(String descripcion, double precio, boolean enStock) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.enStock = enStock;
    }

    public double calcularPrecioFinal() {
        double precioFinal = precio * (1 + IVA);
        return precioFinal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la descripción del producto: ");
        String descripcion = scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("¿El producto está en stock? (true/false): ");
        boolean enStock = scanner.nextBoolean();

        Ejercio8 producto = new Ejercio8(descripcion, precio, enStock);

        double precioFinal = producto.calcularPrecioFinal();

        System.out.println("Descripción: " + producto.descripcion);
        System.out.println("Precio final con IVA: " + precioFinal);
    }
}
