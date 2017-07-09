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
public class Guvi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[] num = new int[3];
  
    num[0] = 8;
    num[1] = 9;
    num[2] = 1;
    int l = num[0];
    if(num[1]<num[0])
    {
        System.out.println("Largest no. is "+num[0]);
       
    }
    else if(num[2]>num[1])
    {
        System.out.println("Largest no. is "+num[2]);
    }
    else 
         System.out.println("Largest no. is: "+num[1]);
    }
    
    
}
