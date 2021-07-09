package day8;

public class Simulator {

	
	public static void main(String[] args) {
		/*
		 * When you declare the creation of a variable from a class/interface that uses generic, you 
		 * are not required to specify a datatype.
		 * if you don't provide one, java must default to object type for your new object created
		 */
		
//		
//		Generic<String> gc = new Generic<String>("Revature");
//		
//		System.out.println(gc.getValue());\
		
		
		
		Room one = new Room("One");
		Room two = new Room("Two");
		
		
		Manager manage = new Manager(one, two);
		
		System.out.println(manage.getRoom(0));
	}
}
