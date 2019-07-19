import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Working");
		// 1. Create the publisher
		Person p =new Person("Gundeep");
		p.sayHello();
		
		Person p2=new Person("Jobanps");
		// 2. Create the subscriber
		WeatherStation w =new WeatherStation(20);
		w.sayHello();
		// 3. Make subscriber to listen to subscriber
		w.addObserver(p);
		w.addObserver(p2);		
		// 3. Publisher sends a message (Weather station changes the weather)
		// Get temperature from user
		System.out.println("What is the temperature??");
		Scanner input =new Scanner(System.in);
		int temp = input.nextInt();
		w.setTemperature(temp);
		System.out.println("Updated the weather. ");
		
	}

}
