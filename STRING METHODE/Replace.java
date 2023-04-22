import java.util.*;
import java.io.*;
   class Replace
   {
	   public static void main(String args[])
	   {
		   String s=new String();
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enetr a string=");
		   s=sc.nextLine();
		   System.out.println("Enter reaplace and replace with charecter=");
		   char x=sc.nextLine().charAt(0);
		   char y=sc.nextLine().charAt(0);
		   String s1=s.replace(x,y);
		   
		  
		   System.out.println(s1);
	   }
   }
   