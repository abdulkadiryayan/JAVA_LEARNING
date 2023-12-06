package letssgooo;
// dizideki en büyük sayıyı bulan bir metot yaz.

import java.util.Arrays;
import java.util.Scanner;

/* öncelikle bir metotun içine dizideki en büyük sayıyı bulduracak 
* kodları yazacaksın sonrada main metodun içine de çalıştırma yazılacak.
*/ 
 
public class Metot_cgpt_1 {
    
    public static int DiziEnbuyuk(int [] dizi){
        int enbuyuk = dizi[0];
        for(int i = 0; i < dizi.length; i++){
            if(dizi[i] > enbuyuk){
                enbuyuk = dizi[i];
                
            }
        }
        return enbuyuk;
    }
    
    
    
    public static void main(String[] args ) {

        System.out.print("kaç boyutulu dizi olustuurlsun: ");
        Scanner girdi1 = new Scanner(System.in);
        int diziboyutum = girdi1.nextInt();
        int i;
        
        int [] dizim = new int [diziboyutum];
        for(i = 0; i < dizim.length; i++){
            System.out.print((i+1) + ". sayi : ");
            dizim[i] = girdi1.nextInt();
            
        }        int enbuyuksayim = DiziEnbuyuk(dizim);
        System.out.println(" dizim :  " + Arrays.toString(dizim));
        System.out.println("en büyük sayi dizideki : " + enbuyuksayim);
        
    }
    
    
}
