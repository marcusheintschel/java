package client;
import java.util.Scanner;
import manager.UserMgr;

public class ConsoleApp {
	public static boolean logout = false;
	UserMgr um = new UserMgr();
	
	public void start() {
		while(logout == false) {
			//show menu
			/*
			 * 1.login
			 * 2.register
			 */
			System.out.println("Please select an option:\n1. Login\n2. Register\n3. Quit");
			try(Scanner scan = new Scanner(System.in)){
			int userInput = scan.nextInt();
			
			switch(userInput) {
				case 1:{
					login();
					break;
				}
				case 2:{
					register();
					break;
				}
				case 3:{
					logout = true;
					System.out.println("Goodbye!");
					System.exit(0);
					break;
				}
				
			}
			
			}catch (Exception e) {
				e.printStackTrace();
			}
		
		
		}
	}

	private void register() {
		// TODO Auto-generated method stub
		um.register();
	}

	private void login() {
		// TODO Auto-generated method stub
		
		um.login();
	}

}
