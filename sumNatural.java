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
	 int x;
	 int i = 1 ;
        int sum = 0;
        System.out.println("Enter Number of items :");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        while(i <= x)
        {
            sum = sum +i;
            i++;
        }
        System.out.println("Sum of "+x+" numbers is :"+sum);
	}
}