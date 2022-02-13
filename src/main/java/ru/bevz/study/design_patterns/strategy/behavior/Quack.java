package ru.bevz.study.design_patterns.strategy.behavior;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
