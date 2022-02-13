package ru.bevz.study.design_patterns.strategy.entity;

import ru.bevz.study.design_patterns.strategy.behavior.FlyWithWings;
import ru.bevz.study.design_patterns.strategy.behavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.setFlyBehavior(new FlyWithWings());
        this.setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("MallardDuck");
    }
}
