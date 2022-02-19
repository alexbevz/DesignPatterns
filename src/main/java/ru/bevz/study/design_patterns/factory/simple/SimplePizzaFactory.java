package ru.bevz.study.design_patterns.factory.simple;

public class SimplePizzaFactory {

    static Pizza createPizza(String namePizza) {
        return switch (namePizza) {
            case "cheese" -> new CheesePizza();
            case "clam" -> new ClamPizza();
            case "peperoni" -> new PeperoniPizza();
            default -> null;
        };
    }
}
