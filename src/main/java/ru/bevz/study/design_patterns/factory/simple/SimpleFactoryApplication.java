package ru.bevz.study.design_patterns.factory.simple;


/**
 * <h1>Простая фабрика</h1>
 * Является идиомой программирования, потчти паттерном.
 */
public class SimpleFactoryApplication {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();

        store.orderPizza("cheese");
        store.orderPizza("peperoni");
        store.orderPizza("veggie");
        store.orderPizza("clam");
    }
}
