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
       /**
        * Crear un StringTokenizer para dividir el texto en tokens.
        * Los delimitadores son los siguientes caracteres: espacio, coma, punto y coma,
        * dos puntos, guión, signo de interrogación, signo de exclamación y paréntesis.
        *
       */
        StringTokenizer tokenizer = new StringTokenizer(text, " ,.;:-?!()");

        /**
         * Crear un arreglo para almacenar los tokens que representan números.
         * El tamaño del arreglo es el número de tokens que se encuentran en el texto.
         */
        tokens = new int[tokenizer.countTokens()];

        /**
         * Recorrer los tokens y almacenar en el arreglo los que representan números.
         * Si el token es "factorial(n)", calcular el factorial de n y almacenar el resultado.
         */
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            try {
                int num = Integer.parseInt(token);
                tokens[index++] = num;
            } catch (NumberFormatException e) {
                /**
                 * Si el token no es un número, verificar si es "factorial(n)".
                 * Si es así, calcular el factorial de n y almacenar el resultado.
                 */
                if (token.matches("factorial\\(\\d+\\)")) {
                    String[] parts = token.split("\\(");
                    int n = Integer.parseInt(parts[1].substring(0, parts[1].length() - 1));
                    int result = 1;
                    for (int i = 1; i <= n; i++) {
                        result *= i;
                    }
                    tokens[index++] = result;
                }else if (token.matches("fahrenheit-to-celsius\\(\\d+\\)")) {
                    String[] parts = token.split("\\(");
                    int f = Integer.parseInt(parts[1].substring(0, parts[1].length() - 1));
                    int c = (int) fahrenheitToCelsius(f);
                    tokens[index++] = c;
                }
            }
        }
    }

    /**
     * Recorrer el arreglo de tokens y calcular el factorial de cada uno de ellos.
     *
     * @return
     */
    public int calculateFactorial() {
        for (int i = 0; i < index; i++) {
            int token = tokens[i];

            /**
             * Si el token es un número, calcular su factorial y mostrarlo en pantalla.
             */
            if (token >= 0) {
                System.out.println("Factorial de " + token + ": " + factorial(token));
            }
        }
        return 0;
    }

    /**
     *
     * @param n el número del cual se desea calcular el factorial.
     * @return el factorial de n.
     */
    private int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public void calculateFibonacci() {
        for (int i = 0; i < index; i++) {
            int token = tokens[i];
            if (token >= 0) {
                int resultado = fibonacci(token);
                System.out.println("El " + token + "-ésimo número de fibonacci es: " + resultado);
            }
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }


    public void calculateCelsius() {
        for (int i = 0; i < index; i++) {
            int token = tokens[i];
            if (token >= 0) {
                int celsius = fahrenheitToCelsius(token);
                System.out.println(token + " grados Fahrenheit equivalen a " + celsius + " grados Celsius.");
            }
        }
    }
    
    private int fahrenheitToCelsius(int f) {
        return (int) ((f - 32) * 5.0 / 9.0);
    }
    

    
}

