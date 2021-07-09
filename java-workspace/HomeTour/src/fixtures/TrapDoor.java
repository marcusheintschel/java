package fixtures;

public class TrapDoor extends Fixture implements Interactable {

	public TrapDoor(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
		
	}

	@Override
	public void interact() {
		System.out.println();
		System.out.println();
		System.out.println("\nA vicious creature dines once again!\n\n Have fun in the afterlife!! Yuck you can still feel your bones melting...");
		System.out.println();
		System.out.println();
		System.out.println("...GAME OVER");
		System.exit(0);
		
	}

}
