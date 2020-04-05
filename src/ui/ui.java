import java.util.Scanner;

public class ui {			
	public static void main(String[] args) {
		System.out.println("Welcome to the Java Arcade!" + "\n" + 
				"Select 1 or 2, and then press enter to play!" + "\n" +
				"Press 1 for Hangman" + "\n" + "Press 2 for War");    	
		Scanner scanner = new Scanner(System.in);
		try { 
			boolean badInput = true;
			while(badInput) { //if there is bad input, run through the loop again
				int input = scanner.nextInt();
				if(validInput(input)) {
					badInput = false;
					if(input == 1) {
						System.out.println("Hangman selected");
						runfile(input);
					}
					else if(input == 2) {
						System.out.println("War selected");
						runfile(input);
					}
				}
				else {
					System.out.println("Invalid input. Please select 1 or 2");
					input = scanner.nextInt();
					System.out.println(input);
				
				}				
			}
			
		}
		catch (java.util.InputMismatchException e) {
			System.out.println("Invalid input. Please select 1 or 2");
		}
		scanner.close();
		}
	
	/**
	 * returns true once the input is 1 or 2
	 * @param input
	 * @return
	 */
	private static boolean validInput(int input) {
		if(input == 1 || input == 2) {
			return true;
		}
		else{
			return false;
		}
	}
	
	public static void runfile(int input) {
		if (input == 1) {
			hangmanTemp.run();
			//call method to start hangman
		}
		else if (input == 2 ) {
			warTemp.run();
			//call method to start war
		}
	}
}
