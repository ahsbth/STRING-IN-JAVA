import java.io.*;
import java.util.*;
  class Count
  {
	  public static void main(String args[]) throws IOException
	  {
		  int i,count,vc=0,cc=0;
		  String s=new String();
		  InputStreamReader isr=new InputStreamReader(System.in);
		  BufferedReader br=new BufferedReader(isr);
		  System.out.println("Enter a string=");
		  s=br.readLine();
		  count=s.length();
		  for(i=0;i<count;i++)
		  {
			   char k=s.charAt(i);
	           if(k=='a'||k=='e'||k=='i'||k=='o'||k=='u')
			   {
				   vc++;
			   }
			   else
			   {
				   cc++;
			   }
		  }
		  System.out.println("No of vowels="+vc+"\nConsonants="+cc);
	  }
  }
  