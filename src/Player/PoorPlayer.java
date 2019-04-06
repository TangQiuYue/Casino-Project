/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Marie-Eve
 */
public class PoorPlayer extends Player {

    //Constructors
    public PoorPlayer(String name, int funds) {
        super(name, funds);
    }

    public PoorPlayer() {
    }

    public PoorPlayer(Player others) {
        super(others);
    }

    //methodes

    public int PayDay(Date today) {
        char day;
        String ddmmyyyy = "dd-MM-yyyy";
        SimpleDateFormat theDate = new SimpleDateFormat(ddmmyyyy);
        String date = theDate.format(today);
        day = date.charAt(1);
        if (day == '1') {
            this.setFunds(this.getFunds() + 700);
        }
        return this.getFunds();
    }

    //Creer uniquement pour valider que si la date est le premier du mois, le joueur sera payé
    public int PayDayTest(String ddmmyyyy) {
        char day;
        day = ddmmyyyy.charAt(1);
        System.out.println(day);
        if (day == '1') {
            this.setFunds(this.getFunds() + 700);
        }
        return this.getFunds();
    }

}
