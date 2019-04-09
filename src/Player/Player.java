/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player;

import Casino.Casino;
import Games.DiceGame;
import Games.Games;
import Games.HeadsOrTails;

/**
 *
 * @author Marie-Eve
 */
public class Player implements Compare {

    //Attributes
    private String name;
    private int funds;
    private Casino casino;
    private Games playGame;
    private DiceGame diceGame;
    private HeadsOrTails headsOrTails;

    // Constructors 
    public Player(String name, int funds) {
        this.name = name;
        this.funds = funds;
        this.casino = null;
        this.playGame = null;
        this.diceGame = new DiceGame();
        this.headsOrTails = new HeadsOrTails();

    }

    public Player() {

    }

    public Player(Player others) {
        this(others.name, others.funds);
        this.casino = null;
    }

    //Methodes
    @Override
    public String toString() {
        if (this.casino == null) {
            return ("I am " + this.name + ", I have " + this.funds + " coins and I'm not in a Casino");
        } else {
            return ("I am " + this.name + ", I have " + this.funds + " coins and I'm in " + casino.getName());
        }
    }

    public boolean equals(Player others) {
        return this.name.equals(others.name);
    }

    public boolean joinCasino(Casino joiningThisCasino) {

        if (this.funds == 0) {
            System.out.println("You need money to join");
            return false;
        } else {
            if (joiningThisCasino.addPlayer(this) == true) {
                this.casino = joiningThisCasino;
                return true;

            } else {
                return false;
            }
        }
    }

    public boolean quitCasino(Casino leaveCasino) {
        if (leaveCasino.removePlayer(this) == true) {
            this.casino = null;
            return true;
        } else {
            return false;
        }
    }

    public int playTime(Games whichGame, int bid) {

        this.playGame = whichGame;
        casino.findPlayer(this);
        if (bid > this.funds) {
            System.out.println("You cannot bid more than what you have");
            return funds;
        } else {
            if (this.playGame.equals(diceGame)) {
                System.out.println(whichGame.toString());
                this.funds = this.funds - bid;
                this.funds = this.funds + casino.playDiceGame(this, bid);
                System.out.println("funds after bid are " + this.funds);

            } else 
                if (this.playGame.equals(headsOrTails)) {
                System.out.println(whichGame.toString());
                this.funds = this.funds - bid;
                System.out.println("funds after bid are " + this.funds);

                this.funds = this.funds + casino.playheadsOrTailsGame(this, bid);
                return funds;

            }
        }
        return funds;
    }

    @Override
    public int compareTo(Player py1) {
        if (this.getFunds() == py1.getFunds()) {
            if (this.getName().compareToIgnoreCase(py1.getName()) == 0) {
                return 0;
            } else {
                if (this.getName().compareToIgnoreCase(py1.getName()) < 0) {
                    return 1;
                } else {
                    return -1;
                }
            }
        } else {
            if (this.getFunds() > py1.getFunds()) {
                return 1;
            } else {
                return -1;
            }
        }
    }
    //Setters and getters

    public String getName() {
        return name;
    }

    public int getFunds() {
        return funds;
    }

    public Casino getCasino() {
        return casino;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFunds(int funds) {
        this.funds = funds;
    }

    public void setCasino(Casino casino) {
        this.casino = casino;
    }

}
