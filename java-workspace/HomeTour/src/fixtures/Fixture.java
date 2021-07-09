package fixtures;

public abstract class Fixture implements Interactable{
	
	
	//A short name / title for the fixture
	protected String name;
	
	/*
	 * a one-sentence-long description of a fixture 
	 * used to briefly mention the fixture
	 */
	protected String shortDesc;
	
	/*
	 * a paragraph-long description of the thing, displayed when the player 
	 * investigates the fixture thoroughly (looks at it, enters a room)
	 */
	protected String longDesc;
	
	//Constructor for Fixture with parameters
	public Fixture(String name, String shortDesc, String longDesc) {
		super();
		this.name = name;
		this.shortDesc = shortDesc;
		this.longDesc = longDesc;
	}
	
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getShortDesc() {
		return shortDesc;
	}
	
	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}
	
	public String getLongDesc() {
		return longDesc;
	}
	
	public void setLongDesc(String longDesc) {
		this.longDesc = longDesc;	
	}
	
	//toString override
	public String toString() {
		return "Fixture [name=" + name + ", shortDesc=" + shortDesc + ", longDesc=" + longDesc + "]";
	}
	
	
}
