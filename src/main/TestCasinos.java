/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Casino.MainCasino;
import Casino.SecondaryCasino;
import Player.RichPlayer;

/**
 *
 * @author usager
 */
public class TestCasinos {

    public static void main(String[] args) {
       
        //Creation of Casinos
        
        MainCasino casinoDeMontreal = new MainCasino();
        SecondaryCasino casinoDeGatineau = new SecondaryCasino();
        
        
        //Creation of rich players
        
        RichPlayer audrey = new RichPlayer("Audrey", 5000);
        RichPlayer marie = new RichPlayer("Marie", 5000);
        RichPlayer fredou = new RichPlayer("Fredou", 3000);
        RichPlayer nicola = new RichPlayer("Nicola", 1500);
        RichPlayer tooPoorTest = new RichPlayer("poorTest", 10);
        
        casinoDeMontreal.addPlayer(audrey);
        casinoDeMontreal.addPlayer(marie);
        casinoDeMontreal.addPlayer(fredou);
        casinoDeMontreal.addPlayer(nicola);
        casinoDeMontreal.addPlayer(tooPoorTest);
        
        casinoDeMontreal.printArray(casinoDeMontreal.getPlayerArray());
        casinoDeGatineau.printArray(casinoDeGatineau.getPlayerArray());
    }
}
