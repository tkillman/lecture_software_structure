public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

        System.out.println("\n forecastDisplay 구독취소 시작 \n");

        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(62, 90, 28.1f);

        System.out.println("\n statisticsDisplay 구독취소 시작 \n");
        weatherData.removeObserver(statisticsDisplay);
        weatherData.setMeasurements(75, 80, 29.5f);

        weatherData.removeObserver(currentDisplay);
        // weatherData.removeObserver(forecastDisplay);
        // weatherData.setMeasurements(85, 70, 30.0f);

    }
}