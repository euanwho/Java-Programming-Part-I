/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author euanwilliams
 */
public class Counter {

    private int value;
    private Boolean check;

    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return value;
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            value += increaseAmount;
        }
    }

    public void increase() {
        this.increase(1);
    }

    public void decrease() {
        this.decrease(1);
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            if (check && (value < decreaseAmount)) {
                value -= decreaseAmount;
                value = 0;
            } else {
                value -= decreaseAmount;
            }
        }
        
    }
}
