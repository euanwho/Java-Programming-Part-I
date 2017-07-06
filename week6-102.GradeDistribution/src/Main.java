
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Type exam scores, -1 completes");
        int[] grades = {0,0,0,0,0,0};
        while (true) {
            int number = Integer.parseInt(lukija.nextLine());
            if (number == -1) {
                break;
            }
            GradeUtils.gradeDistribution(grades, number);
        }
        GradeUtils.print(grades);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    }
}
