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
		String x;
        
        System.out.println("Enter Number :");
        Scanner s = new Scanner(System.in);
        x = s.next();
        int a = x.length();
        System.out.println("Lenght of "+x+" is "+a);
	}
}