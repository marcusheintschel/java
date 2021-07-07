package day5;

import java.util.Scanner;

public class ClosingScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String value = scan.next();
		
		
		/*
		 * When closing a scanner, we do not close the scanner object
		 * we close the resource associated with the scanner, in this case,
		 * we would close the static inputStream of our system class
		 */
//		scan.close();
		
		
		int number = scan.nextInt();
		
		System.out.println(number);
		
		
		/*
		 * Make sure to close the scanner at the end
		 */
		scan.close();
	}
}
