package strings;

public class StringMethods {
	public static void main(String[] args) {
		String phrase = "Programming is Fun... Sometimes";
		
		System.out.println(phrase.charAt(0));
		System.out.println(phrase.indexOf('g'));
		System.out.println(phrase.indexOf("is"));
		
		String upper = phrase.toUpperCase();
		System.out.println(phrase.equalsIgnoreCase(upper));
		System.out.println(phrase.toUpperCase());
		System.out.println(phrase.toLowerCase());
		System.out.println(phrase);
		
		String equivalent = new String("Programming is Fun... Sometimes");
		System.out.println(phrase == equivalent); //false
		System.out.println(phrase == equivalent.intern()); //true
	}
}
