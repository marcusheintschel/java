package scanner;

import java.util.Scanner;

public class ScannerSimulator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Give me input: ");
		
		String input = scan.nextLine();
		//We actually have a bit of an issue...
		
		System.out.println("Your input was: " + input);
		
		
	}
}
