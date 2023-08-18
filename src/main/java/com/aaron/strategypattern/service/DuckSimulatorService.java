package com.aaron.strategypattern.service;

import com.aaron.strategypattern.model.DecoyDuck;
import com.aaron.strategypattern.model.Duck;
import com.aaron.strategypattern.model.MallardDuck;
import com.aaron.strategypattern.model.RedheadDuck;
import com.aaron.strategypattern.model.RubberDuck;
import org.springframework.stereotype.Service;

@Service
public class DuckSimulatorService {

    public String simulate(String type) {
        Duck duck;
        switch (type) {
            case "mallard" :
                duck = new MallardDuck();
                break;
            case "readhead" :
                duck = new RedheadDuck();
                break;
            case "decoy" :
                duck = new DecoyDuck();
                break;
            case "rubber" :
                duck = new RubberDuck();
                break;
            default:
                return "There are no ducks like that";
        }
        return duck.display();
    }
}
