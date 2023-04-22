import java.io.*;
import java.util.*;
   class Charat
   {
	   public static void main(String args[]) throws IOException
	   {
		   String s=new String();
		   InputStreamReader isr=new InputStreamReader(System.in);
		   BufferedReader br=new BufferedReader(isr);
		   System.out.println("Enter a string value=");
		   s=br.readLine();
		   System.out.println("Enter index for display a charecter=");
		   int n=Integer.parseInt(br.readLine());
		   char k=s.charAt(n);
		   System.out.println("Channge="+k);
	   }
   }
   