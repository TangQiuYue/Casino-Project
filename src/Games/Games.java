/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Games;

import Player.Player;

/**
 *
 * @author Marie-Eve
 */
public abstract class Games {

    //Attributs
    private String name;

    //Contructors
    public Games(String name) {
        this.name = name;
    }

    public Games() {
        this("");
    }

    public Games(Games others) {
        this(others.name);
    }

    //methodes
    public String toString(String rules) {
        return " Welcome to " + this.name + " ! " + rules ;
    }
    
    public abstract int calculateGains(Player player, int bet);

    public boolean equals(Games others) {
        return this.name.equals(others.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
