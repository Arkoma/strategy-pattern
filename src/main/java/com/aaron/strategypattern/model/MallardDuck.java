package com.aaron.strategypattern.model;

import com.aaron.strategypattern.strategy.fly.FlyWithWings;
import com.aaron.strategypattern.strategy.quack.QuackWithSyrinx;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new QuackWithSyrinx();
    }

    @Override
    public String display() {
        return "I am a Mallard Duck. \n" +
                "And, " + this.swim() + "\n" +
                "And, " + this.performFly() + "\n" +
                "And, " + this.performQuack();
    }
}
