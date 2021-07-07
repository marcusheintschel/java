package day7;

import java.util.ArrayList;

public class ArraySimulator {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		
		alist.add(5);
		alist.add(6,5);
		
		for (int i = 0; i <= alist.size(); i++) {
			System.out.println(alist.indexOf(i));
		}
	
	
	}
}
