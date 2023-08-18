package com.aaron.strategypattern.model;

import com.aaron.strategypattern.strategy.fly.FlyWithNoWings;
import com.aaron.strategypattern.strategy.quack.QuackWithNoSyrinx;

public class DecoyDuck extends Duck {

    public DecoyDuck () {
        flyBehavior = new FlyWithNoWings();
        quackBehavior = new QuackWithNoSyrinx();
    }

    @Override
    public String display() {
        return "I am a decoy duck. \n" +
                "And, " + this.swim() + "\n" +
                "And, " + this.performFly() + "\n" +
                "And, " + this.performQuack();
    }
}
