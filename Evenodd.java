/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenodd;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Evenodd {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter The Number: ");
       int x = s.nextInt();
       if(x%2==0){
             System.out.println("Even Number");
       }
       else 
             System.out.println("Odd Number");
    }
    
}
