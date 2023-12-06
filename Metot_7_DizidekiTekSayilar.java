
package letssgooo;

/**
 * verilen bir dizideki tek sayıları bulupe ekrana yazdıran metodu yaz.
 * 
 * @author abdul
 */

public class Metot_7_DizidekiTekSayilar {
    public static void dizimetodu(){
        int [] dizim = {1,2,3,4,5,6,7,8,9};
        int i;
        for(i = 0; i < dizim.length; i++){
            if (dizim[i] % 2 ==1){
                System.out.println(dizim[i]);
            }
        }
    }
    public static void main (String[] args) {
        dizimetodu();
    }
    
}
