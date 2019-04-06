/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Games;

import Player.Player;

/**
 *
 * @author usager
 */
public class DiceGame extends Games {

    //Constructors
    public DiceGame(String name) {
        super(name);
    }

    public DiceGame() {
    }

    public DiceGame(Games others) {
        super(others);
    }

    //Methodes 
    @Override
    public String toString(String rules) {
        return " Welcome to " + this.getName() + " ! " + rules;
    }

    public String Rules() {
        return "Welcome to Dice Games! Rules are simple: Roll the dice, if you \n"
                + " get a combined total of 7 you double your bid, \n"
                + "if you get a 6 or an 8, we call it ties \n"
                + "but if you get anything else, we keep your money!";
    }

    @Override
    public int calculateGains(Player player, int bid) {
        int min = 1;
        int max = 7;
        int dice1, dice2;

        dice1 = (int) (min + Math.random() * (max - min));
        dice2 = (int) (min + Math.random() * (max - min));
        switch (dice1 + dice2) {
            case 7:
                bid = bid * 2;
                break;
            case 6:
            case 8:
                return bid;
            default:
                bid = 0;
                break;
        }
        return bid;
    }
}
