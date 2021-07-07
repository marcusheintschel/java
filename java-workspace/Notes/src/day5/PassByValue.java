package day5;


/*
 * when using variables in Java, it is important to keep in mind that Java is considered 
 * a pass-by-value programming language
 * 
 * 
 * Pass-by-value - When you provide input to a method (arguments) you only ever provide the value that is 
 * stored within a variable, not a direct reference to the variable itself
 * 
 * Pass-by-reference - Pass by reference
 */


public class PassByValue {
	public static void main(String[] args) {
		int num = 5;
		
		System.out.println(modify(num));
		
		System.out.println(num);
		
		Data d = new Data(100);
		System.out.println(d.id);
		
		System.out.println(modify(d).id);
	}
	
	public static int modify(int num) {
		num = num + 15;
		return num;
	}
	
	public static Data modify(Data d) {
		d.id = d.id + 15;
		return d;
	}
}
