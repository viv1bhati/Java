/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class person
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter member's name : ");
		String name = s.next();
		String names[] = new String[5];
		for(int i =0;i<=5;i++){
		System.out.println("Member No."+(i+1)+" is "+names[i]);
		}
	}
}