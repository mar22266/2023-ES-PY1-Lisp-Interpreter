import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SETQTest {

    @Test
    void agregar() {
        SETQ s = new SETQ();
        s.agregar("a", "2");
        assertEquals(true, s.foundValue("a"));
    }

    @Test
    void foundValue() {
        SETQ s = new SETQ();
        s.agregar("a", "2");
        assertEquals(true, s.foundValue("a"));
    }

    @Test
    void buscar() {
        SETQ s = new SETQ();
        s.agregar("a", "2");
        V_Stack<String> stack = new V_Stack<String>();
        stack.push("a");
        assertEquals("2", s.buscar(stack).get(0));
    }
}