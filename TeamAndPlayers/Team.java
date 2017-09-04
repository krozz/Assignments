
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author krozz
 */
public class Team {

    private String name;
    private ArrayList<Player> member;
    private int maxsize = 16;

    public Team(String name) {
        this.name = name;
        this.member = new ArrayList<Player>();
        

    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {

       
        if (member.size() < maxsize) {
            
            this.member.add(player);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxsize = maxSize;

    }

    public int size() {
        return member.size();

    }

    public int goals() {
        int totalGoals = 0;
        for (Player p : member) {

            totalGoals += p.goals();

        }
        return totalGoals;
    }

    public void printPlayers() {

        for (Player p : member) {

            System.out.println(p);

        }
    }

}
