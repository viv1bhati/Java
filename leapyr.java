/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Year: ");
	int a = s.nextInt();
	
    
    if(a%4==0)
    {
        System.out.println(a+" is a leap year. ");
       
    }
   
    else 
         System.out.println(a+" is not a leap year. ");
    
	}
}