/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casino;

import Player.Player;

/**
 *
 * @author Marie-Eve
 */
public class MainCasino extends Casino {


    //Constructors 
    public MainCasino(String name, int maxPlayers) {
        super(name, maxPlayers);
    }

    public MainCasino() {
    }

    public MainCasino(Casino others) {
        super(others);
    }

    //Methodes
    public void collectTaxes() {
        Player tempArray[] = this.getPlayerArray();
        int temp = this.getCurrentPlayers()-1;
        int tempFunds, taxes;
        for (int i = 0; i <= temp; i++) {
           tempFunds = tempArray[i].getFunds();
           taxes = ((tempFunds *15)/100);
          tempFunds= tempFunds - taxes;
          tempArray[i].setFunds(tempFunds);

        }

    }
    public void gregoryStartShow(){
        this.setGregory(true);
    }
    
    public void gregoryEndShow(){
        this.setGregory(false);
    }

    
}
