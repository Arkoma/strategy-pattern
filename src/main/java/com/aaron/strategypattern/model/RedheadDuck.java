package com.aaron.strategypattern.model;

import com.aaron.strategypattern.strategy.fly.FlyWithWings;
import com.aaron.strategypattern.strategy.quack.QuackWithSyrinx;

public class RedheadDuck extends Duck {

    public RedheadDuck () {
        flyBehavior = new FlyWithWings();
        quackBehavior = new QuackWithSyrinx();
    }

    @Override
    public String display() {
        return "I ama Readhead Duck. \n" +
                "And, " + this.swim() + "\n" +
                "And, " + this.performFly() + "\n" +
                "And, " + this.performQuack();
    }
}
