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
public class DiziOrnek_1 {
    public static void main ( String [] args ){
        
        int [] dizim = {1,2,3,4,5,6,7};
        int  dizim2 [];
        dizim2 = new int [10];
        int toplam = 0;
        int i;
        for(i = 0; i < dizim.length; i++ ){
            
            dizim2[i] = dizim[i];
            toplam = toplam + dizim[i];
        }
        System.out.println(Arrays.toString(dizim2));
        System.out.println(Arrays.toString(dizim));
        System.out.println("toplam : " + toplam);
        
    }
        
}
