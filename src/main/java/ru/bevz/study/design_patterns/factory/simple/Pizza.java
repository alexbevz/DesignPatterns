package ru.bevz.study.design_patterns.factory.simple;

public abstract class Pizza {

    void prepare() {
        System.out.println("Preparing pizza!");
    }

    void bake() {
        System.out.println("Baking pizza!");
    }

    void cut() {
        System.out.println("Cutting pizza!");
    }

    void box() {
        System.out.println("Boxing pizza!");
    }

}
