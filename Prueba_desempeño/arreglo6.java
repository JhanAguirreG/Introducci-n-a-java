import java.util.Scanner;
class Empleado{
    String nombre;
    double IVA = 0.21;
    double hora = 5.531;
    int salud =4;
    int pension = 3 ;
    int semana  = 48;

    public Empleado(String nom, Double iva, double hor, int sal, int pen, int sem){
        this.nombre=nom;
        this.IVA=iva;
        this.hora=hor;
        this.salud=sal;
        this.pension=pen;
        this.semana=sem;
    }
}
public class Ejercicio6 {

    

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
/*de la linea 9 a la linea 13 asiganamos las clases  */

       

        System.out.println("Hola, por favor digita el nombre del empleado.");
        String nombre = sc.nextLine();

        System.out.println("Ahora digita cuantas horas a laborado "+nombre);
        int horas = sc.nextInt();
/*de la linea 20 a la linea 27 resolvemos los puntos aritmeticos para dara saoluvional al problema planteado */
        if ( horas > 0 ){
            System.out.println("las horas laboradas de "+nombre+" equivalen "+(horas*hor));
            System.out.println("Con los ingresos de salud elm porcentaje equivale a: "+((horas/sal)*hor));
             
        }
         else if (sem > horas){
            System.out.println("abono de la pencion: "+(pen * horas) );
        }
     }
} 
