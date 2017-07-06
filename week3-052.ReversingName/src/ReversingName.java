import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int counter = 0;
        while (counter < name.length()) {
            counter++;
            System.out.print(name.charAt(name.length() - counter));
        }
    }
}
