package ru.bevz.study.design_patterns.factory.method;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NYCheesePizza();
            case "clam" -> new NYClamPizza();
            case "peperoni" -> new NYPeperoniPizza();
            default -> null;
        };
    }
}
