package ru.bevz.study.design_patterns.decorator;


/**
 * <h1>Декоратор</h1>
 * Паттерн Декоратор динамически наделяет объект новыми возможностями
 * и является гибкой альтернативной субклассированию в области расширения функциональности.
 */
public class DecoratorApplication {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage houseBlend = new HouseBlend();
        CondimentDecorator beverage = new Soy(houseBlend);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

    }

}
