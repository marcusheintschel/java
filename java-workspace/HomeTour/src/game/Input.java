package game;

import java.util.Scanner;

import fixtures.Room;

public class Input {

	//creating scanner
	
	public static Scanner scan = new Scanner(System.in);
	
	
	/*
	 * Method used to gather input from the user, and converts it to an array
	 */
	
	public static String[] collectInput() {
		//implement method
		System.out.print("What will you do?");
		String input = scan.nextLine();
		String[] inputArray = input.split(" ");
		return inputArray;
	}
	
	
	/*
	 * Method used to examine collected inputs and perform actions
	 */
	public static void parse(String[] command, Player player) {
		
		String action = command[0].toUpperCase().intern();
		
		String details = null;
		Room current = player.getCurrentRoom();
		
		if (command.length > 1) {
			details = command[1].toUpperCase().intern();
		}
		
		
		if (action.equals("GO") || action.equals("MOVE")) {
			 movePlayer(details,player);
			
			
		}else if (action.equals("USE") || action.equals("INTERACT") || action.equals("READ") || action.equals("OPEN") || action.equals("INSPECT")) {
			
			for (int i = 0; i < current.getItems().length; i++) {
				String checkName = current.getItems()[i].getName().toUpperCase();
				if (checkName.contains(details)){
					current.getItems()[i].interact();
				}
			}
			
		}else if (action.equals("LOOK") || details.equals("AROUND")) {
			Menus.lookAround(player);
			
		}else if(action.equals("HELP")) {
			Menus.printHelp();
		}
		
		else if (action.equals("QUIT")) {
			Main.endGame();
		}
			
	
	}
	
	
	public static void movePlayer(String details, Player player) {
		
		Room current = player.getCurrentRoom();
		
		
		
		switch(details) {
		
		case "RIGHT":{
			if(current.getExit(0) != null) {
			player.setCurrentRoom(current.getExit(0));
			}else
				System.out.println("Not an option");
		}break;
		case "LEFT":{
			if(current.getExit(1) != null) {
			player.setCurrentRoom(current.getExit(1));
			}else
				System.out.println("Not an option");
		}break;
		case "FORWARD":{
			if(current.getExit(2) != null) {
			player.setCurrentRoom(current.getExit(2));
			}else
				System.out.println("Not an option");
		}break;
		case "BACKWARD":{
			if(current.getExit(3) != null) {
			player.setCurrentRoom(current.getExit(3));
			}else
				System.out.println("Not an option");
		}break;
		case "BACK":{
			if(current.getExit(3) != null) {
			player.setCurrentRoom(current.getExit(3));
			}else
				System.out.println("Not an option");
		}break;
		
		default: {
			System.out.println("Please enter an action word, 'go' or 'move' followed by a direction \ni.e.:'forward','backward','right','left'. "
					+ "\nFor more information, please enter 'help'.");
		}
		
		
		}
		
	}
	
	
}
