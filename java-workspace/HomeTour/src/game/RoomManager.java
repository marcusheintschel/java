package game;

import fixtures.Blood;
import fixtures.Hermit;
import fixtures.Hole;
import fixtures.Monster;

//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;

import fixtures.Note;
import fixtures.Room;
import fixtures.Sign;
import fixtures.TrapDoor;
import fixtures.TreasureChest;

public class RoomManager {

	
	//The room the player starts in
	Room startingRoom;
	//an array of all the rooms in the house
	Room[] rooms;
	
	public RoomManager(int roomCount) {
		super();
		rooms = new Room[roomCount];
	}
	
	
	public void init() {
		
		//Creating rooms
		Room room1 = new Room(
				"The Archway",
				"A Large Gothic Archway",
				"A looming archway stretches above as menacingly real looking gargoyles look down "
				+ "\nupon you lined with ornate but clearly weathered decorations. There "
				+ "\nare two Staircases, one to the East, and One to the West. The East "
				+ "\nStaircase goes up, and is lined with a deep red rug all the way up. The "
				+ "\nWest Staircase is a dark and wet stone, and seems like a slipping hazard");
		this.rooms[0] = room1;
		
		
		Room room2 = new Room(
				"The Upstairs",
				"A Lavish Room",
				"The Staircase leads to an expansive room which seems to be very "
			   + "\nfancy, with ornate decorations and priceless statues lying about. \nThere are "
			   + "jewels lying all over the floor and a \nTreasure Chest "
			   + "\non the right side of the room.");
		this.rooms[1] = room2;
		
		Room room3 = new Room(
				"The Basement",
				"A Cramped Dark Basement",
				"The Staircase leads to a cold and dark room without very much light, "
			   + "\nexcept for one small hole in the center of the east wall. "
			   + "\nYou see three doors besides the one you came through. "
			   + "\nAn Ominous Note lies on the ground.");
		this.rooms[2] = room3;
		
		Room room4 = new Room(
				"The Sun Room",
				"A Bright Happy Room",
				"You open the door into a brilliantly lit room filled with cutesy "
				+ "\nchildren's toys and fun hijinks. Not at all what you were expecting, "
				+ "\nbut you're pleasantly surprised");
		this.rooms[3] = room4;
		
		Room room5 = new Room(
				"The Bedroom",
				"A Bedroom",
				"You come upon a king sized bed, but with a strange hermit making "
				+ "\nalltogether too much noise to really be asleep...");
		this.rooms[4] = room5;
		
		Room room6 = new Room(
				"The Laundry Room",
				"A Laundry Room",
				"You enter the laundry room to find that the Washer door is open, "
				+ "\nand it seems like someone was here recently. Wait a minute... "
				+ "\nis that.. is that blood on the floor???");
		this.rooms[5] = room6;
		
		Room room7 = new Room(
				"The Wine Cellar",
				"The Wine Cellar",
				"As you enter the wine cellar, you notice a faint smell of bleach, "
				+ "\nlilac, and raw seafood. As this strange olfactory assault hits you,"
				+ "\n you notice a door on the floor. Wonder what could be inside...");
		this.rooms[6] = room7;
		
		Room room8 = new Room(
				"The Dungeon",
				"The Dungeon",
				"Upon leaving the cold and wet basement, you find yourself in a room that feels "
				+ "\neerily colder and danker. It looks like there's a shadow huddled in the "
				+ "\ncorner for warmth... After a minute the figure shuffles toward you.");
		this.rooms[7] = room8;
		
		Room room9 = new Room(
				"Empty Room",
				"The Empty Room",
				"This room appears to have nothing in it..."
				+ "\nStrange...");
		this.rooms[8] = room9;
		
		//adding more rooms
		
//		Room room10 = new Room(
//				"",
//				"",
//				"");
//		this.rooms[9] = room10;
//		
//		Room room11 = new Room(
//				"",
//				"",
//				"");
//		this.rooms[10] = room11;
//		
//		Room room12 = new Room(
//				"",
//				"",
//				"");
//		this.rooms[11] = room12;
//		
//		Room room13 = new Room(
//				"",
//				"",
//				"");
//		this.rooms[12] = room13;
//		
//		Room room14 = new Room(
//				"",
//				"",
//				"");
//		this.rooms[13] = room14;
//		
		//Set Exits
		// Exit naming convention - right, left, forward, back
		Room[] room1exits = {room2, room3, null, null};
		room1.setExits(room1exits);
		
		Room[] room2exits = {room4, room6, room5, room1};
		room2.setExits(room2exits);
		
		Room[] room3exits = {room7, room9, room8, room1};
		room3.setExits(room3exits);
		
		Room[] room4exits = {null, null, null, room2};
		room4.setExits(room4exits);
		
		Room[] room5exits = {null, null, null, room2};
		room5.setExits(room5exits);
		
		Room[] room6exits = {null, null, null, room2};
		room6.setExits(room6exits);
		
		Room[] room7exits = {null, null, null, room3};
		room7.setExits(room7exits);
		
		Room[] room8exits = {null, null, null, room3};
		room8.setExits(room8exits);
		
		Room[] room9exits = {null, null, null, room3};
		room9.setExits(room9exits);
		
//		Room[] room10exits = {null, null, null, null};
//		room10.setExits(room10exits);
//		
//		Room[] room11exits = {null, null, null, null};
//		room11.setExits(room11exits);
//		
//		Room[] room12exits = {null, null, null, null};
//		room12.setExits(room12exits);
//		
//		Room[] room13exits = {null, null, null, null};
//		room13.setExits(room13exits);
//		
//		Room[] room14exits = {null, null, null, null};
//		room14.setExits(room14exits);
		
		
		
		//Create Objects
		
		Note note = new Note("Ominous Note","Caution!!! Danger!!!","The Wine Cellar contains a very "
				 			+ "\ndangerous creature. Whatever you do, do not open the trapdoor.");
		TrapDoor trapdoor = new TrapDoor("TrapDoor", null, null);
		Hermit hermit = new Hermit("Hermit", null, null);
		Hole hole = new Hole("Hole in Wall",null,null);
		Blood blood = new Blood("blood",null,null);
		TreasureChest tc = new TreasureChest("Treasure Chest",null,null);
		Sign sign = new Sign("sign",null,"You are now DEAD... sorry");
		Monster bill = new Monster("figure",null,null);
		//Set item list for Rooms
		room2.setItems(tc);
		room3.setItems(note,hole);
		room7.setItems(trapdoor);
		room5.setItems(hermit);
		room6.setItems(blood);
		room4.setItems(sign);
		room8.setItems(bill);
		//Set Starting room
		this.startingRoom = room1;
	}
	
	public Room getStartingRoom() {
		return this.startingRoom;
	}
	
	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}
	
	public Room[] getRooms() {
		return this.rooms;
	}
	
	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}


}
