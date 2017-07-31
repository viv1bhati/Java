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
System.out.println("Enter a number which you want to check whether that is armstrong or not: ");
int n = in.nextInt();
int a = n, r=0, s=0;
 
while(a!=0){
r = a%10;
s=s+(r*r*r);
a=a/10;

}
if(s==n){
System.out.println("Number "+n+" is an armstrong number.");
}else{
System.out.println("Number "+n+" is not an armstrong number.");
}

	}
}