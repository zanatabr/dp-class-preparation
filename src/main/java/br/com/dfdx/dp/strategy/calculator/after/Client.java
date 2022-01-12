package br.com.dfdx.dp.strategy.calculator.after;

import br.com.dfdx.dp.strategy.calculator.after.strategies.AdditionOperation;
import br.com.dfdx.dp.strategy.calculator.after.strategies.DivisionOperation;
import br.com.dfdx.dp.strategy.calculator.after.strategies.MultiplicationOperation;
import br.com.dfdx.dp.strategy.calculator.after.strategies.SubtractionOperation;

public class Client {

    public static void main(String[] args) {
        Calculator calc = new Calculator(10, 2);
        System.out.println(calc.getResult(new AdditionOperation()));
        System.out.println(calc.getResult(new SubtractionOperation()));
        System.out.println(calc.getResult(new MultiplicationOperation()));
        System.out.println(calc.getResult(new DivisionOperation()));
    }
}
