import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {
        String password = "";
        int counter = 0;
        while (counter < length) {
            int randomNumber = random.nextInt(26);
            char character = alphabet.charAt(randomNumber);
            password += character;
            counter++;
        }
        return password;
    }
}
