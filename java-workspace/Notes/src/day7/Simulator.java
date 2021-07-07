package day7;

public class Simulator {
	
	
	public static void main(String[] args) {
		
		Function func = new Performer();
		
		func.method();
		
		
		//Creating an object without needing a class (Functional Interface)
		Function lam = () -> {
								System.out.println("Lambdas are kinda cool!");
							 };
		
		lam.method();
		
		PrintMessage pmLam = (num, word) -> 
		{
			if (num < 10)
			System.out.println("[Print Message - Lambda Version]: "
					+ "\nNumber " + num + "\nWord: " + word);
			else
				System.out.println("That's a high number");
		};
		
		pmLam.print(15, "Revature");
		
		pmLam.print(5, "It ran this time!");
	}
	
}
