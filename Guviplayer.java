/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guviplayer;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Guviplayer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Scanner s= new Scanner(System.in);
        System.out.println("Enter a Character: ");
        String d = s.next();
        System.out.println(d.length()); */
       String address1 = "Mr.Jack,Door No.21,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113";
       String address2 = "Mr.Jill,Door No.53,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113";
       String address3 = "Mr.Holmes,Door No.13,Valmiki Street,3rd Main Road,Saidapet,Chennai,Pin-600115";
       String address4 = "Mr.Davinci,Door No.21,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113";
       
       String name1 = address1.substring(0,7);
       String name2 = address2.substring(0,7);
       String name3 = address3.substring(0,9);
       String name4 = address4.substring(0,10);
       
     System.out.println(name1);
       System.out.println(name2);
       System.out.println(name3);
       System.out.println(name4);
       
       String add1 = address1.substring(8);
       String add2 = address2.substring(8);
       String add3 = address3.substring(10);
       String add4 = address4.substring(11);
       
         System.out.println(add1);
       System.out.println(add2);
       System.out.println(add3);
       System.out.println(add4);
       
       System.out.println(address1.contains("Pin"));
       System.out.println(address2.contains("Pin"));
       System.out.println(address3.contains("Pin"));
       System.out.println(address4.contains("Pin"));
       
    }
    
}
