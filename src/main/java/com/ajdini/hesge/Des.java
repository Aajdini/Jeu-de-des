/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ajdini.hesge;

/**
 *
 * @author AJDINI Artrit
 */
public class Des {
    private int nbDes;
    private int[] tirage;
    
    public Des(){
        this.nbDes = 3;
        tirage = new int[nbDes];
    }

    public int getNbDes() {
        return nbDes;
    }
    
    public int[] lancer(){
        for(int i = 0; i<nbDes;i++){
            tirage[i] = getValue();
            System.out.println(tirage[i]);    
        }
        System.out.println("---------------");
        return tirage;
    }
    
    public int getValue(){
        return (int)(Math.random() * 6);
    }
    

}
