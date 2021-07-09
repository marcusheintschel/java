package game;

//import fixtures.Fixture;
import fixtures.Room;

public class Player {

	
	//the room the player is in
	private Room currentRoom;
	
	//the room the player was in
	private Room prevRoom;
	
	//player storage 
//	private Fixture[] inventory;
	
	public Room getCurrentRoom() {
		return currentRoom;
	}
	
	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
	
	public Room getPrevRoom() {
		return prevRoom;
	}
	
	public void setPrevRoom(Room prevRoom) {
		this.prevRoom = prevRoom;
	}
	
	
	//functionality to have player storage
	//command: *check inventory* then console prints player's inventory
//	public Fixture[] getInventory() {
//		return inventory;
//	}
//	
//	public void setInventory(Fixture item) {
//		//method to create a new array to replace 'inventory' 
//			every time an item is picked up by the player
//	}
}
