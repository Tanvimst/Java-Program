/*
Internships: CodeSoft
Task-1 Number Game
*/
import java.util.Scanner;

public class GuessingNumbersTask {
    public static void main(String[] args) {
        System.out.println("A number is chosen between 1 to 100.");
        int numberToGuess = (int) ((Math.random() * 100) + 1);
        int maxGuesses = 3; // Number of trials
        int guessCount = 0;
        boolean hasGuessedCorrectly = true;
        Scanner myObj = new Scanner(System.in);
        while (guessCount < maxGuesses) {
            System.out.print("Enter the number guess: ");
            int userGuess = myObj.nextInt();
            guessCount++;

            if (userGuess == numberToGuess) {
                hasGuessedCorrectly = true;
                break;
            } else if (userGuess < numberToGuess) {
                System.out.println(" Higher.");
            } else {
                System.out.println("Lower.");
            }
        }

        if (hasGuessedCorrectly) {
            System.out.println("Successful,You have guess the number perfect.");
        }

        myObj.close(); //  close the number
    }
}