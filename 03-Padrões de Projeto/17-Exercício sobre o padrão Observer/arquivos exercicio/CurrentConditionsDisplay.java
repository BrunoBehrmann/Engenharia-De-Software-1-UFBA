
	
public class CurrentConditionsDisplay implements Observer {
	private float temperature;
	private float humidity;
	
	public void update(WeatherData weatherData) {
		this.temperature = weatherData.getTemperature();
		this.humidity = weatherData.getHumidity();
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
	
}
