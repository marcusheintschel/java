package fixtures;

public class TreasureChest extends Fixture implements Interactable {

	public TreasureChest(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
		
	}

	@Override
	public void interact() {
		System.out.println();
		System.out.println();
		System.out.println("The chest opens and you see a single note.\n\n\nHere lies the ashes of the Fabled Zabat.. you have passed the test and completed the game. \n\n\nP.S. Congratulations on being materialistic.");
		System.out.println();
		System.out.println();
		System.out.println("VICTORY");
		System.exit(0);
		
	}

}