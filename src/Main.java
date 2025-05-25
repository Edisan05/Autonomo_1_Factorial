/**
 * Programa principal que muestra factoriales en formato de tabla
 * Autor: Edison Alexander Sánchez Rosero
 * Fecha de compilación: 2025/05/23
 *
 * Características principales:
 * - Presentación en formato de tabla con bordes
 * - Manejo de excepciones para entrada inválida
 * - Uso de programación funcional con Streams
 */
public class Main {

    public static void main(String[] args) {
        // Creación del calculador de factoriales
        final FactorialCalculator calculator = new FactorialCalculator();

        // Encabezado de la tabla
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║   FACTORIALES (0 a 10)       ║");
        System.out.println("╠══════════╦═══════════════════╣");
        System.out.println("║   n      ║       n!          ║");
        System.out.println("╠══════════╬═══════════════════╣");

        // Cálculo y visualización de factoriales
        java.util.stream.IntStream.rangeClosed(0, 10)
                .forEach(num -> {
                    try {
                        long factorial = calculator.calculateFactorial(num);
                        System.out.printf("║ %6d   ║ %17d ║%n", num, factorial);
                    } catch (IllegalArgumentException e) {
                        System.out.printf("║ %6d   ║ %17s ║%n", num, "NO VÁLIDO");
                    }
                });

        // Cierre de la tabla
        System.out.println("╚══════════╩═══════════════════╝");

        // Información del desarrollador
        System.out.println("\nDesarrollado por: Edison Alexander Sánchez Rosero");
        System.out.println("Fecha de compilación: 2025/05/23");
        System.out.println("Nota técnica: El cálculo usa:");
        System.out.println("- Switch expressions (Java 14+)");
        System.out.println("- Math.multiplyExact para prevención de overflow");
    }
}
