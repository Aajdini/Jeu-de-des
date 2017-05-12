package com.ajdini.hesge;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    
    private static int[] table  = new int[3];
    private static int shots = 0;
    
    public static void main( String[] args )
    {
        System.out.println( "1er lancé" );
        lancerDes();
        checkValues();

    }
    
    
    public static int getShotValue(){
        return (int)(Math.random() * 6);
    }
    
    public static boolean checkValues(){
        for(int i = 0; i<table.length-1;i++){
            if(table[i] == 1  || table[i] == 2 || table[i] == 4 ){  
                System.out.println("Trouvé");
                System.out.println(table[i]);
            }
            return false;
        }
        table = null;
        System.out.println("C'est raté");
        return false;
    }
    
    public static void lancerDes(){
        table[0] = getShotValue();
        table[1] = getShotValue();
        table[2] = getShotValue();
    }
}
