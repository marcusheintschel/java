package day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 *Most common streams that are used in java come from the java.io package 
 */



public class FileStreamSimulator {
	
	
	
	
	/*
	 * Here are two definitions of streams in java:
	 * 
	 * General: an entity which reads info from a source and can provide information 
	 * to a target location based on source input
	 * 
	 * Exact: [Stream API] : a sequence of objects which support various
	 *  methods that can be pipelined to produce a specific result. these methods will 
	 *  either be intermediate or terminal operations intermediate operations perform some 
	 *  action and produce a new stream. While terminal operations will 
	 * result in a final output
	 * 
	 * Note: operations performed on a stream will NOT effect the original source data
	 * 
	 */
	
	private static FileOutputStream fos = null;
	private static FileInputStream fis = null;
	public static void main(String[] args) {
		System.out.println("Start of App");
		
		try {
		fosExample();
		fisExample();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("End of App");
	}
	
	private static void fosExample() throws IOException {
		fos = new FileOutputStream("files/myfile.txt");
		
		for (int i = 0; i < 5; i++) {
			for (char letter = 'A'; letter <= 'Z'; letter++) {
				fos.write(letter);
				
				if (letter == 'Z')
					fos.write('\n');
			}
		}
		

		/*
		 * Streams are resource intensive processes. and as such we should
		 * close the stream when we no longer require it in our program to save on those resources used
		 */
		
		if (fos != null)
			fos.close();
	}
	
	/*
	 * FileInputStreams allow you to read from a source location (file)
	 * and read the data, one byte at a time.
	 * 
	 */
	private static void fisExample() throws IOException {
		fis = new FileInputStream("files/myfile.txt");
		
		byte in;
		
		while((in = (byte)(fis.read())) != -1) {
			
			System.out.print((char)in);
			
		}
		
		/*
		 * Streams are resource intensive processes. and as such we should
		 * close the stream when we no longer require it in our program to save on those resources used
		 */
		
		if (fis != null)
			fis.close();
		
	}
}
