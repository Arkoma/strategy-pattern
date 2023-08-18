package com.aaron.strategypattern.strategy.quack;

public class QuackWithSyrinx implements QuackBehavior {

    @Override
    public String quack() {
        return "I quack like a duck.";
    }
}
