package com.aaron.strategypattern.model;

import com.aaron.strategypattern.strategy.fly.FlyWithNoWings;
import com.aaron.strategypattern.strategy.quack.QuackWithArtificialSyrinx;

public class RubberDuck extends Duck {

    public RubberDuck () {
        flyBehavior = new FlyWithNoWings();
        quackBehavior = new QuackWithArtificialSyrinx();
    }

    @Override
    public String display() {
        return "I am a rubber duck. \n" +
                "And, " + this.swim() + "\n" +
                "And, " + this.performFly() + "\n" +
                "And, " + this.performQuack();
    }
}
