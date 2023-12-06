
package letssgooo;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * kullanıcıdna girilen sayılarla dizi olustur ve 
 * dizinin en büyük 2. sayısını ekrana yazdır.
 */
public class Dizi_Ornek_h_6 {
    public static void main (String []args) {
        Scanner girdi1 = new Scanner(System.in);
        System.out.print("oluşturmak istediğin dizinin boyutunu gir: ");
        int dboyutu = girdi1.nextInt();
        int i,girilensayi;
        int enbuyuksayi = 0;
        int [] dizim = new int[dboyutu];
        int [] eb = new int[dboyutu] ;
        int x = 0;
        int enbuyuk2 = 0;
        
        for(i = 0; i < dizim.length; i++){
            System.out.print((i+1) + ". sayı : ");
            girilensayi = girdi1.nextInt();
            dizim[i] = girilensayi;
         // dizim[i] = girdi1.nextInt(); //Bu şekildede atama yapılabilir.
        }
        System.out.println("dizimin elemanları : " + Arrays.toString(dizim));
        
        
        for(i = 0; i < dizim.length; i++){
            if(dizim[i] > enbuyuksayi)
                enbuyuksayi = dizim[i];
                //eb[i] = enbuyuksayi;
                
        }
        System.out.println("en buyuk sayi : " + enbuyuksayi);
        
        //System.out.println("eb dizisi " + Arrays.toString(eb));
        //5System.out.println("\n**********************\n");
        //System.out.println("Dizinin 2. en büyük elamanı : " + eb[dboyutu-2]);
        
        //System.out.println("dboyutu2 nun değeri : " + eb.length);
        
        
        // sorunun çözümündeki stil ise şöyle
        for(i = 0; i < dizim.length; i++){
            if(enbuyuksayi > dizim[i] && dizim[i] >= enbuyuk2 ){
                enbuyuk2 = dizim[i];
                
            }
        }
        System.out.println("en buyuk 2. sayıııııııııııı : " + enbuyuk2); 
        
        

        
        /* bu cozum dogru ama tek sıkıntısı su  en büyük sayıdan 2 tane girince
           2 tane en buyuk sayı cıktısı aldıgım için 2. sayı oto olarak en büyük sayı
        oluyor.
        */
        
        
    }
    
}
