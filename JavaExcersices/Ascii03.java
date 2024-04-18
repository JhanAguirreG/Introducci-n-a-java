import javax.swing.JOptionPane;

public class Ascii03 {
    public static void main(String[] args) {
        // Pedir al usuario que ingrese un número ASCII
        String texto = JOptionPane.showInputDialog("Introduce un número ASCII:");

        // Convertir el número ASCII a un entero
        int numero = Integer.parseInt(texto);

        // Convertir el número ASCII a una letra
        char letra = (char) numero;

        // Mostrar la letra en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "La letra es: " + letra);
    }
}
