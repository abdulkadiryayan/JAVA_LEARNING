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
 * aynı girdi1 i 1 den fazlz kullanıyoruz her girdi için 
 * scanner la farklı girdi almaya gerek varmı 
 * yada komleps olursa o zaman m ıgerek olur buna bak
 */


//Örnek: Java’daki dizide en büyük ve en küçük öğeyi bulma


public class Dizi_Ornek_h_7 {
    public static void main(String [] args){
        Scanner girdi1 = new Scanner(System.in);
        System.out.println("dizi boyutunu gir: ");
        int diziboyutu = girdi1.nextInt();
        int [] dizim = new int[diziboyutu];
        int i,sayilar, enbuyuk = 0, enkucuk = 0;
        for( i = 0; i < dizim.length; i++){
            System.out.print( (i+1) +  ". sayı : ");
            dizim[i] = girdi1.nextInt();
            
            
        }       
        System.out.println("dizim : " + Arrays.toString(dizim));

        
        for(i = 0; i < dizim.length; i++){
            if (dizim[i] > enbuyuk){
                enbuyuk = dizim[i];
            }
        }
        System.out.println("en buyuk : " + enbuyuk);
        
        
    }
    
}
