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
		System.out.println(pub); //available everywhere
		System.out.println(pro); // protected and default fields must be accessed in the same package
		System.out.println(def); // you can access protected fields outside of a
								// package if you establish an inheritance relationship
		System.out.println(pri); // can't access out of this class (private)
		
		
		
		
	}
	
	public String accountHolder;
	public double accountTotal;
	public long accountId;
	
	/*
	 * Getters and Setters are a convention used to read/access or change/mutate the fields
	 * (variables) on a class
	 * getters and setters use the following naming convention
	 * 
	 * get<VariableName>
	 * set<VariableName>
	 */
	public String getAccountHolder(){
		return accountHolder;
	}
	
	void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	double getAccountTotal() {
		return accountTotal;
	}

	private void setAccountTotal(double accountTotal) {
		this.accountTotal = accountTotal;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	
}
