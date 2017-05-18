package com.ajdini.hesge;


import com.ajdini.hesge.Des;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Artrit
 */
public class Game {
    
    private int nbEssai;
    private Des des;
    private int[] tirage;
    private int[] combinaison;
    private int trouve;
    
    public Game(int nbEssai){
        this.nbEssai = nbEssai;
        des = new Des();
        combinaison = new int[des.getNbDes()];
    }
    
    public void play(){
        for(int i = 0; i<nbEssai;i++){
            tirage = des.lancer();
            if(checkValues(tirage)){
                System.out.println("OK");
            }
            else{
                System.out.println("NOP");
            }
        }
    }
    public void combinaisonGagnante(int val1 , int val2, int val3){
        combinaison[0] = val1;
        combinaison[1] = val2;
        combinaison[2] = val3;
    }
    
    public boolean checkValues(int[] valeurs){
        for(int i = 0; i<valeurs.length;i++){
            
            if(valeurs[i] == combinaison[0] || valeurs[i] == combinaison[1] || valeurs[i] == combinaison[2]){
                System.out.println(valeurs[i] + "bonchiffre");
               // return true;
            
            }
        }
        return false;  
    }
    public void afficherRes(int[] valeurs){
        System.out.println();
    }

}

