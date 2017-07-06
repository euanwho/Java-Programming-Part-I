
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while (true) {
            System.out.print("Type the password: ");
            double number = Double.parseDouble(reader.nextLine());
            if (!(number > 40 || number < -30)) {
                Graph.addNumber(number);
            }
        }
    }
}