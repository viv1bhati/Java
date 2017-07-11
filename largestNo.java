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
	System.out.println("Enter the first Number: ");
	int a = s.nextInt();
	System.out.println("Enter the second Number: ");
	int b = s.nextInt();
	System.out.println("Enter the third Number: ");
	int c = s.nextInt();
    
    if(b<a)
    {
        System.out.println("Largest no. is "+a);
       
    }
    else if(c>b)
    {
        System.out.println("Largest no. is "+c);
    }
    else 
         System.out.println("Largest no. is: "+b);
    
	}
}