package br.com.dfdx.dp.strategy.worker;

import br.com.dfdx.dp.strategy.worker.jobs.Developer;
import br.com.dfdx.dp.strategy.worker.jobs.HipsterDeveloper;
import br.com.dfdx.dp.strategy.worker.jobs.Pilot;
import br.com.dfdx.dp.strategy.worker.jobs.Worker;

public class Client {

    public static void presentYourself(Worker worker, String name) {
        System.out.println("Hi, I'm " + name);
        worker.eat();
        worker.move();
        worker.work();
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Worker john = new Developer();
        presentYourself(john, "John");

        Worker ann = new Pilot();
        presentYourself(ann, "Ann");

        Worker carol = new HipsterDeveloper();
        presentYourself(carol, "Carol");
    }
}
