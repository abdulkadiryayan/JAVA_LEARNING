
package letssgooo;

import java.util.Scanner;

/**
 * kullanıcı giriş yap  
 * kullanıcı adı ve şifre isteyecek yanlıssa eğer yanlıssa girilen
 * herhangi bir değer yanlısı bize söyleyecek.
 * 
 * kullanıcı girişi olacak bu burda kalsın bunu veri yapıları 2. hafta ödevindeki
 * gibi while içinde switch case li yap sonra içinden dönsün giriş yapıp.
 * 
 * @author abdul
 */

public class KullaniciGirisi {
    public static void main (String []args){
        String kullanici_adi = "CroSe-";
        String kullanici_sifre = "8374423Aa";
        Scanner girdi1 = new Scanner(System.in);
        System.out.print("kullanıcı adı : ");
        String kul_adi = girdi1.nextLine();
        System.out.print("sifre : ");
        String kul_sifre = girdi1.nextLine();
        
        
        if ((kul_adi == kullanici_adi) && (kul_sifre == kullanici_sifre)){
            System.out.println("doğru girdiniz");
            
        } 
        //else in içine == mi yoksa != bu mu yoksa sadece ! bumu araştır
        // üstteki if blogunun içine nasıl yapıcaz eşit değilseyi.
        else if (!(kul_adi == kullanici_adi) && (kul_sifre == kullanici_sifre)){
            System.out.println("sdfdsf");
        }
        else 
            System.out.println("ikisini de yanlış girdiniz.");
       
        
    }
    
}
