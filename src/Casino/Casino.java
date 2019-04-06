/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casino;

import Games.DiceGame;
import Games.Games;
import Games.HeadsOrTails;
import Player.Player;
import Player.PoorPlayer;
import Player.RichPlayer;
import java.util.Arrays;

/**
 *
 * @author Marie-Eve
 */
public class Casino implements Compare {
    // Attributs 

    private String name;
    private int currentPlayers;
    private int maxPlayers;
    private Player[] playerArray;
    private Games headsOrTails;
    private Games diceGame;
    private boolean gregory = false;

    //Constructeurs
    public Casino(String name, int maxPlayers) {
        this.name = name;
        currentPlayers = 0;
        this.maxPlayers = maxPlayers - 1;
        this.playerArray = new Player[maxPlayers];
        this.headsOrTails = new HeadsOrTails();
        this.diceGame = new DiceGame();
        this.gregory = false;
    }

    public Casino() {
        this(" ", 200);
    }

    public Casino(Casino others) {
        this(others.name, others.maxPlayers);

        this.playerArray = new Player[others.maxPlayers];
        this.currentPlayers = others.currentPlayers;
        this.headsOrTails = others.headsOrTails;
        this.diceGame = others.diceGame;
    }

    //Methodes
    public boolean addPlayer(Player newPlayerAdd) {
        if (this.currentPlayers > this.maxPlayers) {
            return false;
        }
        if (newPlayerAdd == null) {
            return false;
        }
        if (newPlayerAdd instanceof PoorPlayer && newPlayerAdd.getFunds() < 10) {
            return false;
        }
        if (newPlayerAdd instanceof RichPlayer && newPlayerAdd.getFunds() < 1000) {
            return false;
        } else {
            this.playerArray[this.currentPlayers] = newPlayerAdd;
            this.currentPlayers++;
            return true;
        }
    }

    @Override
    public String toString() {
        String temp[] = new String[this.currentPlayers];
        for (int i = 0; i < this.currentPlayers; i++) {
            temp[i] = playerArray[i].getName();
        }

        return "Welcome to " + this.name + "! There are currently " + this.currentPlayers
                + " players in the Casino" + Arrays.asList(temp) + "\n" + " The rules are simple, we "
                + "flip a coin. If it lands on heads, you double your bet, but if it's tails you "
                + "loose it all!";
    }

    public boolean equals(Casino others) {
        boolean samesame = false;
        if (this.name.equals(others)) {
            samesame = true;
        } else {
            samesame = false;
        }
        return samesame;
    }

    public int findPlayer(Player playerSearch) {
        int arrayPosition = -1;
        for (int i = 0; i < this.currentPlayers; i++) {
            if (playerSearch.equals(playerArray[i])) {
                arrayPosition = i;
                if (arrayPosition == -1) {
                    System.out.println("Player not in Casino");
                    System.exit(0);
                }
                break;
            }
        }
        return arrayPosition;
    }

    public boolean removePlayer(Player playerToBeRemoved) {
        int arrayPosition = findPlayer(playerToBeRemoved);
        if (arrayPosition == -1) {
            System.out.println("This player is not in the Casino");
            return false;
        } else {
            for (int i = arrayPosition; i < this.currentPlayers - 1; i++) {
                this.playerArray[i] = this.playerArray[i + 1];
            }
            this.playerArray[currentPlayers] = null;
            this.currentPlayers--;
        }
        return true;
    }

    public int playheadsOrTailsGame(Player player, int bid) {
        int result = 0;
        if (this instanceof MainCasino && this.gregory == true) {
            System.out.println("Time goes by and I never forget\n"
                    + "And I think of you\n"
                    + "Friends would say I may always regret\n"
                    + "When I think of you");
        } else {
            result = this.headsOrTails.calculateGains(player, bid);
        }
        return result;
    }

    public int playDiceGame(Player player, int bid) {
        int result = 0;
        if (this instanceof MainCasino && this.gregory == true) {
            System.out.println("Time goes by and I never forget\n"
                    + "And I think of you\n"
                    + "Friends would say I may always regret\n"
                    + "When I think of you");
        } else {
            result = this.diceGame.calculateGains(player, bid);

        }
        return result;
    }

    @Override
    public void compareTo(Casino casino, Player arrayOfPlayers[]) {
        Player tempArray[] = this.getPlayerArray();
        int temp = this.getCurrentPlayers() - 1;
        int totalFunds1 = 0, totalFunds2 = 0;
        for (int i = 0; i <= temp; i++) {
            totalFunds1 += tempArray[i].getFunds();
            totalFunds2 += arrayOfPlayers[i].getFunds();

        }

        if (totalFunds1 > totalFunds2) {
            System.out.println(this.getName() + " Is the biggest Casino");
        } else {
            System.out.println(casino.getName() + " Is the biggest Casino");
        }
    }

    public String printArray() {
        String temp[] = new String[this.currentPlayers];
        for (int i = 0; i < this.currentPlayers; i++) {
            temp[i] = playerArray[i].getName();
        }
        System.out.print(Arrays.asList(temp));
        return "End of Array";

    }

// Setters and getters
    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentPlayers(int currentPlayers) {
        this.currentPlayers = currentPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public void setPlayerArray(Player[] playerArray) {
        this.playerArray = playerArray;
    }

    public void setHeadsOrTails(Games headsOrTails) {
        this.headsOrTails = headsOrTails;
    }

    public String getName() {
        return name;
    }

    public int getCurrentPlayers() {
        return currentPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public Player[] getPlayerArray() {
        return playerArray;
    }

    public Games getHeadsOrTails() {
        return headsOrTails;
    }

    public Games getDiceGame() {
        return diceGame;
    }

    public void setDiceGame(Games diceGame) {
        this.diceGame = diceGame;
    }

    public boolean isGregory() {
        return gregory;
    }

    public void setGregory(boolean gregory) {
        this.gregory = gregory;
    }

}
