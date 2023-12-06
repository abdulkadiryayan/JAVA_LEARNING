 
package letssgooo;
 
public class Metod_4_Overloading {
    public static void toplam (int a, int b, int c ){
        
        System.out.println(" toplam :  " + (a+b+c));
    }
    public static void toplam (int a, int b){
        System.out.println("a+b nin toplamı :  " + (a+b));
    }
    public static void toplam (int c){
        System.out.println("b+c nin toplam : " + (c));

    }
    public static void main (String [] args){
        toplam(3,4,5);
        toplam(3,4);
        toplam(5);
        
        
        
    }
    
}
