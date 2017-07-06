
import java.util.Random;

// This is not an exercise but a "sandbox" where you can freely test
// whatever you want
public class Application {

    public static void main(String[] args) {
        double milkProduced = (7 + new Random().nextInt(14)) / 10.0;
        System.out.println(milkProduced);
    }
} 
