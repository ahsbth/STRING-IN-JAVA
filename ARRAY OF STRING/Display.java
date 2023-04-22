import java.io.*;
import java.util.*;
  class Display
  {
	  public static void main(String args[]) throws IOException
	  {
		  int i;
		  String s[]=new String[5];
		  InputStreamReader isr=new InputStreamReader(System.in);
		  BufferedReader br=new BufferedReader(isr);
		  System.out.println("Enter 5 city names=");
		  for(i=0;i<5;i++)
		  {
			  s[i]=br.readLine();
		  }
		  System.out.println("five City names are=");
		  for(i=0;i<5;i++)
		  {
			  System.out.print(s[i]+"\t");
		  }
	  }
  }
  