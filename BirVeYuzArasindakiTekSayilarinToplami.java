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
public class BirVeYuzArasindakiTekSayilarinToplami {
    public static void main (String [] args){
       // pardon çarpımıymış 
        int toplam = 0;
        int x;
        for (x = 1; x < 100;x++){
            if( x % 2 == 1){
                toplam += x;
                System.out.println(toplam);
            }
        }
       // System.out.println("tek sayların toplamı : " + toplam);
    }
}
    
