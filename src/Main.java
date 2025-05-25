public class Main {
    public static void main(String[] args) {
        final var calculator = new FactorialCalculator();

        System.out.println("╔══════════════════════════════╗");
        System.out.println("║   FACTORIALES (0 a 10)       ║");
        System.out.println("╠══════════╦═══════════════════╣");
        System.out.println("║   n      ║       n!          ║");
        System.out.println("╠══════════╬═══════════════════╣");

        // Usando IntStream con formato de tabla
        java.util.stream.IntStream.rangeClosed(0, 10)
                .forEach(num -> {
                    try {
                        long factorial = calculator.calculateFactorial(num);
                        System.out.printf("║ %6d   ║ %17d ║%n", num, factorial);
                    } catch (IllegalArgumentException e) {
                        System.out.printf("║ %6d   ║ %17s ║%n", num, "NO VÁLIDO");
                    }
                });

        System.out.println("╚══════════╩═══════════════════╝");

        // Información adicional
        System.out.println("\nNota: Este programa calcula hasta 10! = 3,628,800");
    }
}