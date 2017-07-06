/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author euanwilliams
 */
import java.util.Random;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        starsInLastPrint = 0;
    }

    public NightSky(double density) {
        this(density, 20, 10);
    }

    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public void printLine() {
        Random random = new Random();
        for (int i = 0; i < width; i++) {
            double probability = random.nextDouble();
            boolean toPrint = (probability <= density) ? true : false;
            if (toPrint) {
                starsInLastPrint++;
            }
            System.out.print((toPrint) ? "*" : " ");
        }
    }

    public void print() {
        starsInLastPrint = 0;
        for (int i = 0; i < height; i++) {
            printLine();
            System.out.print("\n");
        }
    }

    public int starsInLastPrint() {
        return starsInLastPrint;
    }
}
