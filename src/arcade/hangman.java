package arcade;

import java.util.Scanner;

public class Hangman {

    public static String[] easyWords = {"apple", "pear", "cherry", "noodle", "bread", "pasta", "chip", "salsa", "milk", "cookie"};
    public static String[] hardWords = {"avocado", "sandwich", "carrots", "cucumber", "strawberry", "artichoke", "watermelon", "croissant", "chicken", "ravioli"};

    public static int wrongGuesses = 3;

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
        System.out.print(printable);
    }

    public static void printGame() {
        String word = selectWord();
        System.out.println("Selected word: " + word);
        String[] answer = new String[word.length()];

        for (int i = 0; i < answer.length; i++) {
            System.out.print("_ ");
        }
    }



    public static void main(String[] args) {
//        if (difficultySelection.equals("easy")) { //if user entered easy
//            System.out.println("Easy selected.");
//            int randomIndex = (int)(Math.random()*easyWords.length);
//            System.out.println("Selected: " + easyWords[randomIndex]);
//            System.out.println("Word length: " + easyWords[randomIndex].length());
//
//            String word = easyWords[randomIndex];
//            String[] answer = new String[easyWords[randomIndex].length()];
//
//            for (int i = 0; i < answer.length; i++) {
//                System.out.print("_ ");
//
//            }
//            System.out.println();
//
//            while (wrongGuesses != 6) {
//
//            }
//
//
//        } else {
//            System.out.println("Hard selected."); //if user entered hard
//            int randomIndex = (int)(Math.random()*hardWords.length);
//            System.out.println("Selected:" + hardWords[randomIndex]);
//        }



    }
}
