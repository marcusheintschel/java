package day7;

public class ExceptionSimulator {

	public static void main(String[] args) {
		
		try {
			sumOddNumbers(1,4);
		} catch (EvenNumberException e) {
			System.out.println("Oops");
			performMoreActions();
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			/*
			 * Finally block in a try-catch block can optionally be included at the end
			 * to execute some clean-up code or functionality that you always want to occur
			 * The finally block will ALWAYS execute, except for a few situations
			 * 
			 * 1. Calling System.exit(0)
			 * 2. Catastrophic System Failure
			 */
			
			
			System.out.println("Finally will almost always execute");
		}
		
	}
	
	
	public static int sumOddNumbers(int a, int b) throws EvenNumberException{
		
		if(a % 2 == 0) {
			throw new EvenNumberException("First argument was even");
		}else if (b % 2 == 0) {
			throw new EvenNumberException("Second argument was even");
		}
		
		System.out.println(a+b);
		return a+b;
	}
	
	public static void performMoreActions() {
		System.out.println("Our code can continue here");
	}
}
