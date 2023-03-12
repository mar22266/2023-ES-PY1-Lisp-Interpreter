import static org.junit.jupiter.api.Assertions.*;

class TransformadorTest {

    @org.junit.jupiter.api.Test
    void evaluate() {
        new Transformador("+ 5 7").evaluate();
       assertEquals(12, new Transformador("+ 5 7").evaluate());
    }

    @org.junit.jupiter.api.Test
    void evaluateExpression() {
        new Transformador("/ (* 6 7 8) (- 9 2)").evaluateExpression();
        assertEquals(48, new Transformador("/ (* 6 7 8) (- 9 2)").evaluateExpression());
    }
}