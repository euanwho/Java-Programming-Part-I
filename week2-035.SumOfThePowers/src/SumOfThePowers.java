
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int limit = Integer.parseInt(reader.nextLine());
        
        int power = 0;
        int sum = 0;
        while (power <= limit) {
            sum += (int)Math.pow(2, power);
            power++;
        } 
        
        System.out.println("The result is " + sum);
    }
}
