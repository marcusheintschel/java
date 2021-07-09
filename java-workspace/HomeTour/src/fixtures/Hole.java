package fixtures;

public class Hole extends Fixture implements Interactable {

	public Hole(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
		
	}

	@Override
	public void interact() {
		System.out.println();
		System.out.println();
		System.out.println("\nThrough the peephole, you can see what seems to be an elaborate maze.\n Oh goodness... you can just faintly hear someone is crying out for help.. Wait.\n HOW DID YOU GET IN THIS MAZE");
		System.out.println();
		System.out.println();
		System.out.println("...GAME OVER");
		System.exit(0);
		
	}

}
