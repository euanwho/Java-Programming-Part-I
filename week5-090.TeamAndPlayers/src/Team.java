/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author euanwilliams
 */
import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> team;
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.team = new ArrayList<Player>();
        this.maxSize = 16;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        if (team.size() < maxSize) {
            team.add(player);
        }
    }

    public void printPlayers() {
        for (Player player : team) {
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public int size() {
        return team.size();
    }

    public int goals() {
        int sum = 0;
        for (Player player : team) {
            sum += player.goals();
        }
        return sum;
    }
}
