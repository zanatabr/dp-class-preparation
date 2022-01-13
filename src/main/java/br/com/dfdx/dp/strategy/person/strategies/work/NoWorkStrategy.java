package br.com.dfdx.dp.strategy.person.strategies.work;

public class NoWorkStrategy implements WorkStrategy {
    @Override
    public void work() {
        System.out.println("I have no job. Do you have some money?");
    }
}
