package obsvr;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
	
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
		weatherData.registerObserver(currentDisplay);
		
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
		weatherData.registerObserver(statisticsDisplay);
		
		ForecastDisplay forecastDisplay = new ForecastDisplay();
		weatherData.registerObserver(forecastDisplay);
		
		CurrentConditionsDisplay currentDisplay2 = new CurrentConditionsDisplay();
		weatherData.registerObserver(currentDisplay2);
		
		weatherData.measurementsChanged(80, 65, 30.4f);
		System.out.println();
		weatherData.measurementsChanged(82, 70, 29.2f);
		System.out.println();
		weatherData.measurementsChanged(78, 90, 29.2f);
		
		weatherData.removeObserver(currentDisplay);
		weatherData.removeObserver(currentDisplay2);
		
		System.out.println();
		System.out.println("Sem Condicoes Atuais");
		weatherData.measurementsChanged(80, 65, 30.4f);
	}
}
