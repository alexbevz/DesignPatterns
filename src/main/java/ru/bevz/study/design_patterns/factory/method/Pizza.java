package ru.bevz.study.design_patterns.factory.method;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    public Pizza() {
        name = this.getClass().getSimpleName();
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Cheese");
        toppings.add("Carrot");
        toppings.add("Olive");
    }

    void prepare() {
        System.out.println("Preparing " + name + "!");
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("adding toppings:");
        toppings.forEach(topping -> System.out.print(topping + " "));
        System.out.println();
    }

    void bake() {
        System.out.println("Baking for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                '}';
    }
}
