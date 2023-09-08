package com.aaron.strategypattern.service;

import com.aaron.strategypattern.model.DecoyDuck;
import com.aaron.strategypattern.model.Duck;
import com.aaron.strategypattern.model.MallardDuck;
import com.aaron.strategypattern.model.RedheadDuck;
import com.aaron.strategypattern.model.RubberDuck;
import com.aaron.strategypattern.model.UncategorizedDuck;
import org.springframework.stereotype.Service;

@Service
public class DuckSimulatorService {

    public String simulate(String type, String action) {
        Duck duck;
        switch (type) {
            case "mallard" :
                duck = new MallardDuck();
                break;
            case "redhead" :
                duck = new RedheadDuck();
                break;
            case "decoy" :
                duck = new DecoyDuck();
                break;
            case "rubber" :
                duck = new RubberDuck();
                break;
            default:
                duck = new UncategorizedDuck();
        }

        String simulation = duck.display() + " \n";

        switch (action) {
            case "swim" :
                simulation += duck.swim();
                break;
            case "quack" :
                simulation += duck.performQuack();
                break;
            case "fly" :
                simulation += duck.performFly();
                break;
            default:
                simulation += "I don't know how to do that";
        }
        return simulation;
    }
}
