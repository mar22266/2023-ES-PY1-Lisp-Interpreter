import org.junit.jupiter.api.Test;

import java.util.StringTokenizer;

import static org.junit.jupiter.api.Assertions.*;

class TransformadorTest {

    /**
     * Test de la clase Transformador
     */
    @org.junit.jupiter.api.Test
    void evaluate() {
        new Transformador("+ 5 7").evaluate();
       assertEquals(12, new Transformador("+ 5 7").evaluate());
    }

    /**
     * Test de la clase Transformador
     */
    @org.junit.jupiter.api.Test
    void evaluateExpression() {
        new Transformador("/ (* 6 7 8) (- 9 2)").evaluateExpression();
        assertEquals(48, new Transformador("/ (* 6 7 8) (- 9 2)").evaluateExpression());
    }

    /**
     * Test de la clase Transformador
     */
    @Test
    void testCalculateFactorial() {
        Tokenizer tokenizer = new Tokenizer("1, 2, 3, factorial(4), 5, factorial(6)");
        assertEquals(0, tokenizer.calculateFactorial()); //Debe retornar 0

    }

}
