package ru.bevz.study.design_patterns.observer;

public class WeatherData implements Source {
    private final WeatherDataSubject weatherDataSubject;
    private float temperature = 0;
    private float humidity = 0;
    private float pressure = 0;

    public WeatherData(WeatherDataSubject weatherDataSubject) {
        this.weatherDataSubject = weatherDataSubject;
    }

    public WeatherDataSubject getWeatherDataSubject() {
        return weatherDataSubject;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    @Override
    public void commit() {
        weatherDataSubject.notifyObservers(this);
    }
}
