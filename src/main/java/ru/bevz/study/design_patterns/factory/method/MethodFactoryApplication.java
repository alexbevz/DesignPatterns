package ru.bevz.study.design_patterns.factory.method;

/**
 * <h1>Фабричный метод</h1>
 * Паттерн Фабричный Метод определяет интерфейс создания обеъекта,
 * но позволяет субклассам выбрать класс создаваемого экземпляра.
 * Таким образом, Фабричный Метод делегирует операцию создания экземпляра субклассам.
 */
public class MethodFactoryApplication {
    public static void main(String[] args) {
        PizzaStore pizzaStore;
        Pizza pizza;

        pizzaStore = new NYPizzaStore();

        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("russian");
        pizza = pizzaStore.createPizza("clam");
        System.out.println(pizza);

        pizzaStore = new ChicagoPizzaStore();

        pizzaStore.orderPizza("peperoni");
        pizza = pizzaStore.createPizza("cheese");
        System.out.println(pizza);
    }
}
