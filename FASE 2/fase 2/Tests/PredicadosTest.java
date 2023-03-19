import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredicadosTest {

    @Test
    void procesador() {
        Predicados procesador = new Predicados();
        String request = "atom a b";
        String expected = "FALSO";
        String result = procesador.Procesador(request);
        assertEquals(expected, result);
    }

    @Test
    void testEqual() {
        Predicados procesador = new Predicados();
        String request = "= 3 3";
        String expected = "VERDADERO";
        String result = procesador.Procesador(request);
        assertEquals(expected, result);
    }

    @Test
    void testGreaterThan() {
        Predicados procesador = new Predicados();
        String request = "> 3 2";
        String expected = "VERDADERO";
        String result = procesador.Procesador(request);
        assertEquals(expected, result);
    }

    @Test
    void testLessThan() {
        Predicados procesador = new Predicados();
        String request = "< 3 2";
        String expected = "FALSO";
        String result = procesador.Procesador(request);
        assertEquals(expected, result);
    }


}