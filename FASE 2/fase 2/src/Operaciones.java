import java.util.ArrayList;
import java.util.List;
/**
 * FASE 2 PROYECTO 1
 * ALGORITMOS Y ESTRUCTURA DE DATOS
 * ANDRE MARROQUIN
 * ANDY FUENTES
 * GABRILE PAZ
 */

/**
 * Clase que transforma una expresion en notacion prefija a notacion infija.
 */
public class Operaciones {

    private int index;
    /**
     Constructor que recibe una expresión en notacion prefija.
     @param
     */
    public Operaciones() {
        this.index = 0;
    }
    /**
     * Metodo que transforma una expresion en notacion prefija a notacion infija.
     * @param input expresion en notacion prefija
     * @return expresion en notacion infija
     */
    double evaluate(String input) {
        List<Double> operands = new ArrayList<>();
        char operator = ' ';
        while (index < input.length()) {
            char current = input.charAt(index);
            if (Character.isWhitespace(current)) {
                index++;
                continue;
            }
            if (current == '(') {
                index++;
                operands.add(evaluate(input));
            } else if (current == ')') {
                index++;
                break;
            } else if (Character.isDigit(current)) {
                int start = index;
                while (index < input.length() && (Character.isDigit(input.charAt(index)) || input.charAt(index) == '.')) {
                    index++;
                }
                operands.add(Double.parseDouble(input.substring(start, index)));
            } else {
                operator = current;
                index++;
            }

            if (operands.size() == 2) {
                double a = operands.remove(0);
                double b = operands.remove(0);
                if (operator == '+') {
                    operands.add(a + b);
                } else if (operator == '-') {
                    operands.add(a - b);
                } else if (operator == '*') {
                    operands.add(a * b);
                } else if (operator == '/') {
                    operands.add(a / b);
                } else if (operator == '^') {
                    operands.add(Math.pow(a, b));
                }
            }
        }
        if (operands.size() == 1) {
            return operands.get(0);
        }
        return 0;
    }

    /**
     * Metodo que evalua una expresion en notacion prefija.
     * @param input expresion en notacion prefija
     * @return resultado de la expresion
     */
    public double evaluateExpression(String input) {
        index = 0;
        return evaluate(input);
    }
}
