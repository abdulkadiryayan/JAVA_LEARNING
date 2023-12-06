/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letssgooo;

import java.util.Arrays;

/**
 *
 * @author abdul
 */
public class DiziOrnek_2 {
    public static void main (String  [ ] args){
        String [] isimler;
        isimler = new String [5];
        isimler [0] = "a";
        isimler [1] = "b";
        isimler [2] = "c";
        isimler [3] = "d";
        isimler [4] = "e";

        //System.out.println("harfler : " + Arrays.toString(isimler));
        System.out.print("tersten yazılısı : ");
        for( int i = isimler.length-1; i >= 0; i--){
            System.out.print(isimler[i] + " ");
        }
        
        
        
        
    }
    
}
