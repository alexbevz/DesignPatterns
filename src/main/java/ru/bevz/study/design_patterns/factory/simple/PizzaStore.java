package ru.bevz.study.design_patterns.factory.simple;

public class PizzaStore {

    public void orderPizza(String namePizza) {
        Pizza pizza = SimplePizzaFactory.createPizza(namePizza);

        if (pizza == null) {
            System.out.println("Pizza with name " + namePizza + " does not exist!");
            return;
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
