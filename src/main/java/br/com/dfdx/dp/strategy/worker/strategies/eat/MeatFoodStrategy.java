package br.com.dfdx.dp.strategy.worker.strategies.eat;

public class MeatFoodStrategy implements EatStrategy {
    @Override
    public void eat() {
        System.out.println("I eat meat!");
    }
}
