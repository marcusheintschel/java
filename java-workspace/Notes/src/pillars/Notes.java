package pillars;

public class Notes {

	
	
	//Abstraction
	/*
	 *  The process of hiding implementation and processes of an entity
	 *  to reduce complexity or increase understanding of a systems
	 *  properties
	 */
	
	
	
	
	//Polymorphism
	/*
	 * The Ability for objects, classes, variables, and or methods
	 * to alter functionality while maintaining structure
	 */
	
	
	
	
	//Inheritance
	/*
	 * The abiliity for entities to adopt variables (fields) and/or methods
	 * (behavior) from a parent(super) class, allowing for instantiation of child
	 * objects from said parent class
	 */
	
	
	
	
	
	//Encapsulation
	/*
	 * The act of wrapping code into a single unit and then selectively 
	 * exposing and restricting access to that code based on functionality
	 *  or use within classes
	 */
	public static String pub = "Public";
	protected static String pro = "Protected";
	static String def = "Package-Private / Default";
	private static String pri = "Private";
	
	public static void main(String[] args) {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(def);
		System.out.println(pri);
	}
	
	
}
