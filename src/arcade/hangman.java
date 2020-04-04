package arcade;

import java.util.Scanner;

public class Hangman {

    public static String[] easyWords = {"apple", "pear", "cherry", "noodle", "bread", "pasta", "chip", "salsa", "milk", "cookie"};
    public static String[] hardWords = {"avocado", "sandwich", "carrots", "cucumber", "strawberry", "artichoke", "watermelon", "croissant", "chicken", "ravioli"};

    public static int wrongGuesses = 0;

    public static boolean isWon = false;

    public static String selectWord() {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Would you like to play an easy or hard game? (Enter easy or hard to make selection)");
        String difficultySelection = scanner.nextLine();  // Read user input
        if (difficultySelection.equals("easy")) { //if user entered easy
            int randomIndex = (int)(Math.random()*easyWords.length);
            return easyWords[randomIndex];
        } else {
            int randomIndex = (int)(Math.random()*hardWords.length);
            return hardWords[randomIndex];
        }
    }

    public static void drawHangman(int numWrong){
        String printable = "";
        if(numWrong == 1){
            printable = "\t O\t\n";
        }else if(numWrong ==2){
            printable = "\t O\t\n\t |\n";
        }else if(numWrong ==3 ){
            printable = "\t O\t\n\t/|\n";
        }else if(numWrong ==4){
            printable = "\t O\t\n\t/|\\\n";
        }else if(numWrong ==5){
            printable = "\t O\t\n\t/|\\\n\t/\n";
        }else if(numWrong ==6){
            printable = "\t O\t\n\t/|\\\n\t/ \\\n YOU LOST\n";
        }
        System.out.println("_________");
        System.out.print(printable);
        System.out.println();
    }


    public static boolean play() {
        String word = selectWord();
        System.out.println("Selected word: " + word);
        char[] answer = word.toCharArray(); //char array that is the goal word
        char[] guess = new char[answer.length];

        System.out.print("Guess: ");
        for (int i = 0; i < guess.length; i++) {
            System.out.print("_ ");
        }
        System.out.println();

        while(wrongGuesses <= 6 || !isWon) {
            Scanner scanner = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Please enter a letter.");
            char letterInput = scanner.nextLine().charAt(0);  // Read user input
            System.out.println(letterInput);

            int wrongCounter = 0;
            for(int i=0; i<answer.length; i++) {
                if(letterInput == answer[i]) {
                    guess[i] = letterInput;
                } else {
                    if(!Character.isLetter(guess[i])) {
                        guess[i] = '_';
                        wrongCounter++;
                    }
                }
            }
            if (wrongCounter == answer.length) {
                wrongGuesses++;
                if (wrongGuesses == 6) {
                    System.out.println("YOU LOST");
                    drawHangman(wrongGuesses);
                } else {
                    System.out.println("Input is incorrect. Guesses remaining: " + (6-wrongGuesses));
                    drawHangman(wrongGuesses);
                }
            }

            int winCounter = 0;
            for (int i = 0; i<answer.length;i++) {
                if(answer[i] == guess[i]) {
                       winCounter++;
                }
            }
            if (winCounter == answer.length) {
                System.out.println("YOU WON");
                isWon = true;
            }

            System.out.print("New Guess: ");
            for (int i = 0; i < guess.length; i++) {
                System.out.print(guess[i]);
                System.out.print(" ");
            }
            System.out.println();
        }

        return false;
    }



    public static void main(String[] args) {
        play();

    }
}
