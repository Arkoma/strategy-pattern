package com.aaron.strategypattern.model;

import com.aaron.strategypattern.strategy.fly.FlyBehavior;
import com.aaron.strategypattern.strategy.quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public abstract String display();

    public Duck() {
    }

    public String performFly() {
        return flyBehavior.fly();
    }

    public String performQuack() { return quackBehavior.quack(); }

    public String swim() {
        return "all ducks swim, even decoys. ";
    }
}
