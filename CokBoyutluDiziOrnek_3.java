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
public class CokBoyutluDiziOrnek_3 {
    public static void main (String []args) {
        int [][] dizim  = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
        };
        for(int i = 0; i < dizim.length; i++){
            for(int y = 0; y < dizim.length; y++){
                System.out.println(i + " " + (y+1) + " " + dizim[i][y]);
            }
        }
        System.out.println(dizim.length);


        
        
    }
    
}
