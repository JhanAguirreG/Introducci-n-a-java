import java.util.Scanner;

class Empleado{
//ATRIBUTOS
    String nombre;
    String rol;
    Double horaTrabajado;
    int valorHoras;

    //CONSTRUCTORES
    public Empleado (String nombre, String rol, Double horaTrabajado, int valorHoras){
            this.nombre= nombre;
            this.rol= rol;
            this.horaTrabajado= horaTrabajado;
            this.valorHoras= valorHoras;
    }

    public double calcularSalario(){
        return this.horaTrabajado * this.valorHoras;
        }    
    public double calcularSalud(){
            return this.horaTrabajado * 0.04;
            }
    
    public double calcularPension(){
                return this.valorHoras * 0.03;
                }
    }
    
    public class EmpleadosM {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            System.out.println("Ingrese su nombre: ");
            String nombre_empleado=sc.nextLine();
            System.out.println("Ingrese su rol asignado: ");
            String rol_empleado=sc.nextLine();
            System.out.println("Ingrese sus horas laboradas: ");
            Double horaTrabajado_empleado=sc.nextDouble();
            System.out.println("Ingrese el valor de las horas: ");
            int valorHoras_empleado=sc.nextInt();

            Empleado EmpleadosDia1= new Empleado(nombre_empleado, rol_empleado, horaTrabajado_empleado,valorHoras_empleado);

            System.out.println(EmpleadosDia1.nombre);
            System.out.println(EmpleadosDia1.rol);
            System.out.println(EmpleadosDia1.horaTrabajado);
            System.out.println(valorHoras_empleado);
            System.out.println("Su sueldo es de: "+ (EmpleadosDia1.calcularSalario()));
            System.out.println("Su pension queda de: "+(EmpleadosDia1.calcularPension()));
            System.out.println("Su salud queda de: "+(EmpleadosDia1.calcularSalud()));
        }
    }
