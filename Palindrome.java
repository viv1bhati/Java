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
	System.out.println("Enter the string which you want to check whether that is palindrome or not: ");
	String a = s.next();
	String b = "";
	int i;
	for(i =a.length()-1;i>=0;i--){
		b = b+a.charAt(i);
	}
	System.out.println("The reverse string of the input is: "+b);
	if(a.equals(b)){
		System.out.println("Given input is a Palindrome");
	}
	else{
		System.out.println("Given input is not a Palindrome");
	}
	
}
}