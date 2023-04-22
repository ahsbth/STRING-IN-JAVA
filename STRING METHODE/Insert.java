import java.io.*;
import java.util.*;
  class Insert
  {
	  public static void main(String args[]) throws IOException
	  {
		  InputStreamReader isr=new InputStreamReader(System.in);
		  BufferedReader br=new BufferedReader(isr);
		  String s=new String();
		  System.out.println("Enter a string=");
		  s=br.readLine();
		  StringBuffer sb=new StringBuffer(s);
		  System.out.println("Enter a string and their position for insert=");
		  String s1=new String();
		  s1=br.readLine();
		  int pos=Integer.parseInt(br.readLine());
		  System.out.println("String="+sb.insert(pos,s1));
	  }
  }
  