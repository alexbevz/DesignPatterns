package ru.bevz.study.design_patterns.factory.method;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new ChicagoCheesePizza();
            case "clam" -> new ChicagoClamPizza();
            case "peperoni" -> new ChicagoPeperoniPizza();
            default -> null;
        };
    }
}
