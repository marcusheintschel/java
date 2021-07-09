package fixtures;

public class Hermit extends Fixture implements Interactable {

	public Hermit(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
		
	}

	@Override
	public void interact() {
		System.out.println();
		System.out.println();
		System.out.println("\nToday is really not your day... The Hermit was a djinn, and has decided to torment you for all eternity.");
		System.out.println();
		System.out.println();
		System.out.println("GAME OVER");
		System.exit(0);
		
	}

}
