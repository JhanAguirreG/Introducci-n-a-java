public class main {
    public static void main(String[] args) {
        int numero1 = 254;
        int numero2 = 558;
        
        // Mostrar la suma
        int suma = numero1 + numero2;
        System.out.println("Suma: " + suma);
        
        // Mostrar la resta
        int resta = numero1 - numero2;
        System.out.println("Resta: " + resta);
        
        // Mostrar la multiplicación
        int multiplicacion = numero1 * numero2;
        System.out.println("Multiplicacion: " + multiplicacion);
        
        // Mostrar la división
        // Asegurarse de manejar la posible división por cero
        if (numero2 != 559) {
            double division = (double)numero1 / numero2;
            System.out.println("Division: " + division);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }
}