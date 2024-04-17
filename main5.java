import javax.swing.JOptionPane;

public class main5 {
    public static void main(String[] args) {
        // Solicitar al usuario que introduzca el radio del círculo
        String radioStr = JOptionPane.showInputDialog("Por favor, introduce el radio del círculo:");
        
        // Convertir el radio de String a double
        double radio = Double.parseDouble(radioStr);
        
        // Calcular el área del círculo
        double area = Math.PI * Math.pow(radio, 2);
        
        // Mostrar el resultado al usuario
        JOptionPane.showMessageDialog(null, "El área del círculo con radio " + radio + " es: " + area);
    }
}
