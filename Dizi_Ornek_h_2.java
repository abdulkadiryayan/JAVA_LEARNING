
package letssgooo;

import java.util.Scanner;
import java.util.Arrays;

/*klavyeden girilen 5 sayıyı diziye atayıp tek ve cifltier cıkart  */
// NOT :.: 43 VE 49. SATIRDAKİ LN İ ÖNCE YAZMA MUHABBETİNE BAK

public class Dizi_Ornek_h_2 {
   public static void main (String [] args){
        int [] dizim = new int [5];
        System.out.println("5 tane sayı girin : ");
        Scanner girdi1 = new Scanner(System.in);
      //  int [] TekDizim = new int [3];
       // int [] CiftDizim = new int [22];
        int toplam = 0;
        int i;
        int n = 0;
        int m = 0;
        int sayi = 0;
        for(i = 0; i < dizim.length; i++){ 
            System.out.print((i+1) + ". sayı : ");
            sayi = girdi1.nextInt();
            
            dizim[i] = sayi;
            toplam = sayi + toplam;
           
           
           /* if (sayi % 2 == 1){
               TekDizim[n] = sayi;
               n = n+1;

            }
            else 
                CiftDizim[m] = sayi;
                m = m + 1;
           */
            }
        System.out.println("dizimin tamamı : " + Arrays.toString(dizim));
        System.out.println("dizimdeki sayıların toplamı : " + toplam);
        System.out.println("\n********************************** \n ");
        System.out.print("\nÇift Sayilar ");
        for (i = 0; i < 5; i++){
            if (dizim[i] % 2 == 0){
                System.out.print(" " + dizim[i]);
            }
        }
        System.out.print("\nTek sayılar ");
        for(i=0; i < 5; i++){
            if (dizim[i] % 2 != 0 ){
                System.out.print(" " + dizim[i]);
            }
        }
        System.out.println("");
       // System.out.println("TEK DİZİMMMM : " + Arrays.toString(TekDizim));
        
        
      /*  for (int y = 0; y < TekDizim.length; y++){
            System.out.print("dizideki tek sayılar " + TekDizim[n]);
        }  
        for (int z = 0; z < CiftDizim.length; z++){
            System.out.print("dizideki cift sayılar " + CiftDizim[m]);
        }   */
        /* sanal makine kur içine docker kur içine de docker kur 
        
        google cloud içinden bir tane sanal makine kur 
                içine  */
   }
           
}
   
