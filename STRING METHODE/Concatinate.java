import java.util.*;
import java.io.*;
  class Concatinate
  {
	  public static void main(String args[])  
	  {
		 String s=new String();
		 String s1=new String();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter first string=");
		 s=sc.nextLine();
		 System.out.println("Enter Second string=");
		 s1=sc.nextLine();
		 String s2=s.concat(s1);
		 System.out.println("New string="+s2);
	  }
  }
		  