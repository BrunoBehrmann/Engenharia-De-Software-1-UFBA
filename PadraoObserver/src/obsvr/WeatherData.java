package obsvr;

import java.util.*;

public class WeatherData implements Subject {
	private ArrayList<Observer> observers;
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = observers.get(i);
			observer.update(this);
		}
	}
	
	public void measurementsChanged(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObservers();
	}
	
	public void setTemperature(float temperature ) {
		this.temperature = temperature;
		notifyObservers();
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
}
