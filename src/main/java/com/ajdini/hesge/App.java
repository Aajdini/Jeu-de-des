package com.ajdini.hesge;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    
    private  int[] table  = new int[3];
    private  int shots = 0;
    
    public void jouerEssais(){}
   
    public void lancerDes(){
        shots++;
        table[0] = getShotValue();
        table[1] = getShotValue();
        table[2] = getShotValue();
    }
    
    public int getShotValue(){
        return (int)(Math.random() * 6);
    }
    
    public boolean checkValues(){
        for(int i = 0; i<table.length-1;i++){         
           
        }
        table = null;
        System.out.println("C'est raté");
        return false;
    }
    

}
