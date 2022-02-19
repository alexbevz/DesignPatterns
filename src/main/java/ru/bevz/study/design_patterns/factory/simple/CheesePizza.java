package ru.bevz.study.design_patterns.factory.simple;

public class CheesePizza extends Pizza {

    @Override
    void prepare() {
        System.out.println("Cheese pizza!");
        super.prepare();
    }
}
