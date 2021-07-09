package game;

public class Main {

	private static RoomManager manager = new RoomManager(14);
	
	private static boolean running = true;
	
	
	//main
	public static void main(String[] args) {
	
		//run init method to instantiate rooms
		manager.init();
		
		//Create the player
		Player player = new Player();
		
		
		//Print menus
		Menus.printInstructions();
		
		
		//The player should start in the starting room
		player.setCurrentRoom(manager.getStartingRoom());
		
		/*
		 * Game Logic
		 */
		
		while(running) {
			Menus.printRoom(player);
			String[] input = Input.collectInput();
			Input.parse(input, player);
		}
		
		/*
		 * not required, but prints only when the game is no longer running
		 */
		
		if (!running) {
			System.out.println("Thanks for playing!");
		}
		
	}
	
	public static void endGame() {
		running = false;
	}
	
	
	
	
	
	
}
