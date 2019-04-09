/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Casino.MainCasino;
import Casino.SecondaryCasino;
import Games.DiceGame;
import Games.HeadsOrTails;
import Player.PoorPlayer;
import Player.RichPlayer;

/**
 *
 * @author usager
 */
public class TestCasinos {

    public static void main(String[] args) {

        //Creation of Casinos
        MainCasino casinoDeMontreal = new MainCasino("Casino de Montreal", 10);
        SecondaryCasino casinoDeGatineau = new SecondaryCasino("Casino de Gatineau", 10);
        
        //Creation of Games
        DiceGame diceGame = new DiceGame();
        HeadsOrTails headsOrTails = new HeadsOrTails();

        //Creation of rich players
        RichPlayer audrey = new RichPlayer("Audrey", 5000);
        RichPlayer marie = new RichPlayer("Marie", 5000);
        RichPlayer fredou = new RichPlayer("Fredou", 3000);
        RichPlayer nicola = new RichPlayer("Nicola", 1500);
        RichPlayer tooPoorTest = new RichPlayer("poorTest", 10);

        //Creation of poor players
        PoorPlayer emily = new PoorPlayer("Emily", 50);
        PoorPlayer pat = new PoorPlayer("Pat", 25);
        PoorPlayer harry = new PoorPlayer("Harry", 15);
        PoorPlayer john = new PoorPlayer("John", 30);
        PoorPlayer josh = new PoorPlayer("Josh", 100);
        PoorPlayer tooPoorToPlay = new PoorPlayer("Too Poor", 5);
        PoorPlayer phil = new PoorPlayer("Phil", 85);
        PoorPlayer oneTooMany = new PoorPlayer("One Too Many", 200);

        //Players are joining the Casino
        audrey.joinCasino(casinoDeMontreal);
        marie.joinCasino(casinoDeMontreal);
        fredou.joinCasino(casinoDeMontreal);
        nicola.joinCasino(casinoDeMontreal);
        emily.joinCasino(casinoDeMontreal);
        pat.joinCasino(casinoDeMontreal);
        harry.joinCasino(casinoDeMontreal);
        john.joinCasino(casinoDeMontreal);
        josh.joinCasino(casinoDeMontreal);
        phil.joinCasino(casinoDeMontreal);
        System.out.println("");

        //Array from players who have joined the Casino
        System.out.println("Array of players having entered the Casino");
        casinoDeMontreal.printArray();
        System.out.println("\n");
        
        //Betting with/without Gregory Charle show
        
        casinoDeMontreal.gregoryStartShow();
        System.out.println(audrey.playTime(headsOrTails, 50));
        System.out.println(josh.playTime(diceGame, 5));
        
        casinoDeMontreal.gregoryEndShow();
        System.out.println(audrey.playTime(headsOrTails, 50));
        System.out.println(josh.playTime(diceGame, 5));

    }
}
