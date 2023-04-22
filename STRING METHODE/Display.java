import java.util.*;
import java.io.*;
  class Display
  {
	  public static void main(String args[])
	  {
		  int i;
		  Scanner sc=new Scanner(System.in);
		  String s=new String();
		  System.out.println("Enter a string=");
		  s=sc.nextLine();
		  int count=s.length();
		  for(i=0;i<count;i++)
		  {
			  System.out.println(s.charAt(i));
		  }
      }
  }
  
		  