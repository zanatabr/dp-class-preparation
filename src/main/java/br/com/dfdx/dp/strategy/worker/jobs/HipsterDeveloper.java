package br.com.dfdx.dp.strategy.worker.jobs;

import br.com.dfdx.dp.strategy.worker.strategies.eat.VeggieFoodStrategy;
import br.com.dfdx.dp.strategy.worker.strategies.transportation.BikeStrategy;
import br.com.dfdx.dp.strategy.worker.strategies.work.DeveloperStrategy;

public class HipsterDeveloper implements Worker {

    @Override
    public void eat() {
        new VeggieFoodStrategy().eat();
    }

    @Override
    public void move() {
        new BikeStrategy().move();
    }

    @Override
    public void work() {
        new DeveloperStrategy().work();
    }
}
