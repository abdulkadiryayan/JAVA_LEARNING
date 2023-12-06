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
 * KLAVYEDEN GİRİLEN 5 SAYIYI DİZİYE ATIP SIONRADA TEK LERİ AYRI CİFTLERİ AYRI TOPLAR
 */
public class Dizi_Ornek_h_3 {
    public static void main (String [] args){
        int [] dizim = new int [5];
        System.out.print("5 adet sayı girin : ");
        Scanner girdi1 = new Scanner(System.in);
        int i,sayi;
        int toplamT = 0;
        int toplamC = 0;
        for(i = 0; i < dizim.length; i++){
            sayi = girdi1.nextInt();
            dizim[i] = sayi;
            System.out.print("");
            
        }
        
        for (i = 0; i < 5; i++){
            if (dizim[i] % 2 == 0){
                toplamC += dizim[i];
            }
        }
        for (i = 0; i < 5; i++){
            if(dizim[i] % 2 ==1){
                toplamT += dizim[i];
            }
            
        }
        
        System.out.println("dizim : " + Arrays.toString(dizim));
        System.out.println("Cift Sayilar : " + toplamC);
        System.out.println("Tek Sayilar : " + toplamT);
    }
    
}
