/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author euanwilliams
 */
public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
        if (value < upperLimit) {
            value++;
        } else {
            value = 0;
        }
    }

    public int getValue() {
        return value;
    }
    
    public void setValue(int counter) {
        if (counter >= 0 && counter <= upperLimit) {
            value = counter;
        }
    }

    public String toString() {
        if (value < 10) {
            return "0" + value;
        } else {
            return "" + value;
        }
    }
}
