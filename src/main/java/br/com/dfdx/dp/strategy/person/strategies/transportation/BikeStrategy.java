package br.com.dfdx.dp.strategy.person.strategies.transportation;

public class BikeStrategy implements TransportationStrategy {

    @Override
    public void move() {
        System.out.println("I use a Bike to go anywhere");
    }
}
