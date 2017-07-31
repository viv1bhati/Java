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
	Scanner in = new Scanner(System.in);
System.out.println("Enter the number whose factorial you want: ");
int n = in.nextInt();
int f =1;
for(int i=n; i>0; i--){
f = f*i;
}
System.out.println("Factorial of "+n+" is "+f);
	}
}