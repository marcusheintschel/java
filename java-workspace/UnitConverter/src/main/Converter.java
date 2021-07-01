package main;

import java.util.Scanner;

public class Converter {
	
	static Scanner input = new Scanner(System.in);
	static boolean loop = true;
	
	public static void main(String[] args) {
		
		
		mainMenu();
		do {
		int choice = input.nextInt();
		
		switch (choice) {
		case 4: {
			System.out.println("Thank you for using the program!" + "\nGoodbye!");
			loop = false;
			System.exit(0);
		} 
		case 1:{
			System.out.println("Please select a volume conversion you would like to make \nby typing the integer"
					+ " which corresponds to your selection:\n1. Gallons to Liters\n"
					+ "2. Cups to Ounces\n3. Cubic Meters to Cubic Feet\n4. Return to Main Menu");
			int selection = input.nextInt();
			
			switch (selection) {
			case 1:{ 
				gallonsToLiters();
				break;
			}
			case 2:{
				cupsToOunces();
				break;
			}
			case 3:{
				cubicMetersToFeet();
				break;
			}
			case 4:{
				mainMenu();
				continue;
			}
			}
		} break;
		case 2:{
			System.out.println("Please select a distance conversion you would like to make \nby typing the integer"
					+ " which corresponds to your selection:\n1. Miles to Kilometers\n"
					+ "2. Nanometers to Miles\n3. Nautical Miles to Inches\n4. Return to Main Menu");
			int selection = input.nextInt();
			
			switch (selection) {
			case 1:{ 
				milesToKilometers();
				break;	
			}
			case 2:{
				nanometersToMiles();
				break;
			}
			case 3:{
				nauticalToInches();
				break;
			}
			case 4:{
				mainMenu();
				continue;
			}
			}
		
		}break;
		case 3:{
			System.out.println("Please select a temperature conversion you would like to make \nby typing the integer"
					+ " which corresponds to your selection:\n1. Fahrenheit to Celsius\n"
					+ "2. Celcius to Kelvin\n3. Fahrenheit to Kelvin\n4. Return to Main Menu");
			int selection = input.nextInt();
			
			switch (selection) {
			case 1:{ 
				fToC();
				break;
			}
			case 2:{
				cToK();
				break;
			}
			case 3:{
				fToK();
				break;
			}
			case 4:{
				mainMenu();
				continue;
			}
			}
		
		}break;
		
		
		
		}
		}while(loop = true);
		
	}
	
//	Main Menu
	public static void mainMenu() {
		System.out.println();
		System.out.println("Main Menu\nPlease select an option by entering an integer from "
				+ "1 to 4 \nfollowed by the enter key:\n1. Volume Conversions\n"
				+ "2. Distance Conversions\n3. Temperature Conversions\n4. Quit Conversion Program");
	}
	
	
//	Methods for Conversions
	
	public static void gallonsToLiters(){
		System.out.println("How many Gallons to convert?");
		Double gallons = input.nextDouble();	
		Double liters = (gallons * 3.78541);
		System.out.println(gallons + " Gallons is: " + liters + " Liters");
		mainMenu();
	}
	
	public static void cupsToOunces() {
		System.out.println("How many Cups to convert?");
		Double cups = input.nextDouble();	
		Double ounces = (cups * 8);
		System.out.println(cups + " Cups is: " + ounces + " Ounces");
		mainMenu();
	}
	
	public static void cubicMetersToFeet() {
		System.out.println("How many Cubic Meters to convert?");
		Double meters = input.nextDouble();	
		Double feet = (meters * 35.3147);
		System.out.println(meters + " Cubic Meters is: " + feet + " Cubic Feet");
		mainMenu();
	}
	
	public static void milesToKilometers() {
		System.out.println("How many Miles to convert?");
		Double miles = input.nextDouble();	
		Double kilometers = (miles * 1.609);
		System.out.println(miles + " Miles is: " + kilometers + " Kilometers");
		mainMenu();
	}
	
	public static void nanometersToMiles() {
		System.out.println("How many nanometers to convert?");
		Double nanometers = input.nextDouble();	
		Double miles = (nanometers * 0.00000000000062137);
		System.out.println(nanometers + " nanometers is: " + miles + " Miles");
		mainMenu();
	}
	
	public static void nauticalToInches() {
		System.out.println("How many Nautical Miles to convert?");
		Double nautical = input.nextDouble();	
		Double inches = (nautical * 72913.4);
		System.out.println(nautical + " Nautical Mile(s) is: " + inches + " Inches");
		mainMenu();
	}
	
	public static void fToC() {
		System.out.println("How many degrees Fahrenheit?");
		Double f = input.nextDouble();	
		Double c = ((f-32)*(5/9) );
		System.out.println(f + " Degrees Fahrenheit is: " + c + " Degrees Celsius");
		mainMenu();
	}
	
	public static void cToK() {
		System.out.println("How many degrees Celsius?");
		Double c = input.nextDouble();	
		Double k = (c + 273.15);
		System.out.println(c + " Degrees Celsius is: " + k + " Degrees Kelvin");
		mainMenu();
	}
	
	public static void fToK() {
		System.out.println("How many degrees Fahrenheit?");
		Double f = input.nextDouble();	
		Double k = ((f-32)*(5/9) + 273.15);
		System.out.println(f + " Degrees Fahrenheit is: " + k + " Degrees Kelvin");
		mainMenu();
	}
}
