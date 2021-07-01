package notes;

public class data {

	
	/*
	 * Scopes are isolated levels of access/data in our programs
	 * 
	 * There are 4 levels of Scopes:
	 * Class/Static - Variables that are created using the static keyword
	 * 					exist in the class/static scope. these variables will 
	 * 					exist throughout the lifetime of the entire application, 
	 * 					since the information is bound to the class 
	 * 					definition, instead of any individual objects
	 * 
	 * Instance/Object - Variables within instance scope exist so long as the object
	 * 						exists in memory and we can access the object via its 
	 * 						reference variable
	 * 
	 * Variables within a method (including blocks within that method) have their
	 * own pool of variable names. This means that you cannot duplicate the same
	 *  variable name anywhere in a method, including within a block
	 *  
	 * Method - Variables within method scope exist within the execution of a method, 
	 * 			but are lost once we finish method execution, or exit the method in some way
	 * 
	 * Block - Variables within block scope exist within a flow control statement. 
	 * 			Note that flow control statements must exist within a method's scope. 
	 * 			Effectively, block scopes are a lower scope than method
	 * 			
	 */
	
	//Class/Static
	public static String staticName;
	public static int staticId;
		
	//Instance
	public String name;
	public int id;
	
	//Method
	
	
	public void shadow() {
		
		/*
		 * You can duplicate the name of a variable that exists at a class/instance scope 
		 * of a class within a method in that class
		 */
		String name = "name within method shadow";
		String staticName = "StaticName within method shadow";
		
	}
	public void method() {
		double decimal = 100.0;
		
		double sum = decimal + 55.5;
		
		/*
		 * To retain the info in a method, you must use return
		 */
	}
	
	public void other() {
//		double calculation = decimal *3; //error - decimal does not exist within this method
		
		int i = 0;
		if (i>10) {
			String word = "Greater than 10";
			System.out.println(word);
			
		}
		
//		System.out.println(word); //we lose access to word once we leave the if-statement
		
		for(int x = 0; x<5;x++) {
			System.out.println(x);
		}
//		System.out.println(x); //error - we left our for-loop's block scope
	}
	
	
}
