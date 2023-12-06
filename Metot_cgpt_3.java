
package letssgooo;

/**
 * 
 * Soru 9: İki diziyi birleştiren ve birleşik diziyi döndüren bir metot yazın.
 */
import java.util.Arrays;
import java.util.Scanner;

// NOTTT:    DİZİLERİ MAİN DE TANIMLA DİZİ BİRLEŞTİRMEYİ DE METOTTA YAZAN ŞEKLİNİ DE YAP BUNUN.
// HATAYI DA ARAŞTIR.

public class Metot_cgpt_3 {
    public static void ikiDizim(){
        Scanner girdi1 = new Scanner(System.in);
        int i,x,y = 0;
        System.out.println("1. dizinin boyutu :");
        int diziBoyutu = girdi1.nextInt();
        int [] dizim = new int [diziBoyutu];
        for(i = 0; i < dizim.length; i++){
            System.out.print((i+1) + ". elemanı: ");
            dizim[i] = girdi1.nextInt();
        }
        y = diziBoyutu;
        System.out.println("2. dizinin boyutu : ");
        int diziBoyutu2 = girdi1.nextInt();
        int [] dizim2 = new int [diziBoyutu2];
        for(i = 0; i < dizim2.length; i++){
            System.out.print((i+1) + ". elemanı: ");
            dizim2[i] = girdi1.nextInt();
        }
        
        System.out.println("1. dizinin elemanları : " + Arrays.toString(dizim));
        System.out.println("2. dizinin elemanları : " + Arrays.toString(dizim2));
        int diziboyutu3 = 0;
        diziboyutu3 = diziBoyutu + diziBoyutu2;
        int [] birlesmisDizim = new int [diziboyutu3];
        System.out.println("diziboyutu3 : " + diziboyutu3);
        
        
        for(i = 0; i < birlesmisDizim.length; i++){
            if(i < dizim.length){
                birlesmisDizim[i] = dizim[i];
                
            }
            else{
                birlesmisDizim[i] = dizim2[i-dizim.length];
            }
                
        }   
            
        // bu aptal yer de sıkıntı var ya 1. döngüyü atmaada sıkıntı var
        /* BU ARALIKTAKİ KODUN 2. FOR DÖNGÜSÜ ÇALIŞMIYOR ONA BAK DÜZELTMEYE ÇALIŞ.!! */
  /*      for(i = 0; i < dizim.length; i++){
            System.out.println("1. dizinin atamaya basladıgı yer  " + Arrays.toString(birlesmisDizim));
            birlesmisDizim[i] = dizim[i];
        }
        System.out.println("*******************************");
        for(i = 0; i <= birlesmisDizim.length; i++){
            birlesmisDizim[y-1] = dizim2[i];
            System.out.println("birlesmis dizim : " + Arrays.toString(birlesmisDizim));
                y++;

        } */
       /* iç içe de yazdırmaya çalış.
        for(i = dizim.length; i < birlesmisDizim.length; i++){
            for(x = 0; x < dizim.length; x++){
                birlesmisDizim[x] = dizim[x];
                
                
            }
                        birlesmisDizim[i] = dizim2[i];

        } */
        System.out.println("birlesmis dizim : " + Arrays.toString(birlesmisDizim));
        

        
        
    }
    public static void main (String []args){
        ikiDizim();
        
        
        
    }
    
}
