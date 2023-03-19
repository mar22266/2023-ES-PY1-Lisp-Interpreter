import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTest {


    @Test
    void calc() {
        Operaciones op = new Operaciones();
        assertEquals("5.0", op.Calc("(+ 2 3)"));
    }
}