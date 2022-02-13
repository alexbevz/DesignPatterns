package ru.bevz.study.design_patterns.strategy.behavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("MuteQuack");
    }
}
