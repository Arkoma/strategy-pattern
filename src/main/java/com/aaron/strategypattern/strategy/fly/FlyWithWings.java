package com.aaron.strategypattern.strategy.fly;

public class FlyWithWings implements FlyBehavior {
    @Override
    public String fly() {
        return "I'm flying.";
    }
}
