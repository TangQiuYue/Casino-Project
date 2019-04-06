/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player;

/**
 *
 * @author usager
 */
public class RichPlayer extends Player {

    //Constructors
    public RichPlayer(String name, int funds) {
        super(name, funds);
    }

    public RichPlayer() {
    }

    public RichPlayer(Player others) {
        super(others);
    }

    //Methodes
    public int BankRupt() {
        this.setFunds(0);
        quitCasino(this.getCasino());
        return this.getFunds();
 
    }

}
