package fixtures;

public class Monster extends Fixture implements Interactable {

	public Monster(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
		
	}

	@Override
	public void interact() {
		System.out.println();
		System.out.println();
		System.out.println("The figure approaches you until you see its hideous visage...\n "
				+ "As it continues to get closer, you find yourself\n backing away as it approaches."
				+ "\n'Congratulations! The goal of this little place was to \nsee what type of humans"
				+ "would be best suited to be my replacement as guardian of the Dungeon. You pass!'");
		System.out.println();
		System.out.println();
		System.out.println("VICTORY");
		System.exit(0);
		
	}

}