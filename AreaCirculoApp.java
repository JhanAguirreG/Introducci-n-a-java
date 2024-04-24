import javax.swing.JOptionPane;
public class AreaCirculoApp {
 
    public static void main(String[] args) {
 
        String texto=JOptionPane.showInputDialog("Introduce un radio");
        //convertir el String a double
        double radio=Double.parseDouble(texto);
 
        //Formula area circulo
        double area=Math.PI*Math.pow(radio, 2);
        //mostramos en pantalla 
        System.out.println("El area del circulo es "+area);
    }
}