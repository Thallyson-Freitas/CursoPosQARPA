package tech.angelofdiasg.unittests;

import org.junit.jupiter.api.Test;
import tech.angelofdiasg.calculadora.Calculator;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testFactorialPositiveNumber() {
        Calculator calculator = new Calculator();
        assertEquals(120, calculator.factorial(5));
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    void testFactorialNegativeNumber() {
        Calculator calculator = new Calculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(-1);
        });
        assertEquals("Negative number", exception.getMessage());
    }

    @Test
    void testFactorialZero() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    void testFactorialOne() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.factorial(1));
    }

    @Test
    void testFactorialValido() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.factorial(3));
    }

    @Test
    void testFactorialOverflow() {
        Calculator calculator = new Calculator();
        assertEquals(479001600, calculator.factorial(12));
    }

    @Test
    void testFactorialOverflow2() {
        Calculator calculator = new Calculator();
        assertEquals(121645100408832000L, calculator.factorial(19));
    }

    @Test
    void testFactorialFour() {
        Calculator calculator = new Calculator();
        assertEquals(24, calculator.factorial(4));
    }

    @Test
    void testFactorialSeven() {
        Calculator calculator = new Calculator();
        assertEquals(5040, calculator.factorial(7));
    }

    @Test
    void testAdcaoPositivo() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.adicao(1,1));
    }

    @Test
    void testAdcaoZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.adicao(0,0));
    }

    @Test
    void testAdcaoNegativo() {
        Calculator calculator = new Calculator();
        assertEquals(-1, calculator.adicao(-2,1));
    }

    @Test
    void testAdcaoNegativoNegativo() {
        Calculator calculator = new Calculator();
        assertEquals(-200, calculator.adicao(-100,-100));
    }

    @Test
    void testSubtracaoPositivo() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtracao(2,1));
    }

    @Test
    void testSubtracaoZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.subtracao(0,0));
    }

    @Test
    void testSubtracaoNegativo() {
        Calculator calculator = new Calculator();
        assertEquals(-1, calculator.subtracao(1,2));
    }

    @Test
    void testSubtracaoResultZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.subtracao(2,2));
    }

    @Test
    void testSubtracaoRNegativoNegativo() {
        Calculator calculator = new Calculator();
        assertEquals(-50, calculator.subtracao(-100,-50));
    }

    @Test
    void testMultiplicacao() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.multiplicacao(2, 2));
    }

    @Test
    void testMultiplicacaoNegativa() {
        Calculator calculator = new Calculator();
        assertEquals(-4, calculator.multiplicacao(2, -2));
    }

    @Test
    void testMultiplicacaoNegativoNegativo() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.multiplicacao(-2, -2));
    }

    @Test
    void testMultiplicacaoZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.multiplicacao(2, 0));
    }

    @Test
    void testMultiplicacaoInteiro() {
        Calculator calculator = new Calculator();
        assertEquals(700, calculator.multiplicacao(20,35));
    }

    @Test
    void testDivisao() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.divisao(10,2));
    }

    @Test
    void testDivisaoPorZero() {
        Calculator calculator = new Calculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divisao(10, 0);
        });
        assertEquals("Não é possível dividir por zero", exception.getMessage());
    }

    @Test
    void testDivisaoNegativo() {
        Calculator calculator = new Calculator();
        assertEquals(-5, calculator.divisao(10,-2));
    }

    @Test
    void testDivisaoDouble() {
        Calculator calculator = new Calculator();
        assertEquals(3.3333333333333335, calculator.divisao(10,3));
    }

    @Test
    void testPotencia() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.potencia(2,3));
    }

    @Test
    void testPotenciaNegativo() {
        Calculator calculator = new Calculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.potencia(2, -2);
        });
        assertEquals("O Expoente não pode ser negativo", exception.getMessage());
    }

    @Test
    void testPotenciaZeroZero() {
        Calculator calculator = new Calculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.potencia(0, 0);
        });
        assertEquals("Não é possivel 0 elevado a 0", exception.getMessage());
    }

    @Test
    void testPotenciaAZero() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.potencia(2,0));
    }

}
