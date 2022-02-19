package ru.bevz.study.design_patterns.factory.method;

public abstract class PizzaStore {

    public final void orderPizza(String type) {
        Pizza pizza = createPizza(type);

        if (pizza == null) {
            System.out.println("Pizza with name " + type + " does not exist!");
            return;
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    public abstract Pizza createPizza(String type);

}
