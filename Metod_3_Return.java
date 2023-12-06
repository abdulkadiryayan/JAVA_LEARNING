
package letssgooo;


public class Metod_3_Return {
    public static int toplam (int a, int b){
        return a+b;
    }
    public static int carpım (int a, int b){
        return a*b;
    }
    public static int bolme (int a, int b){
        return a/b;
    }
    public static void carpım1 (int a, int b){
        System.out.println("carpımları : " + a*b);
        
    }
    public static void main (String [] args){

        System.out.println("sonuc : " + carpım(10,20));
        System.out.println("sonuc : " + bolme(20,20));
        System.out.println("sonuc . " + bolme(carpım(toplam(10,20),10),2));
        //System.out.println("sonuc : " + bolme(carpım(toplam(10,20))));
        //System.out.println(bolum(carpım(toplam(10,20)));
    }
    
    /**
     * 
     * 
     * ALTTAKİ NİYE HATA VERİYOR      
    public static int toplam (int a){
        return a+10;
    }
    public static int carpım (int a){
        return a*10;
    }
    public static int bolme (int a){
        return a/2;
    }
        
    }
    public static void main (String [] args){

        System.out.println("sonucu : " + (bolme(carpım(toplam(100)))));
        //System.out.println("sonuc : " + carpım(10,20));
        //System.out.println("sonuc : " + bolme(20,10));
        //System.out.println("sonuc : " + bolme(carpım(toplam(10,20))));
        //System.out.println(bolum(carpım(toplam(10,20)));
    */
    
    
    
    
    
    
    
    
    
}
