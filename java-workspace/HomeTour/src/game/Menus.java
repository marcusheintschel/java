package game;

import fixtures.Fixture;
import fixtures.Room;

public class Menus {

	
	/*
	 * prints information to the console regarding the player's current location
	 * 
	 */
	
	public static void printRoom(Player player) {
		System.out.println();
		System.out.println("::::CURRENT LOCATION::::");
		System.out.println("\n" + player.getCurrentRoom().getName());
		System.out.println();
		System.out.println();
		System.out.println("\n" + player.getCurrentRoom().getLongDesc());
		Menus.printRoomExits(player);
		
	}
	
	
	public static void lookAround(Player player) {
		Menus.printInteractableObjects(player.getCurrentRoom());
	}
	
	/*
	 * Method used to print game instructions
	 */
	
	public static void printInstructions() {
		System.out.println("\nPlease enter a command starting with the words 'go' or 'move', "
				+ "\nfollowed by a direction. i.e.: 'forward','backward','right','left'."
				+ "\nTo look around type 'look around'. "
				+ "\nTo interact with an item in a room you're in, please type 'use', "
				+ "\n'interact', 'read', 'inspect', or 'open' followed by the item's name."
				+ "\n To Quit the game, simply type 'quit'");
	}
	
	
	public static void printHelp() {
		System.out.println("\nPlease enter a command starting with the words 'go' or 'move', "
				+ "\nfollowed by a cardinal direction. i.e.: 'forward','backward','back','right','left'."
				+ "\nTo look around type 'look around'. "
				+ "\nTo interact with an item in a room you're in, please type 'use', "
				+ "\n'interact', 'read', 'inspect', or 'open' followed by the item's name."
				+ "\n To Quit the game, simply type 'quit'");
	}
	
	/*
	 * prints all exits connected to a room. in the case of the example the room class has a 
	 * 'getExit' method which can be used to arbitrarily determine a string 
	 * associated with an exit (Cardinal Directions) , and we print this info using this method
	 */
	
	public static void printRoomExits(Player player) {
		if ((player.getCurrentRoom().getExit(0)) != null) {
			System.out.println("To the Right is " + player.getCurrentRoom().getExit(0).getShortDesc());	
		}
		if ((player.getCurrentRoom().getExit(1)) != null) {
			System.out.println("To the Left is " + player.getCurrentRoom().getExit(1).getShortDesc());	
		}
		if ((player.getCurrentRoom().getExit(2)) != null) {
			System.out.println("To the Front is " + player.getCurrentRoom().getExit(2).getShortDesc());	
		}
		if ((player.getCurrentRoom().getExit(3)) != null) {
			System.out.println("To the Rear is " + player.getCurrentRoom().getExit(3).getShortDesc());	
		}
	}
	
	
	/*
	 * This method is used to print a list of 
	 * objects in a room using the list of 'items' (Fixture[])
	 * Specifically, this method searches through all Fixture objects of the items
	 * in a Room, and if the Fixture Object is an instanceof (binary operator) the Interactable 
	 * interface, we print it out.
	 */
	public static void printInteractableObjects(Room room) {
		Fixture[] items = room.getItems();
		System.out.println("You see:");
		if(items != null) {
			for (int i = 0; i < items.length; i++) {
				System.out.println(items[i].getName());
			}
		
	}
}
}