import javax.swing.JOptionPane;

public class OrdenInvertido {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Introduce una palabra o número:");

        String PalabraInvertida = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            PalabraInvertida += texto.charAt(i);
        }

        System.out.println("Palabra original: " + texto);
        System.out.println("Palabra invertida: " + PalabraInvertida);
    }
}

