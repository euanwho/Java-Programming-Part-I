/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author euanwilliams
 */

import java.util.*;
public class Phonebook {
    private ArrayList<Person> Phonebook = new ArrayList();
    
    public void add(String name, String number) {
        Person person = new Person(name, number);
        Phonebook.add(person);
    }
    
    public void printAll() {
        for (Person person : Phonebook) {
            System.out.println(person);
        }
    }
    
    public String searchNumber(String name) {
        for (Person person: Phonebook) {
            if (name == person.getName()) {
                return person.getNumber();
            }
        }
        return "number not known";
    }
}
