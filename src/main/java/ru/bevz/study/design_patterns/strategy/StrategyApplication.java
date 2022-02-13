package ru.bevz.study.design_patterns.strategy;

import ru.bevz.study.design_patterns.strategy.behavior.FlyBehavior;
import ru.bevz.study.design_patterns.strategy.behavior.FlyRocket;
import ru.bevz.study.design_patterns.strategy.behavior.QuackBehavior;
import ru.bevz.study.design_patterns.strategy.behavior.Squeak;
import ru.bevz.study.design_patterns.strategy.entity.Duck;
import ru.bevz.study.design_patterns.strategy.entity.MallardDuck;
import ru.bevz.study.design_patterns.strategy.entity.ModelDuck;

/**
 * <h1>Стратегия</h1>
 *
 * Паттерн Стратегия определяет семейство алгоритмов,
 * инкапсулирует каждый из них и обеспечивает их взаимозаменяемость.
 * Он позволяет мофидицировать алгоритмы независимо от их использования.
 *
 * Требуется обеспечивать возможность изменения некоторой части системы
 * независемо от других частей.
 *
 * Важно отделять аспекты поведения класса в отдельный набор классов
 * для предоставления каждого аспекта.
 *
 */
public class StrategyApplication {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        FlyBehavior flyBehavior = new FlyRocket();
        QuackBehavior quackBehavior = new Squeak();

        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        mallardDuck.setFlyBehavior(flyBehavior);
        mallardDuck.setQuackBehavior(quackBehavior);

        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();

        modelDuck.setFlyBehavior(flyBehavior);

        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
    }

}
