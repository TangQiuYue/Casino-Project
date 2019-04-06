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
        
        MainCasino casinoDeMontreal = new MainCasino("Casino de Montreal", 10);
        SecondaryCasino casinoDeGatineau = new SecondaryCasino("Casino de Gatineau", 10);
        
        
        //Creation of rich players
        
        RichPlayer audrey = new RichPlayer("Audrey", 5000);
        RichPlayer marie = new RichPlayer("Marie", 5000);
        RichPlayer fredou = new RichPlayer("Fredou", 3000);
        RichPlayer nicola = new RichPlayer("Nicola", 1500);
        RichPlayer tooPoorTest = new RichPlayer("poorTest", 10);
        
        //toString Before entering the casino
        System.out.println("toString Before entering the casino");
        System.out.println(audrey.toString());
        System.out.println(marie.toString());
        System.out.println(fredou.toString());
        System.out.println(nicola.toString());
        System.out.println(tooPoorTest.toString());
        System.out.println(""); 
        
        //Players are joining the Casino
        System.out.println("Joining Casino"); 
        System.out.println(audrey.joinCasino(casinoDeMontreal));
        System.out.println(marie.joinCasino(casinoDeMontreal));
        System.out.println(fredou.joinCasino(casinoDeMontreal));
        System.out.println(nicola.joinCasino(casinoDeMontreal));
        System.out.println(tooPoorTest.joinCasino(casinoDeMontreal));
        System.out.println("");
        
        //Array from players who have joined the Casino
        System.out.println("Array of players having entered the Casino");
        casinoDeMontreal.printArray();
        System.out.println("\n");
        
        //toString After entering the Casino
        System.out.println("To String after entering Casino");
        System.out.println(audrey.toString());
        System.out.println(marie.toString());
        System.out.println(fredou.toString());
        System.out.println(nicola.toString());
        System.out.println(tooPoorTest.toString());
        System.out.println("");
        
    }
}
