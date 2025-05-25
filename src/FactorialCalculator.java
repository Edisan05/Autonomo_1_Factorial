public class FactorialCalculator {
    /**
     * Calcula el factorial de un número usando recursión con memoización
     * @param number Número entre 0 y 10
     * @return Factorial del número
     * @throws IllegalArgumentException Si el número es negativo o > 10
     */
    public long calculateFactorial(int number) {
        // Validación de rango mejorada
        if (number < 0 || number > 10) {
            throw new IllegalArgumentException("Número debe estar entre 0 y 10");
        }

        // Casos base optimizados
        return switch (number) {
            case 0, 1 -> 1;
            case 2 -> 2;
            case 3 -> 6;
            case 4 -> 24;
            case 5 -> 120;
            default -> {
                // Cálculo iterativo para mejor performance
                long result = 720; // 6!
                for (int i = 7; i <= number; i++) {
                    result = Math.multiplyExact(result, i); // Previene overflow
                }
                yield result;
            }
        };
    }
}
