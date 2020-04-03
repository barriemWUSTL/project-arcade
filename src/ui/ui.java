import java.io.File;
import java.util.Scanner;

public class ui {			
	public static void main(String[] args) {
		System.out.println("Welcome to the Java Arcade!" + "\n" + 
				"Select 1 or 2, and then press enter to play!" + "\n" +
				"Press 1 for Hangman" + "\n" + "Press 2 for War");    	
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();	 //add a try catch to deal with the invalid input exception
		if(input == 1) {
			System.out.println("Hangman selected");
			File file = new File("../hangman/hangman.java");
	        if(file.exists()) {
	        	//desktop.open(file);
	        }
		}
		else if(input == 2) {
			System.out.println("War selected");
		}
		else {
			System.out.println("Invalid input. Please select 1 or 2");
			input = scanner.nextInt();
			System.out.println(input);
		}
		scanner.close();
		
		
		}
}
