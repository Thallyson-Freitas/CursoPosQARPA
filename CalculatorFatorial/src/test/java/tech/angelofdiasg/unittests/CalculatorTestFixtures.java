package tech.angelofdiasg.unittests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tech.angelofdiasg.calculadora.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTestFixtures {

    private Calculator calculator;
    private int positiveNumber;
    private int zeroNumber;
    private int negativeNumber;

    // Configuração que ocorre antes de cada teste
    @BeforeEach
    void setUp() {
        calculator = new Calculator(); // Instância da calculadora
        positiveNumber = 5; // Número positivo para testar fatorial
        zeroNumber = 0; // Número zero para testar fatorial
        negativeNumber = -1; // Número negativo para testar exceção
    }

    // Teste para o fatorial de um número positivo
    @Test
    void testFatorialPositive() {
        assertEquals(120, calculator.factorial(positiveNumber)); // 5! = 120
    }

    // Teste para o fatorial de zero
    @Test
    void testFatorialZero() {
        assertEquals(1, calculator.factorial(zeroNumber)); // 0! = 1
    }

    // Teste para fatorial de um número negativo, que deve lançar exceção
    @Test
    void testFatorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(negativeNumber); // Exceção para número negativo
        }, "Fatorial não definido para números negativos");
    }

    @Test
    void testFatorialMultipleNumbers() {
        // Reutilizando o mesmo objeto calculator e testando outros valores
        assertEquals(120, calculator.factorial(positiveNumber)); // 5! = 120
        assertEquals(6, calculator.factorial(3)); // 3! = 6
        assertEquals(24, calculator.factorial(4)); // 4! = 24
        assertEquals(1, calculator.factorial(zeroNumber)); // 0! = 1
    }

    @Test
    void testAdicaoMultipleNumbers() {
        // Reutilizando o mesmo objeto calculator e testando outros valores
        assertEquals(10, calculator.adicao(positiveNumber, positiveNumber));
        assertEquals(4, calculator.adicao(positiveNumber, negativeNumber));
        assertEquals(5, calculator.adicao(positiveNumber, zeroNumber));
        assertEquals(0, calculator.adicao(zeroNumber, zeroNumber));
        assertEquals(-2, calculator.adicao(negativeNumber, negativeNumber));
        assertEquals(4, calculator.adicao(positiveNumber, negativeNumber));
        assertEquals(-1, calculator.adicao(negativeNumber, zeroNumber));
        assertEquals(-1, calculator.adicao(zeroNumber, negativeNumber));
    }

    @Test
    void testSubtracaoMultipleNumbers() {
        // Reutilizando o mesmo objeto calculator e testando outros valores
        assertEquals(0, calculator.subtracao(positiveNumber, positiveNumber));
        assertEquals(6, calculator.subtracao(positiveNumber, negativeNumber));
        assertEquals(5, calculator.subtracao(positiveNumber, zeroNumber));
        assertEquals(0, calculator.subtracao(zeroNumber, zeroNumber));
        assertEquals(0, calculator.subtracao(negativeNumber, negativeNumber));
        assertEquals(6, calculator.subtracao(positiveNumber, negativeNumber));
        assertEquals(-1, calculator.subtracao(negativeNumber, zeroNumber));
        assertEquals(1, calculator.subtracao(zeroNumber, negativeNumber));
    }

    @Test
    void testMultiplicacaoMultipleNumbers() {
        // Reutilizando o mesmo objeto calculator e testando outros valores
        assertEquals(25, calculator.multiplicacao(positiveNumber, positiveNumber));
        assertEquals(-5, calculator.multiplicacao(positiveNumber, negativeNumber));
        assertEquals(0, calculator.multiplicacao(positiveNumber, zeroNumber));
        assertEquals(0, calculator.multiplicacao(zeroNumber, zeroNumber));
        assertEquals(1, calculator.multiplicacao(negativeNumber, negativeNumber));
        assertEquals(-5, calculator.multiplicacao(positiveNumber, negativeNumber));
        assertEquals(0, calculator.multiplicacao(negativeNumber, zeroNumber));
        assertEquals(0, calculator.multiplicacao(zeroNumber, negativeNumber));
    }

    @Test
    void testDivisaoMultipleNumbers() {
        // Reutilizando o mesmo objeto calculator e testando outros valores
        assertEquals(1, calculator.divisao(positiveNumber, positiveNumber));
        assertEquals(-5, calculator.divisao(positiveNumber, negativeNumber));
        assertEquals(1, calculator.divisao(negativeNumber, negativeNumber));
        assertEquals(0, calculator.divisao(zeroNumber, negativeNumber));
        assertEquals(0, calculator.divisao(zeroNumber, positiveNumber));
        Exception exception1 = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divisao(positiveNumber, zeroNumber);
        });
        assertEquals("Não é possível dividir por zero", exception1.getMessage());
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divisao(zeroNumber, zeroNumber);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divisao(negativeNumber, zeroNumber);
        });
    }

    @Test
    void testPotenciaMultipleNumbers() {
        // Reutilizando o mesmo objeto calculator e testando outros valores
        assertEquals(3125.0, calculator.potencia(positiveNumber, positiveNumber));
        assertEquals(1.0, calculator.potencia(positiveNumber, zeroNumber));
        assertEquals(0.0, calculator.potencia(zeroNumber, positiveNumber));
        assertEquals(-1.0, calculator.potencia(negativeNumber, positiveNumber));
        assertEquals(1.0, calculator.potencia(negativeNumber, zeroNumber));
        Exception exceptionExpoente = assertThrows(IllegalArgumentException.class, () -> {
            calculator.potencia(positiveNumber, negativeNumber);
        });
        assertEquals("O Expoente não pode ser negativo", exceptionExpoente.getMessage());
        Exception exceptionZeroElevadoZero = assertThrows(IllegalArgumentException.class, () -> {
            calculator.potencia(zeroNumber, zeroNumber);
        });
        assertEquals("Não é possivel 0 elevado a 0", exceptionZeroElevadoZero.getMessage());
    }
}