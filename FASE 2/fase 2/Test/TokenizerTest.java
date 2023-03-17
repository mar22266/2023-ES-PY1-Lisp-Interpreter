import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TokenizerTest {


    @Test
    void testCalculateFactorial() {
        Tokenizer tokenizer = new Tokenizer("1, 2, 3, factorial(4), 5, factorial(6)");
        assertEquals(0, tokenizer.calculateFactorial()); //Debe retornar 0

    }


    @Test
    void fibonacci() {
        Tokenizer tokenizer = new Tokenizer("fibonacci(4)");
        assertEquals(3, tokenizer.fibonacci(4)); //Debe retornar 3

    }

    @Test
    void fahrenheitToCelsius() {
        int temperaturaFahrenheit = 68; // Temperatura en Fahrenheit
        int temperaturaCelsiusEsperada = 20; // Temperatura esperada en Celsius
        Tokenizer MiClase = new Tokenizer("fahrenheitToCelsius(68)");
        int temperaturaCelsiusObtenida = MiClase.fahrenheitToCelsius(temperaturaFahrenheit);
        assertEquals(temperaturaCelsiusEsperada, temperaturaCelsiusObtenida);
    }
}