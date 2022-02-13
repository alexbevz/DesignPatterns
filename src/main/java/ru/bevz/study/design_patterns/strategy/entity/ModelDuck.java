package ru.bevz.study.design_patterns.strategy.entity;

import ru.bevz.study.design_patterns.strategy.behavior.FlyNoWay;
import ru.bevz.study.design_patterns.strategy.behavior.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        this.setFlyBehavior(new FlyNoWay());
        this.setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("ModelDuck");
    }
}
