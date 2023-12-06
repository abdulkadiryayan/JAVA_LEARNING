/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letssgooo;

/**
 *
 * @author abdul
 */
public class ForDongusu_icice {
    public static void main(String[] args) {
        int y;
        for ( int i = 9; i>=1; i--){
            for(int z = 1; z>=9; z++ ){
                System.out.println(" ");
                for( y = 1; i>=y; y++){
                    System.out.print("*");

                }
            }

            System.out.println("");
        }
    }
    
}
