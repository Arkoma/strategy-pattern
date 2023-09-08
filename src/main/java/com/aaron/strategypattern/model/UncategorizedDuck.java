package com.aaron.strategypattern.model;

import com.aaron.strategypattern.strategy.fly.FlyWithNoWings;
import com.aaron.strategypattern.strategy.quack.QuackWithNoSyrinx;

public class UncategorizedDuck extends Duck {

    public UncategorizedDuck() {
        flyBehavior = new FlyWithNoWings();
        quackBehavior = new QuackWithNoSyrinx();
    }
    @Override
    public String display() {
        return "I am not a duck.";
    }
}
