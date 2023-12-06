
package letssgooo;

import java.util.Scanner;

public class Metot_6_Fibonacci {
    
    public static void fibo(){
        Scanner girdi1 = new Scanner(System.in);
        int input = girdi1.nextInt();
        int birinciSayi = 0;
        int i;
        int ikinciSayi = 1;
        int ucuncuSayi = 0;
        System.out.print("fibomm : "  + birinciSayi + " " + ikinciSayi + " ");
        for(i = 2; i <=input; i++){
            ucuncuSayi = ikinciSayi + birinciSayi;
            System.out.print(ucuncuSayi + " ");
            birinciSayi = ikinciSayi;
            ikinciSayi = ucuncuSayi;
            
        }
        System.out.print("\ngirdiğin sayının fibodaki sırası : " + ucuncuSayi + "\n");
        
    } 
    
    public static void main (String[]args){
        fibo();
        
        
        
    }
    
}
