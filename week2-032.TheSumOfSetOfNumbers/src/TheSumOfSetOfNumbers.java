
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int limit = Integer.parseInt(reader.nextLine());
        
        int number = 1;
        int sum = 0;
        while (number <= limit) {
            sum += number;
            number++;
        } 
        
        System.out.println("Sum is " + sum);
    }
}
