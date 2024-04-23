import javax.swing.JOptionPane;
public class tablas {
 
    public static void main(String[] args) {
        int i = 0;
        String texto=JOptionPane.showInputDialog("Introduce el precio de un producto");
        //Pasamos el String a double
        int tablasmultiplos=Integer.parseInt(texto);
        
        while (i <= 10) {
            int resultado = i * tablasmultiplos;
            System.out.println(tablasmultiplos + " X " + i + " = " + resultado );
            i++;
        }
    }
}
