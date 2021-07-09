package fixtures;

public class Sign extends Fixture implements Interactable{

	public Sign(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
		
	}


	public void interact() {
		System.out.println();
		System.out.println();
		System.out.println("The Sign Says:");
		System.out.println(toString());
		System.out.println();
		System.out.println();
	}
	
	public String toString() {
		return longDesc;
	}

}
