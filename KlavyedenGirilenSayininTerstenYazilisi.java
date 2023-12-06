
package letssgooo;

import java.util.Scanner;

/**
 *
 * @author abdul
 */
public class KlavyedenGirilenSayininTerstenYazilisi {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        
        System.out.print("Girdiğiniz sayinin tersten yazılısı = ");
        while(sayi > 0) {
            
            System.out.print(sayi % 10);
            sayi /= 10;
        }
        
        if (sayi > 0){
            System.out.print(sayi % 10);
            sayi /= 10;
        }
        System.out.println("");
        
    } 
}
/* Scanner girdi = new Scanner(System.in);
        System.out.println("bir sayi gir ");
        int sayi = girdi.nextInt();
        int basamak = 0;
        while (sayi > 0){
        
            basamak = (sayi % 10);
            sayi = sayi / 10;
                    System.out.print(basamak);

        }
        
                            System.out.println("");
       */
