
public class Person {
	private String Name;

	public Person(String n) {
		this.Name = n;
	}

	public void sayHello() {
		System.out.println("Hello I'm a Person : "+this.Name);
		
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}
