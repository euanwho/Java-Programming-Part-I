
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author euanwilliams
 */
public class Commands {
    private Database database;
    private Scanner reader;

    public Commands(Scanner reader) {
        this.database = new Database();
        this.reader = reader;
    }

    public void command(String command) {
        if (command.equals("Add")) {
            add();
        } else if (command.equals("Observation")) {
            observe();
        } else if (command.equals("Statistics")) {
            statistics();
        } else if (command.equals("Show")) {
            show();
        } else if (command.equals("Quit")) {
            //quit();
        }
    }
    
    public void add() {
        System.out.print("Name: ");
        String name = reader.nextLine();
        System.out.print("Latin Name: ");
        String latinName = reader.nextLine();
        Bird bird = new Bird(name, latinName);
        database.Add(bird);
    }
    
    public void observe() {
        System.out.print("What was observed:? ");
        String name = reader.nextLine();
        database.Observation(name);
    }
    
    public void statistics() {
        database.Statistics();
    }
    
    public void show() {
        System.out.print("What was observed:? ");
        String name = reader.nextLine();
        database.Show(name);
    }
}
