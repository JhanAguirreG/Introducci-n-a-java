public class main2 {
    public static void main(String[] args) {
        int numero1 = 254;
        int numero2 = 558;
        
        // Determinar cuál es mayor
        if (numero1 > numero2) {
            System.out.println("El número " + numero1 + " es mayor que " + numero2);
        } else if (numero1 < numero2) {
            System.out.println("El número " + numero2 + " es mayor que " + numero1);
        } else {
            System.out.println("Ambos números son iguales.");
        }
    }
}