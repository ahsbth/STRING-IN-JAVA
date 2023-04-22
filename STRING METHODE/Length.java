import java.util.*;
import java.io.*;
  class Length
  {
	  public static void main(String args[]) throws IOException
	  {
		  String s=new String();
		  InputStreamReader isr=new InputStreamReader(System.in);
		  BufferedReader br=new BufferedReader(isr);
		  System.out.println("Enter a string=");
		  s=br.readLine();
		  int n=s.length();
		  System.out.println("Length of string="+n);
	  }
  }
		  