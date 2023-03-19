import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QUOTETest {

    @Test
    void returnQuote() {
        QUOTE q = new QUOTE();
        assertEquals("2", q.ReturnQuote("2"));
    }
}