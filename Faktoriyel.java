/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letssgooo;

import java.util.Scanner;

/**
 *
 * @author abdul
 */
public class Faktoriyel {
    public static void main(String[] args) {
        Scanner girdi1 = new Scanner(System.in);
        int girdi = girdi1.nextInt();
        
        int carpım = 1;
        for (int x = 1; x<= girdi; x++ ){
            carpım *=x;
        }
        System.out.println(carpım);
    }
    
}
