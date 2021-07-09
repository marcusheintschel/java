package fixtures;

public class Blood extends Fixture implements Interactable {

	public Blood(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
		
	}

	@Override
	public void interact() {
		System.out.println();
		System.out.println();
		System.out.println("\nThe puddle of blood draws you nearer.. and nearer...\n suddenly you have a ravenous thirst for blood... You feel yourself slowly fading into \n the recesses of your mind... You are now a zombie.");
		System.out.println();
		System.out.println("'Sorry about that chap, somebody had to take that fantastic \nhealthy live body of yours, and I couldn't pass up the \nopportunity you see?' you hear a disembodied voice say...");
		System.out.println("...GAME OVER");
		System.exit(0);
		
	}

}