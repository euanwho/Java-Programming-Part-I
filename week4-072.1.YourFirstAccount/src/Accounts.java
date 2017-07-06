
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account newAccount = new Account("Account",100.00);
        newAccount.deposit(20.0);
        System.out.println(newAccount);
    }

}
