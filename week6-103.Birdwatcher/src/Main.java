
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Commands command = new Commands(reader);
        
        while (true) {
            System.out.print("? ");
            String com = reader.nextLine();
            if (com.equals("Quit")) {
                break;
            }
            command.command(com);
        }
            
    }

}
