
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int bottom = Integer.parseInt(reader.nextLine());
        
        System.out.print("Last: ");
        int top = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        while (bottom <= top) {
            sum += bottom;
            bottom++;
        } 
        
        System.out.println("The sum is " + sum);
    }
}
