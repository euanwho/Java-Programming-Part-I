import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        if (name.length() > 2) {
            firstThreeCharacters(name);
        }
    }
    
    public static void firstThreeCharacters(String text) {
        System.out.println("1. character: " + text.charAt(0));
        System.out.println("2. character: " + text.charAt(1));
        System.out.println("3. character: " + text.charAt(2));
    }
}
