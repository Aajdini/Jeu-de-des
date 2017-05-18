/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ajdini.hesge;


/**
 *
 * @author Artrit
 */
public class Main {
    public static void main( String[] args )
    {
        Game game = new Game(10);
        game.combinaisonGagnante(1,2,4);
        game.play();
       
    }
}
