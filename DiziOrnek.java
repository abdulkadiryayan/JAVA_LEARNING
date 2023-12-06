/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letssgooo;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author abdul
 */
public class DiziOrnek {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int toplam = 0;
        int girilenSayi = 0;
        System.out.println("döngü boyutunu gir : ");
        int dboyutu = girdi.nextInt();
        int [] sayilar = new int [dboyutu];
        for(int i = 0; i< sayilar.length;i++){
            
            System.out.print("bir sayi girin: ");
            girilenSayi = girdi.nextInt();

            sayilar[i] = girilenSayi;
            System.out.println(i + ". indisteki sayı : " + sayilar[i]);
            toplam += girilenSayi;
            
        }
        
        System.out.println("girilen sayıların toplamı = " + toplam);
        System.out.println("girilen sayıların ortalaması = " + (toplam / 2));
        System.out.println("dizinin tamamı : " + Arrays.toString(sayilar));
    
    }


    
}
