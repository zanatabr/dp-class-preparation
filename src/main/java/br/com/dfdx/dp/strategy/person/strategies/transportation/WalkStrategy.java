package br.com.dfdx.dp.strategy.person.strategies.transportation;

public class WalkStrategy implements TransportationStrategy {

    @Override
    public void move() {
        System.out.println("I walk to go anywhere");
    }
}
