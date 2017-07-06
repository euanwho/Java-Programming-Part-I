/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author euanwilliams
 */
public class Bird {
    private String name;
    private String latinName;
    private int observations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    public int getObservations() {
        return observations;
    }

    public String getName() {
        return name;
    }

    public void advanceObservations() {
        this.observations++;
    }

    public String toString() {
        return name + "(" + latinName + "): " + observations + " observations";
    }
}
