
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        String reversedWord = "";
        int counter = 0;
        while (counter < text.length()) {
            counter++;
            char character = text.charAt(text.length() - counter);
            reversedWord += character;
        }
        return reversedWord;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
