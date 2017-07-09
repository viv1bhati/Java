/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guvi;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class PostiveNegative {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter the Number: ");
       int x = s.nextInt();
       if(x>0)
       {
        System.out.println(x+" is a positve number");
        
    }
       else if(x<0)
       {
           System.out.println(x+" is a negative number");
       }
       else
           System.out.println(x+" is zero,neither positive nor negative");
}
}