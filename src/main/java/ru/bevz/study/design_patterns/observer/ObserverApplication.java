package ru.bevz.study.design_patterns.observer;

/**
 * <h1>Наблюдатель</h1>
 * <p>
 * Поттерн Наблюдатель определяет отношение "один-ко-многим"
 * между объектами таким образом, что при изменении состояния одного
 * объекта происходит автоматическое оповещениеи обновление всех зависимых объектов.
 */
public class ObserverApplication {

    public static void main(String[] args) {
        WeatherDataSubject weatherDataSubject = new WeatherDataSubject();
        WeatherData weatherData = new WeatherData(weatherDataSubject);

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherDataSubject);

        weatherData.setTemperature(1);
        weatherData.setHumidity(11);
        weatherData.setPressure(111);
        weatherData.commit();

        currentConditionsDisplay.getWeatherData()
                .getWeatherDataSubject()
                .deleteObserver(currentConditionsDisplay);

        weatherData.setTemperature(2);
        weatherData.setHumidity(22);
        weatherData.setPressure(222);
        weatherData.commit();

    }

}
