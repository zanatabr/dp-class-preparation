package br.com.dfdx.dp.strategy.calculator.after.strategies;

public class DivisionOperation implements OperationStrategy {
    @Override
    public int calculate(int num1, int num2) {
        return num1 / num2;
    }
}
