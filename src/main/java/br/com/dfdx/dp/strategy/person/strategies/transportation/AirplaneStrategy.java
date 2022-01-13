package br.com.dfdx.dp.strategy.person.strategies.transportation;

public class AirplaneStrategy implements TransportationStrategy {

    @Override
    public void move() {
        System.out.println("I use an Airplane to go (almost) anywhere");
    }
}
