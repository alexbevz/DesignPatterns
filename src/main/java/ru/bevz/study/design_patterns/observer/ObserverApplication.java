package ru.bevz.study.design_patterns.observer;

/**
 * <h1>Наблюдатель</h1>
 *
 * Поттерн Наблюдатель определяет отношение "один-ко-многим"
 * между объектами таким образом, что при изменении состояния одного
 * объекта происходит автоматическое оповещениеи обновление всех зависимых объектов.
 *
 */
public class ObserverApplication {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

    }

}
