package ru.bevz.study.design_patterns.observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private final WeatherDataSubject weatherDataSubject;
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;

    public StatisticsDisplay(WeatherDataSubject weatherDataSubject) {
        this.weatherDataSubject = weatherDataSubject;
        weatherDataSubject.addObserver(this);
    }

    public WeatherDataSubject getWeatherDataSubject() {
        return weatherDataSubject;
    }

    @Override
    public void update(Source source) {
        WeatherData weatherData = (WeatherData) source;
        float temp = weatherData.getTemperature();
        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }

        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
