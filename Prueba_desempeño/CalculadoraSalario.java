public class CalculadoraSalario {
    // Variables de instancia para almacenar la tarifa por hora y las horas trabajadas
    private double tarifaHora;
    private double horasTrabajadas;

    // Constructor para inicializar la tarifa por hora
    public CalculadoraSalario(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    // Método para establecer las horas trabajadas
    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    // Método para calcular el salario sin deducciones
    public double calcularSalarioSinDeducciones() {
        return tarifaHora * horasTrabajadas;
    }

    // Método para calcular el salario con deducciones de salud (4%)
    public double calcularDeduccionSalud() {
        return calcularSalarioSinDeducciones() * 0.04;
    }

    // Método para calcular el salario con deducciones de pensión (3%)
    public double calcularDeduccionPension() {
        return calcularSalarioSinDeducciones() * 0.03;
    }

    // Método para calcular el salario final con deducciones
    public double calcularSalarioConDeducciones() {
        double salarioSinDeducciones = calcularSalarioSinDeducciones();
        double deduccionSalud = calcularDeduccionSalud();
        double deduccionPension = calcularDeduccionPension();
        return salarioSinDeducciones - deduccionSalud - deduccionPension;
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase CalculadoraSalario con una tarifa de $10 por hora
        CalculadoraSalario calculadora = new CalculadoraSalario(10.0);

        // Establecer las horas trabajadas en 40 horas
        calculadora.setHorasTrabajadas(40);

        // Calcular y mostrar el salario final con deducciones
        double salarioFinal = calculadora.calcularSalarioConDeducciones();
        System.out.println("El salario final con deducciones es: $" + salarioFinal);
    }
}

