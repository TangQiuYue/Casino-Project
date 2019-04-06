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
public class HeadsOrTails extends Games {

        //Constructors
    public HeadsOrTails() {
    }

    public HeadsOrTails(String name) {
        super(name);
    }

    public HeadsOrTails(Games others) {
        super(others);
    }
    
    //Methodes
    
    public String Rules(){
        return "The rules are simple: every game a coin "
                + "will be tossed.\n If the coin lands on heads, you get double your "
                + "bet!\n If it lands on tails, you loose your bet. Enjoy!";
    }
 
    @Override
     public int calculateGains(Player player, int bet){
        int min = 1;
        int max = 3;
        int headsOrTails;

        headsOrTails = (int) (min + Math.random() * (max - min));
        if (headsOrTails == 1) {
            bet = bet * 2;
        } else {
            bet = 0;
        }
        return bet;
}
}
