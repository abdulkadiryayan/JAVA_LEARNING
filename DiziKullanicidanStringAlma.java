/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letssgooo;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author abdul
 */
public class DiziKullanicidanStringAlma {
    public static void main(String[] args) {
      // kullanıcıdan isim alıp onları diziye atıp sonrada yazdır.
        System.out.println("isim girin : ");
        Scanner girdi = new Scanner(System.in);
        
        String [] isimler = new String[3];
        for(int x = 0; x < isimler.length; x++){
            isimler [x] = girdi.nextLine();
            //System.out.println(isimler[x]);
            
        }
        
        for(int y = 0; y<isimler.length;y++)
        {
            System.out.println("girdiğiniz isimler :  " + isimler[y]);
        }    
        System.out.println("isimlerin dizi içindeki görünüşü : " + Arrays.toString(isimler));

    
    
    
    
    
    
    
    }
    
}
