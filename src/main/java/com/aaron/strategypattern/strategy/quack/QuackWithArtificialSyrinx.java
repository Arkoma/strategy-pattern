package com.aaron.strategypattern.strategy.quack;

public class QuackWithArtificialSyrinx implements QuackBehavior {

    @Override
    public String quack() {
        return "I squeak when I quack.";
    }
}
