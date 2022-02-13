package ru.bevz.study.design_patterns.strategy.behavior;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("FlyNoWay");
    }
}
