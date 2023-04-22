import java.util.*;
import java.io.*;
  class Substring
  {
	  public static void main(String args[])
	  {
		  int i;
		  Scanner sc=new Scanner(System.in);
		  String s=new String();
		  System.out.println("Enter a string=");
		  s=sc.nextLine();
		  System.out.println("Enter position for substring=");
		  int pos=sc.nextInt();
		  String s1=s.substring(pos);
		  System.out.println("Substring="+s1);
		  
		  
      }
  }
  
		  