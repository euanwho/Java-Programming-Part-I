
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());
        boolean leapYear = year % 4 == 0;
        boolean hundred = year % 100 == 0;
        if (leapYear) {
            if (!hundred) {
                System.out.print("The year is a leap year.");
            }
            else if (hundred && (year % 400 == 0)) {
                System.out.print("The year is a leap year.");
            } else {
                System.out.println("The year is not a leap year."); 
            }
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
