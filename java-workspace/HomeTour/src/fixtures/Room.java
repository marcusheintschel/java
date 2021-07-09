package fixtures;

//import java.util.HashMap;
//import java.util.Map;

public class Room extends Fixture implements Interactable {

	/*
	 * a list of adjacent rooms (rooms that can be accessed from current room)
	 * private array with size 4 for cardinal directions
	 */
	private Room[] exits = new Room[4];
	
	//could not get the map to work
//	private Map<String, Room> exits = new HashMap<String, Room>();
	/*
	 * Fixture array is a collection of items we can have in current room
	 */
	private Fixture[] items;
	
	public Room(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
		
	}

	public Room[] getExits() {
		return this.exits;
	}
	
	/*
	 * This method can be used to get a specific exit from the Room
	 */
	public Room getExit(int i) {
		return this.exits[i];
	}
	
	//setter for exits
	public void setExits(Room[] exits) {
		this.exits = exits;
	}
	
	//Overloaded setter method. Allows us to set single exit based on index
	public void setExits(Room exit, int index) {
		this.exits[index] = exit;
	}
	
	//Getter and Setter for Fixtures
	public Fixture[] getItems() {
		return items;
	}
	
	/*
	 * The setter method here uses VarArgs simply for ease of use
	 */
	public void setItems(Fixture... items) {
		this.items = items;
	}

	@Override
	public void interact() {
		// TODO Auto-generated method stub
		
	}
	
}
