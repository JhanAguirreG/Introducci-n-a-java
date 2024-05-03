import java.util.Scanner;

public class Ejercicio7 {
    private int[] numeros;

    public Ejercicio7(int[] numeros) {
        this.numeros = numeros;
    }
 /* de la linea 10 a la linea 23 damos el inicio a la parimera parte del
 problema planteado sacamos las clases de la suma y la cantidad
 equivalen 0 ya que son valores que necesitamos modificar con los parametros 
 que se nos brindan por consola, para si saber dsi el numero es positivo*/ 
    public double calcularPromedioPositivos() {
        int suma = 0;
        int cantidad = 0;
        for (int num : numeros) {
            if (num > 0) {
                suma += num;
                cantidad++;
            }
        }
        if (cantidad == 0) {
            return 0;
        }
        return (double) suma / cantidad;
    }
 /* de la linea 27 a la linea 54 damos el inicio a la parimera parte del
 problema planteado sacamos las clases de la suma y la cantidad
 equivalen 0 ya que son valores que necesitamos modificar con los parametros 
 que se nos brindan por consola, para  saber si el numero es engativo*/ 

    public double calcularPromedioNegativos() {
        int suma = 0;
        int cantidad = 0;
        for (int num : numeros) {
            if (num < 0) {
                suma += num;
                cantidad++;
            }
        }
        if (cantidad == 0) {
            return 0;
        }
        return (double) suma / cantidad;
    }

    public int contarCeros() {
        int cantidad = 0;
        for (int num : numeros) {
            if (num == 0) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();
        int[] numeros = new int[n];
        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        Ejercicio7 calculadora = new Ejercicio7(numeros);
        double promedioPositivos = calculadora.calcularPromedioPositivos();
        double promedioNegativos = calculadora.calcularPromedioNegativos();
        int cantidadCeros = calculadora.contarCeros();

        System.out.println("Promedio de números positivos: " + promedioPositivos);
        System.out.println("Promedio de números negativos: " + promedioNegativos);
        System.out.println("Cantidad de ceros: " + cantidadCeros);
    }
}
