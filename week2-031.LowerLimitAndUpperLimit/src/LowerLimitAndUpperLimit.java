
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int bottom = Integer.parseInt(reader.nextLine());
        
        System.out.print("Last: ");
        int top = Integer.parseInt(reader.nextLine());
        
        while (top >= bottom) {
            System.out.println(bottom);
            bottom++;
        }

    }
}
