/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
String s1="welcome to split world";  
System.out.println("returning words:");  
for(String w:s1.split("\\s",0)){  
System.out.println(w);  
}  
System.out.println("returning words:");  
for(String w:s1.split("\\s",1)){  
System.out.println(w);  
}  
System.out.println("returning words:");  
for(String w:s1.split("\\s",2)){  
System.out.println(w);  
}  
}
}