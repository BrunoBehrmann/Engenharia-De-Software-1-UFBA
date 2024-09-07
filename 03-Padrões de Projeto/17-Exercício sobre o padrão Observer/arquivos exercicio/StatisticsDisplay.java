

public class StatisticsDisplay implements Observer {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;

	public void update(WeatherData weatherData) {
		tempSum += weatherData.getTemperature();
		numReadings++;

		if (weatherData.getTemperature() > maxTemp) {
			maxTemp = weatherData.getTemperature();
		}
 
		if (weatherData.getTemperature() < minTemp) {
			minTemp = weatherData.getTemperature();
		}

		display();
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}
}
