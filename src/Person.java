import java.util.Observable;
import java.util.Observer;

//Observer is Subscriber
public class Person implements Observer {
	private String Name;

	public Person(String n) {
		this.Name = n;
	}

	public void sayHello() {
		System.out.println("Hello I'm a Person : " + this.Name);

	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		// when you receive an update from the publisher
		// decide what you shoud do with the message

		System.out.println(this.Name + " Received a message from the publisher!!");
		System.out.println("The new temperature is: " + arg.toString());
		// arg contains the message that came from the publisher

	}

}
