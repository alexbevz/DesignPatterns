package ru.bevz.study.design_patterns.observer;

import java.util.ArrayList;

public class WeatherDataSubject {
    private final ArrayList<Observer> observers;

    public WeatherDataSubject() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer o) {
        if (o == null) {
            throw new NullPointerException();
        }
        if (!observers.contains(o)) {
            observers.add(o);
        }
    }

    public void deleteObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers(WeatherData weatherData) {
        this.observers.forEach(o -> o.update(weatherData));
    }

}
