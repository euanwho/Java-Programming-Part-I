
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        int counter = 0;
        while (counter < 7) {
            int randomNumber = random.nextInt(39) + 1;
            if (!containsNumber(randomNumber)) {
                numbers.add(randomNumber);
                counter++;
            }
        }
    }

    public boolean containsNumber(int number) {
        if (numbers.contains(number)) {
            return true;
        } else {
            return false;
        }
    }
}
