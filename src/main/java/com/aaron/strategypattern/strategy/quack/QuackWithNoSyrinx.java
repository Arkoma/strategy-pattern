package com.aaron.strategypattern.strategy.quack;

public class QuackWithNoSyrinx implements QuackBehavior {

    @Override
    public String quack() {
        return "I do not make a sound when I quack.";
    }
}
