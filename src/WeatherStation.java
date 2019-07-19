import java.util.Observable;

//Observable is publisher
public class WeatherStation extends Observable {
	private int temperature;

	public WeatherStation(int temp) {
		this.temperature = temp;
	}

	public void sayHello() {
		System.out.println("Hello I'm a weatherStation : " + this.temperature);

	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		//1. Chage the temp
		this.temperature = temperature;
		//2. Tell everyone about the weather
		//Indicate something changed
		this.setChanged(); // methods of observable
		// Tell subscirbers about the new temperature
		this.notifyObservers(this.temperature); // methods of observable
	}

}
