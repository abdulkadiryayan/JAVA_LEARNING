/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letssgooo;

import java.util.Scanner;

/**
 *
 * @author abdul
 */
public class KullanicininGirdigiSayiKontrolEtme {
    public static void main(String[] args) {
        
        Scanner girdi = new Scanner(System.in);
        System.out.println("Bir sayı girin : ");
        int girdi1 = girdi.nextInt();
        if(girdi1 > 0){
            System.out.println("sayı pozitif");
            
        }
        else if (girdi1 < 0){
            System.out.println("sayi negatif");
        }
        else
            System.out.println("sayı sıfırdır");
        
    }
    
}
