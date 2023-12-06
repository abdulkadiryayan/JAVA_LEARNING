/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letssgooo;


public class Metod_2_Parametre {
    
    public static void yazisma(String yazi){
        System.out.println("hello " + yazi);
    }

    public static void toplam(int a, int b, int c){
        System.out.println("toplamları = " + (a+b+c));
        
    }
    public static void carpım(int a, int b ){
        int carpma = a*b;
        System.out.println("a * b = " + carpma);
    }
    public static void main(String [] args){
        toplam(3,4,5);
        toplam(5,4,1);
        yazisma("xxx");
        carpım(3,5);
    }
}
