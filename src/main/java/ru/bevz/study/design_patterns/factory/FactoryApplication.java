package ru.bevz.study.design_patterns.factory;

/**
 * <h1>Фабрика</h1>
 * <p>
 * Паттерн Абстрактная Фабрика предоставляет интерфейс создания семейств
 * взаимосвязанных или взаимозависимых объектов без указания их конкретных классов.
 */
public class FactoryApplication {
    public static void main(String[] args) {
        PizzaStore pizzaStore;

        pizzaStore = new NYPizzaStore();

        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("russian");
        pizzaStore.orderPizza("pepperoni");


        pizzaStore = new ChicagoPizzaStore();

        pizzaStore.orderPizza("pepperoni");
        pizzaStore.orderPizza("clam");
    }
}
