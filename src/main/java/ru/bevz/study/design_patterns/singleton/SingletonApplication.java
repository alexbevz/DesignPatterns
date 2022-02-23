package ru.bevz.study.design_patterns.singleton;

/**
 * <h1>Одиночка</h1>
 * Паттерн Одиночка гарантирует, что класс имеет только один экземпляр,
 * и предоставляет глобальную точку доступа к этому экземпляру.
 */
public class SingletonApplication {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        singleton.print();
    }
}
