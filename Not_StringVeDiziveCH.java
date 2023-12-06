 
package letssgooo;

import java.util.Arrays;

/**
 * buraya calıs biraz 
 * char dizisi olusturduk ve diziyi string gibi yazdırdık birleştirdik
 * tüm dizi çıktısını da en altta verdim.
 * 
 * burada java string veri tanımlaması yapmış olduk.
 * @author abdul
 */
/*
        

        
        */

 
public class Not_StringVeDiziveCH {
    public static void main (String [] args) {
        
        char[] chars = {'M','e','r','h','a','b','a'};
        String stringDeger = new String(chars);
        System.out.println(stringDeger);
        System.out.println("dizi : " + Arrays.toString(chars));
        String ben = new String ("abdulkadir yayan"); 
        String hlm = "crose";
        
        
        //BÖYLE DE STRİNG TANIMLANABİLİR
        String stringDeger_v2 = new String("XXXXX");
        
        // STRİNG DEN karakter çekme
        char Stringim = ben.charAt(6);
        System.out.println("string: " + ben.charAt(0));      
        
        //Substring kullanımı
        String subStringim = ben.substring(6);
        System.out.println("subs string i  benin : " + subStringim);
        
        //Substring örnek 2 kullanımı : 
        String subStringim1 = ben.substring(5, 12);
        System.out.println("subs 2. örnek : " + subStringim1);
        
        /*Java String toUpperCase() ve toLowerCase() methodları
         metotları sayesinde tüm harfler büyük yada küçük yazdırılabilir. */
        System.out.println("upper : " + ben.toUpperCase());
        System.out.println("lower : " + ben.toLowerCase());

        /*Java  String replace() metodu ile metin içindeki istediğimiz bir karakteri 
        başka bir karakter ile değiştirebiliriz */
        System.out.println("a harfi olan her yere y yaz : " + ben.replace("a", "y"));
        System.out.println("adımı değiş : " + ben.replace("abdulkadir", "crose"));
        
        /**
         * Javada 2 metni kıyaslamak için equals yada equalsIgnoreCase metodu kullanılır.
         * equalsIgnoreCase metodu karşılaştırılan metini ilk önce küçük harflere çevirir
         * ve ardından karşılaştırma yapar. Böylece büyük kücük harf durumundan
         * dogacak sıkıntının önüne geçer.
         *  
         */
        // equals
        boolean state1 = hlm.equals(ben);
        System.out.println("eşit mi  : " + state1); //doğru calısıyor false veriyor.
        
        boolean durum = ben.equals("abdulkadir yayan");
        System.out.println("durumu nedir : " + durum);
        
        boolean state2 = hlm.equalsIgnoreCase("erdem");
        System.out.println("doru mu : " + state2 );
        
        // == ve equals ile karşılaştırma
        String s1 = "Merhaba";
        String s2 = new String("merhaba");
        System.out.println(" 2 eşittir ile : " + s1 == s2);
        System.out.println("equals ile : " + s1.equals(s2));
        
        
    }
}
