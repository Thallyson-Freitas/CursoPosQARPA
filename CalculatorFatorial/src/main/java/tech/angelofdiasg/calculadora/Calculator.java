package tech.angelofdiasg.calculadora;

public class Calculator {

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative number");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public double adicao(double n1, double n2) {
        double result = n1 + n2;
        return result;
    }

    public double subtracao(double n1, double n2) {
        double result = n1 - n2;
        return result;
    }

    public double multiplicacao(double n1, double n2) {
        double result = n1 * n2;
        return (result == 0.0) ? 0.0 : result;
    }

    public double divisao(double n1, double n2) {
        if (n2 == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero");
        }
        double result = n1 / n2;
        return (result == 0.0) ? 0.0 : result;
    }

    public double potencia(double n1, double n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("O Expoente não pode ser negativo");
        }
        if (n1 == 0 && n2 == 0) {
            throw new IllegalArgumentException("Não é possivel 0 elevado a 0");
        }
        return Math.pow(n1, n2);
    }

}
