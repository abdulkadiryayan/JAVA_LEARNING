/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letssgooo;

/**
 *
 * @author abdul
 */
public class Metot_5_Overloading_v2 {
    public static void isimler(String isim, int sayi){
        System.out.println(isim + " adındaki cocugun yası : " + sayi);
        
    }
    
    public static void isimler(String isim){
        System.out.println(isim + "in puanı 10" );
        
    }
    public static void isimler(int sayi ){
        System.out.println("x puanı " + sayi);
        
    } 
    
    public static void main (String [] args){
        isimler("x", 12);
        isimler("x");
        isimler(20);
        
        
        
    }
}
