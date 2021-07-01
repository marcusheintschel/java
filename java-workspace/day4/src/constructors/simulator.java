package constructors;


/*
 * import statements allow you to dictate which packages to search for information
 *  you are trying to access/objects you want to create from classes
 * When you include an import statement, you are informing your jvm what 
 * locations to search for this data. by default the jvm will only search for classes 
 * within the same package or classes within the java.lang package of the jre. otherwise
 *  you must include an import statement to use that functionality
 *  
 *  You can use the Hotkey combination: CTRL + SHIFT + O to attempt automatic importing
 */
public class simulator {
	public static void main(String[] args) {
		Dog scooby = new Dog("Scooby Doo", 7, 100, "Great Dane");
		
		
		/*
		 * 
		 * The Fully Qualified Class Name (FQCN) is the entire package and class of a 
		 * datatype as it exists within your projects classpath.
		 * 
		 * Instead of importing a class, you can specify the FQCN when declaring 
		 * the datatype, or accessing information related to the class in question. 
		 */
	}
}
