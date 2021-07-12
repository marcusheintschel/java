package day7;

import day7.Developer;
import day7.Person;

public class TestPerson {
	public static void main(String[] args) {
		Person adam = new Developer();
		
		adam.setName("Adam");
		System.out.println(adam.getName());
	}
}
