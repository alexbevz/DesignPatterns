package ru.bevz.study.design_patterns.strategy.behavior;

public class FlyRocket implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("FlyRocket");
    }
}
