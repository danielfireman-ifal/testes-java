package br.edu.ifal.gqso;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    private Calculadora calc;

    @BeforeEach
    public void setUp() throws Exception {
        calc = new Calculadora();
    }

    @Test
    @DisplayName("Simple multiplication should work")
    public void testMultiply() {
        assertEquals(20, calc.multiplica(4, 5), "Regular multiplication should work");
    }

    @Test
    @DisplayName("Ensure correct handling of zero")
    public void testMultiplyWithZero() {
        assertEquals(0, calc.multiplica(0, 5), "Multiple with zero should be zero");
        assertEquals(0, calc.multiplica(5, 0), "Multiple with zero should be zero");
    }
}
