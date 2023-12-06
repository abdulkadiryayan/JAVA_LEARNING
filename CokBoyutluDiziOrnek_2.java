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
public class CokBoyutluDiziOrnek_2 {
    public static void main (String []args){
        String [][] dizim;
        dizim = new String [3][3];
        
        dizim [0][0] = "y";
        dizim [0][1] = "y";
        dizim [0][2] = "y";
        
        dizim [1][0] = "x";
        dizim [1][1] = "x";
        dizim [1][2] = "x";
        
        dizim [2][0] = "apo";
        dizim [2][1] = "apo";
        dizim [2][2] = "apo";

        int i;
        for( i = 0; i < dizim.length; i++){
            for(int y = 0; y < dizim[i].length; y++){
                System.out.println(i + " " + " " + y + " " + dizim[i][y] + " ");

            }
        }

        System.out.println("sdfsf" + dizim.length);
        System.out.println("");
        System.out.println("bitti.");
        System.out.println(Arrays.toString(dizim));
        
        
    }
}
