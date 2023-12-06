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
public class GirilenSayiyiYazdir {
    public static void main(String[] args) {
        Scanner girdi1 = new Scanner(System.in);
        System.out.println("bir sayı gir : ");
        int sayi1;
        sayi1 = girdi1.nextInt();
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 yi gir");
        int sayi2 = girdi1.nextInt();
        
        System.out.println("sayi2 = " + sayi2);
    }
   
}
