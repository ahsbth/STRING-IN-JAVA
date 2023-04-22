import java.io.*;
import java.util.*;
  class Name
  {
	  public static void main(String args[]) throws IOException
	  {
		  String s=new String();
		InputStreamReader dis=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(dis);
		  System.out.println("Enter your name=");
		s=br.readLine();
		  System.out.println("string="+s);
	  }
  }
  