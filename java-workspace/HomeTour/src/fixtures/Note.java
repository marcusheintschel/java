package fixtures;

public class Note extends Fixture implements Interactable{

	public Note(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
		
	}


	public void interact() {
		System.out.println();
		System.out.println();
		System.out.println("The note reads as follows:");
		System.out.println(toString());
		System.out.println();
		System.out.println();
	}
	
	public String toString() {
		return longDesc;
	}

}
