/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner in = new Scanner(System.in);
System.out.println("Enter the number of rows which you want in your Floyd Triangle: ");
int r = in.nextInt();
int n=0;
for(int i=0; i<r; i++){
for(int j=0; j<=i; j++){
System.out.print(++n+" ");
}
System.out.println();
	}
}
}