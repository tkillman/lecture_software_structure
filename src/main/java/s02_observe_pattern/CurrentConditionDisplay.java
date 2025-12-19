package s02_observe_pattern;

public class CurrentConditionDisplay implements Observer2, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private final Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        initialize();
    }

    public void initialize() {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity" + pressure + " pressure" + weatherData);
    }
}
