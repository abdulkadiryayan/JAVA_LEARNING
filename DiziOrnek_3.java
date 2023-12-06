/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letssgooo;

import java.util.Arrays;

/**
 *
 * @author abdul
 */
public class DiziOrnek_3 {
    public static void main (String  [] args ) {
        int [] dizi1 = {1,2,3,4};
        int [] dizi2;
        
        dizi2 = dizi1;
        System.out.println(Arrays.toString(dizi1));
        System.out.println(Arrays.toString(dizi2));
        
        dizi1[0] = 33;
        System.out.println(Arrays.toString(dizi1));
        System.out.println(Arrays.toString(dizi2));
/* NOTTTTTT
         java da  8 adet primitive type var
            byte short int long float double char bloean
       
        Bunlar  harici JAVA 'da  var olan bütün veri tipleri referans type olarak geçer.
        Referans type lerin en önemli özellikleri içinde ki değeri değil
        bellekti oluşturulan değişkenin adresini tutmaktadır.
        Array lar de referans type değişkendir.
        Yukarıdaki örnekteki sadece dizi1 e 0. indisine 33 atamam rağmen 2 array dede
        değer değişti çünkü bellekteki adresi refans alır.  
        
        */
    }
    
}
