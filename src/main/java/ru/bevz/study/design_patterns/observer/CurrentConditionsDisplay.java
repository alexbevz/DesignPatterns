package ru.bevz.study.design_patterns.observer;


public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private final WeatherData weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.getWeatherDataSubject().addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("########\n" + this + "\n########");
    }

    @Override
    public String toString() {
        return "CurrentConditionsDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }

    @Override
    public void update(Source source) {
        // mapper imitation
        WeatherData weatherData = (WeatherData) source;
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    public WeatherData getWeatherData() {
        return weatherData;
    }
}
