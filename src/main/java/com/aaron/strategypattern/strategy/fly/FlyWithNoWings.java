package com.aaron.strategypattern.strategy.fly;

public class FlyWithNoWings implements FlyBehavior {
    @Override
    public String fly() {
        return "I cannot fly.";
    }
}
