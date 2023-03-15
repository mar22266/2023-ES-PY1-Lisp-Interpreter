/**
 * FASE 2 PROYECTO 1
 * ALGORITMOS Y ESTRUCTURA DE DATOS
 * ANDRE MARROQUIN
 * ANDY FUENTES
 * GABRILE PAZ
 */
import java.util.StringTokenizer;

public class Tokenizer {
    private int[] tokens;
    private int index;

    public Tokenizer(String text) {
        // Crear un StringTokenizer para dividir el texto en tokens
        StringTokenizer tokenizer = new StringTokenizer(text, " ,.;:-?!()");

        // Crear un arreglo para almacenar los tokens que representan números
        tokens = new int[tokenizer.countTokens()];

        // Buscar los tokens que representan números y almacenarlos en el arreglo
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            try {
                int num = Integer.parseInt(token);
                tokens[index++] = num;
            } catch (NumberFormatException e) {
                // Si el token es "factorial(n)", calcular el factorial de n
                if (token.matches("factorial\\(\\d+\\)")) {
                    String[] parts = token.split("\\(");
                    int n = Integer.parseInt(parts[1].substring(0, parts[1].length() - 1));
                    int result = 1;
                    for (int i = 1; i <= n; i++) {
                        result *= i;
                    }
                    tokens[index++] = result;
                }
            }
        }
    }

    public void calculateFactorial() {
        for (int i = 0; i < index; i++) {
            int token = tokens[i];

            // Si el token es un número mayor o igual a cero
            if (token >= 0) {
                System.out.println("Factorial de " + token + ": " + factorial(token));
            }
        }
    }

    private int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

