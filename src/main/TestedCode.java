/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Marie-Eve
 */
public class TestedCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tested code that works 2019/04/06
        /*
        
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
        
                 //Player method
            //toString Rich Players Before entering the casino 
        System.out.println("Rich players toString before joining casino");
        System.out.println(audrey.toString());
        System.out.println(marie.toString());
        System.out.println(fredou.toString());
        System.out.println(nicola.toString());
        System.out.println(tooPoorTest.toString());
        System.out.println(""); 
        
                //Player method
                //toString Poor Players before entering the Casino
        System.out.println("Poor players toString before joining casino");
        System.out.println(emily.toString());
        System.out.println(pat.toString());
        System.out.println(harry.toString());
        System.out.println(john.toString());
        System.out.println(josh.toString());
        System.out.println(tooPoorToPlay.toString());
        System.out.println(phil.toString());
        System.out.println(oneTooMany.toString());
        System.out.println("");
        
            //Player method
                //Players are joining the Casino
        System.out.println("Joining Casino"); 
        System.out.println(audrey.joinCasino(casinoDeMontreal));
        System.out.println(marie.joinCasino(casinoDeMontreal));
        System.out.println(fredou.joinCasino(casinoDeMontreal));
        System.out.println(nicola.joinCasino(casinoDeMontreal));
        System.out.println("too poor, should be false: " + tooPoorTest.joinCasino(casinoDeMontreal));
        System.out.println(emily.joinCasino(casinoDeMontreal));
        System.out.println(pat.joinCasino(casinoDeMontreal));
        System.out.println(harry.joinCasino(casinoDeMontreal));
        System.out.println(john.joinCasino(casinoDeMontreal));
        System.out.println(josh.joinCasino(casinoDeMontreal));
        System.out.println("too poor, should be false: " + tooPoorToPlay.joinCasino(casinoDeMontreal));
        System.out.println(phil.joinCasino(casinoDeMontreal));
        System.out.println("Casino is full, should be false: " + oneTooMany.joinCasino(casinoDeMontreal));
        System.out.println("");
        
            //Casino Method
                //Array from players who have joined the Casino
        System.out.println("Array of players having entered the Casino");
        casinoDeMontreal.printArray();
        System.out.println("\n");
        
          //Player Method
                //Rich Player toString After entering the Casino
        System.out.println("Rich Player To String after entering Casino");
        System.out.println(audrey.toString());
        System.out.println(marie.toString());
        System.out.println(fredou.toString());
        System.out.println(nicola.toString());
        System.out.println(tooPoorTest.toString());
        System.out.println("");
        
            //Player Method
                //toString Poor Players after entering the Casino
        System.out.println("Poor players toString after trying to join casino");
        System.out.println(emily.toString());
        System.out.println(pat.toString());
        System.out.println(harry.toString());
        System.out.println(john.toString());
        System.out.println(josh.toString());
        System.out.println(tooPoorToPlay.toString());
        System.out.println(phil.toString());
        System.out.println(oneTooMany.toString());
        System.out.println("");
        
                //Main Casino Method
        //Rich Player toString before tax collections
        System.out.println("Rich Player To String before tax collections");
        System.out.println(audrey.toString());
        System.out.println(marie.toString());
        System.out.println(fredou.toString());
        System.out.println(nicola.toString());
        System.out.println("");
        
            //Main Casino Method
                //toString Poor Players before tax collections
        System.out.println("Poor players toString before tax collections");
        System.out.println(emily.toString());
        System.out.println(pat.toString());
        System.out.println(harry.toString());
        System.out.println(john.toString());
        System.out.println(josh.toString());
        System.out.println(phil.toString());
        System.out.println("");
        
        casinoDeMontreal.collectTaxes();
        
           //Main Casino Method
                //Rich Player toString after tax collections
        System.out.println("Rich Player To String after tax collections");
        System.out.println(audrey.toString());
        System.out.println(marie.toString());
        System.out.println(fredou.toString());
        System.out.println(nicola.toString());
        System.out.println(tooPoorTest.toString());
        System.out.println("");
        
            //Main Casino Method
               //toString Poor Players after tax collections
        System.out.println("Poor players toString after tax collections");
        System.out.println(emily.toString());
        System.out.println(pat.toString());
        System.out.println(harry.toString());
        System.out.println(john.toString());
        System.out.println(josh.toString());
        System.out.println(tooPoorToPlay.toString());
        System.out.println(phil.toString());
        System.out.println(oneTooMany.toString());
        System.out.println("");
        
            //Player method
                //Quit casino test
        System.out.println("Should say player is not in casino: ");
        tooPoorToPlay.quitCasino(casinoDeGatineau);
        System.out.println("Should remove player, returns true: ");
        System.out.println(phil.quitCasino(casinoDeMontreal));

            // Player Method
                //Betting   
        
       pat.playTime(diceGame, 5);
       fredou.playTime(headsOrTails, 5);
       System.out.println(audrey.playTime(diceGame, 8000));
       System.out.println(josh.playTime(headsOrTails, 200));
              
        //Player method
                // compareto
        RichPlayer audrey2 = new RichPlayer("Audrey", 5000);
        RichPlayer audrey3 = new RichPlayer("Audrey", 1500);
        audrey2.joinCasino(casinoDeGatineau);
        audrey3.joinCasino(casinoDeGatineau);
        
        System.out.println(audrey.compareTo(pat));
        System.out.println(josh.compareTo(josh));
        System.out.println(audrey.compareTo(audrey2));
        System.out.println(audrey.compareTo(audrey3));

                //Main Casino method
            //Betting with/without Gregory Charle show
        
        casinoDeMontreal.gregoryStartShow();
        System.out.println(audrey.playTime(headsOrTails, 50));
        System.out.println(josh.playTime(diceGame, 5));
        
        casinoDeMontreal.gregoryEndShow();
        System.out.println(audrey.playTime(headsOrTails, 50));
        System.out.println(josh.playTime(diceGame, 5));
        
            //Secondary Casino Method
                //fireAlarm
        System.out.println("Array of players having entered the Casino");
        casinoDeGatineau.printArray();
        casinoDeGatineau.fireAlarm();
        
        System.out.println("Array of players after fireAlarm");
        casinoDeGatineau.printArray();
        */
        

}
    }