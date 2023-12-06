 
package letssgooo;

import java.util.Arrays;

 
public class CokBoyutluDiziOrnek_1 {
    public static void main (String [] args) {
        
        int cdizim [][];
        cdizim = new int [2][3];
        cdizim[0][0] = 1;
        cdizim[0][1] = 2;
        cdizim[0][2] = 9;
        
        cdizim[1][0] = 3;
        cdizim[1][1] = 4;
        cdizim[1][2] = 9;
        
       // System.out.println("dizim : \n"  + Arrays.toString(cdizim));
       int i; 
       int x;
       for ( i = 0; i<2; i++ ){
            for( x = 0; x < 3; x++){
                System.out.println(cdizim[i][x]);
                        //System.out.println("x" + cdizim[i].length);

            }
        }
        System.out.println(Arrays.toString(cdizim));
        
    }
    
}
