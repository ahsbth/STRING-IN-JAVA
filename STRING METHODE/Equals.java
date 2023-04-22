import java.util.*;
import java.io.*;
  class Equals
  {
	  public static void main(String args[]) throws IOException
	  {
		  String s=new String();
		  String s1=new String();
		  InputStreamReader isr=new InputStreamReader(System.in);
		  BufferedReader br=new BufferedReader(isr);
		  System.out.println("Enter First string=");
		  s=br.readLine();
		  System.out.println("Enter second string=");
		  s1=br.readLine();
		  if(s.equals(s1))
		  {
		  System.out.println("both are equals");
		  }
		  else
		  {
			  System.out.println("both are not equals");
		  }
	  }
  }
		  