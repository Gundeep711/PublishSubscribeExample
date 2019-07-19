
public class WeatherStation {
	private int temperature;

	public WeatherStation(int temp) {
		this.temperature = temp;
	}
	
	public void sayHello() {
		System.out.println("Hello I'm a weatherStation : "+this.temperature);
		
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

}
