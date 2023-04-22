import java.util.*;
import java.io.*;
  class Compared
  {
	  public static void main(String args[])
	  {
		  int i;
		  Scanner sc=new Scanner(System.in);
		  String s=new String();
		  String s1=new String();
		  System.out.println("Enter a string=");
		  s=sc.nextLine();
		  System.out.println("Enter second string=");
		  s1=sc.nextLine();
		  if(s.compareTo(s1)==0)
		  {
		  System.out.println("Equal");
          }
          else
		  {
			  System.out.println("not equal");
		  }
      }
  }
  
		  