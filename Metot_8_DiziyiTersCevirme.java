
package letssgooo;

import java.util.Arrays;

/**
 * verilen bir diziyi tersten yazdıran metot
 * @author abdul
 */
public class Metot_8_DiziyiTersCevirme {
    public static void metotDizim(){
        int [] dizim = {1,2,3,4,5};
        int i=0;
        for(i = 4; i >= 0; i--){
            System.out.println(dizim[i]);


        }
    }
    public static void main(String[] args) {
        metotDizim();
        
    }
    
}
