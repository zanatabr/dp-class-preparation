package br.com.dfdx.dp.strategy.person;


import br.com.dfdx.dp.strategy.person.strategies.eat.MeatFoodStrategy;
import br.com.dfdx.dp.strategy.person.strategies.eat.VeggieFoodStrategy;
import br.com.dfdx.dp.strategy.person.strategies.transportation.AirplaneStrategy;
import br.com.dfdx.dp.strategy.person.strategies.transportation.BikeStrategy;
import br.com.dfdx.dp.strategy.person.strategies.transportation.CarStrategy;
import br.com.dfdx.dp.strategy.person.strategies.transportation.WalkStrategy;
import br.com.dfdx.dp.strategy.person.strategies.work.DeveloperStrategy;
import br.com.dfdx.dp.strategy.person.strategies.work.NoWorkStrategy;
import br.com.dfdx.dp.strategy.person.strategies.work.PilotStrategy;

public class Client {

    public static void presentYourself(Person person) {
        System.out.println("Hi, I'm " + person.getName());
        person.eat();
        person.move();
        person.work();
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Person john = new Person("John", new MeatFoodStrategy(), new CarStrategy(), new DeveloperStrategy());
        presentYourself(john);

        Person ann = new Person("Ann", new MeatFoodStrategy(), new AirplaneStrategy(), new PilotStrategy());
        presentYourself(ann);

        Person carol = new Person("Carol", new VeggieFoodStrategy(), new BikeStrategy(), new DeveloperStrategy());
        presentYourself(carol);

        Person alan = new Person("Alan", new VeggieFoodStrategy(), new WalkStrategy(), new NoWorkStrategy());
        presentYourself(alan);
    }


}
