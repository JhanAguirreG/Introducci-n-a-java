import javax.swing.JOptionPane;
public class Tablasmultiplicar {
 
    public static void main(String[] args) {
        int i = 0;
        String texto=JOptionPane.showInputDialog("Introduce un número");
        
        int tablasmultiplos=Integer.parseInt(texto);
        
        while (i <= 10) {
            int resultado = i * tablasmultiplos;
            System.out.println(tablasmultiplos + " X " + i + " = " + resultado );
            i++;
        }
    }
}
