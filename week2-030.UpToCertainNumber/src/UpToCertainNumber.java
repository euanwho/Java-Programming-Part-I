
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int limit = Integer.parseInt(reader.nextLine());
        int number = 1;
        
        while (number <= limit) {
            System.out.println(number);
            number++;
        }
    }
}
