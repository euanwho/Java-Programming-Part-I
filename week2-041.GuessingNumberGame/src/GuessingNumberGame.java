
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        
        System.out.print("Guess a number: ");
        int counter = 0;
        while (true) {
            int guess = Integer.parseInt(reader.nextLine());
            if (guess == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if (guess < numberDrawn) {
                counter++;
                System.out.println("The number is greater, guesses made: " + counter);
            } else {
                counter++;
                System.out.println("The number is lesser, guesses made: " + counter);
            }
        }
        // program your solution here. Do not touch the above lines!
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
