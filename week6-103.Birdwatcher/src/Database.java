
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author euanwilliams
 */
public class Database {

    private ArrayList<Bird> birds = new ArrayList();

    public Database() {
    }

    public void Add(Bird bird) {
        birds.add(bird);
    }

    public void Observation(String name) {
        int birdAmount = birds.size();
        int counter = 0;
        for (Bird bird : birds) {
            if (bird.getName().contains(name)) {
                bird.advanceObservations();
            } else {
                counter++;
            }
        }
        if (counter == birdAmount) {
            System.out.println("Is not a bird!");
        }
    }

    public void Show(String name) {
        int birdAmount = birds.size();
        int counter = 0;
        for (Bird bird : birds) {
            if (bird.getName().contains(name)) {
                System.out.println(bird);
            } else {
                counter++;
            }
        }
        if (counter == birdAmount) {
            System.out.println("Is not a bird!");
        }
    }

    public void Statistics() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
}
