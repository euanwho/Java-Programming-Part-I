import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type numbers: ");
        int sum = 0;
        int totalNumbers = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        while (true) {
            int number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                break;
            }
            
            sum += number;
            totalNumbers++;
            if (number % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
        } 
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + totalNumbers);
        System.out.println("Average: " + 1.0 * sum / totalNumbers);
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}
