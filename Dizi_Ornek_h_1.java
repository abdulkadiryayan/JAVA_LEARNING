/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letssgooo;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author abdul
 */
public class Dizi_Ornek_h_1 {
    public static void main(String[] args) {
        int [] dizim = new int[5];
        Scanner girdi = new Scanner(System.in);
        int toplam = 0;
        System.out.println("5 tane sayı girin : ");
        for(int i= 0; i < dizim.length; i++){
           
            System.out.print((i+1) + ". sayı : " );
            int girdi_1 = girdi.nextInt();

            
            dizim[i] = girdi_1;
            toplam += girdi_1;
            
            
            
        }
        System.out.println("dizim : " + Arrays.toString(dizim));
        System.out.println("dizideki elemanalrın toplamı : " + toplam);
        
    }
    
}
