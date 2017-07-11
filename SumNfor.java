/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int x;
        int sum = 0;
        System.out.println("Enter N :");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        for(i=0;i<=x;i++)
        {
            sum = sum +i;
            
        }
        System.out.println("Sum of "+x+" numbers is :"+sum);
	}
}