package constructors;

public class Dog {
	/*
	 * Constructors do not declare a return type because contstructors cannot return anything
	 * Constructors must match the name of the class in which it is declaring (including casing)
	 * 
	 */
	
	public String name;
	public int age;
	public double weight;
	public String breed;
	
	//constructor for the Dog class (parameterized)
	public Dog(String name, int age, double weight, String breed) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.breed = breed;
	}
	
	/*
	 * If you do not provide a constructor, java will provide one for you 
	 * known as a default (no-args) constructor. The default constructor declares no parameters
	 * and does not perform any actions (seemingly***)
	 * 
	 * There is some implicit functionality, that we will cover later...
	 */
	
	public Dog() {
		this("Default", 0, 0.0, "No Breed");
	}
}
