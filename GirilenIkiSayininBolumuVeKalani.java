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
public class GirilenIkiSayininBolumuVeKalani {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("bölmek istediginiz büyük sayiyi girin");
        int bölSayi = girdi.nextInt();
        System.out.println("kücük sayıyı gir");
        int kSayi = girdi.nextInt();
        
        System.out.println("sayının bölümü : " + bölSayi/kSayi + "\nkalanı : " + bölSayi % kSayi); 
       
    }
    
}
