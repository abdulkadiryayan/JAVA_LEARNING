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
public class Metod_1_Faktoriyel {
    
    public static void faktoriyel(){
    Scanner  girdi1 = new Scanner(System.in);
    System.out.println("sayı :  ");
    int faktoriyel = 1;
    int sayi = girdi1.nextInt();
    
    while (sayi > 1){
        faktoriyel *= sayi;
        sayi--;
        
    }
    System.out.println(faktoriyel);
    }
    
    
    
    public static void main(String[] args) {

        faktoriyel();

        
    }

    
    
    
    

    
}
