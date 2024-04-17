import javax.swing.JOptionPane;

public class main4 {
    public static void main (String[] args) {
        // Solicitar al usuario que introduzca su nombre
        String nombreUsuario = JOptionPane.showInputDialog("Por favor, introduce tu nombre:");

        // Mostrar un mensaje de bienvenida por consola
        JOptionPane.showMessageDialog(null, "¡Hola! Bienvenido, " + nombreUsuario + "!");
    }
}
