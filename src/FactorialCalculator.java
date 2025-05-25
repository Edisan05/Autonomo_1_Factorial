/**
 * Clase que calcula factoriales con validación de rango
 * Autor: Edison Alexander Sánchez Rosero
 * Fecha de compilación: 2025/05/23
 * Universidad: UIDE
 * Asignatura: Programación Estructurada y Funcional
 *
 * Esta clase implementa el cálculo de factoriales con:
 * - Validación de entrada (0-10)
 * - Optimización con casos base precalculados
 * - Prevención de overflow matemático
 */
public class FactorialCalculator {

    /**
     * Calcula el factorial de un número entre 0 y 10
     * @param number Número a calcular (0-10)
     * @return Resultado del factorial
     * @throws IllegalArgumentException Si el número está fuera del rango válido
     */
    public long calculateFactorial(int number) {
        // Validación del rango de entrada
        if (number < 0 || number > 10) {
            throw new IllegalArgumentException("Error: El número debe estar entre 0 y 10");
        }

        // Switch expression con casos base optimizados
        return switch (number) {
            case 0, 1 -> 1;  // 0! y 1! = 1 por definición
            case 2 -> 2;
            case 3 -> 6;
            case 4 -> 24;
            case 5 -> 120;
            default -> {
                // Cálculo iterativo para valores > 5
                long result = 720; // 6! precalculado
                for (int i = 7; i <= number; i++) {
                    result = Math.multiplyExact(result, i); // Multiplicación segura
                }
                yield result;
            }
        };
    }
}
