
package letssgooo;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 *                   Java da bir dizideki en büyük sayıyı bulma
 * Dizinin boyutu klavyeden girilsin
 * girilen sayıların hepsini de yazdırsın
 * 
 */
public class Dizi_Ornek_h_5 {
    
    public static void main (String [] args){
        Scanner girdi1 = new Scanner(System.in);
        int Dboyutu,i,sayilar;
        int geciciSayi = 0;
        int enbuyukSayi = 0;
        int x = 0;
        System.out.print("Dizinin boyutunu girin : ");  
        Dboyutu = girdi1.nextInt();
        int [] dizim = new int [Dboyutu];
        for (i = 0; i < dizim.length; i++){
            System.out.print((i+1) + ". sayiyi girin : ");
            sayilar = girdi1.nextInt();
            dizim[i] = sayilar;
            
        }
        
        System.out.println("dizim : " + Arrays.toString(dizim));  
        
        //5 6 7 8 9 
        
        for( i = 0; i < dizim.length; i++){
            if(dizim[i] > enbuyukSayi){
                enbuyukSayi = dizim[i];
                x++;
                
            }
            
        }

        System.out.println("x in değeri : " + x);
        System.out.println("en buyuk sayı :  " + enbuyukSayi);
        



// NOT bunu anlamadığım [i] olanlarda kullan dene    System.out.println(dizim.length);
        
        
    }
    
}
