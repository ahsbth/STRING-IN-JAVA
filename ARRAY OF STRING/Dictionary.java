import java.io.*;

  class Dictionary
  {
	  public static void main(String args[]) throws IOException
	  {
		  int i,j;
		  String temp=null;
		  String s[]=new String[5];
		  InputStreamReader isr=new InputStreamReader(System.in);
		  BufferedReader br=new BufferedReader(isr);
		  System.out.println("Enter 5 city names=");
		  for(i=0;i<5;i++)
		  {
			  s[i]=br.readLine();
		  }
		  for(i=0;i<5;i++)
		  {
			  for(j=i+1;j<5;j++)
			  {
				  if((s[j].compareTo(s[i])<0))
				  {
					  temp=s[i];
					  s[i]=s[j];
					  s[j]=temp;
				  }
			  }
		  }
		  
		  System.out.println("five City names as Dictionaar orderd=");
		  for(i=0;i<5;i++)
		  {
			  System.out.print(s[i]+"\t");
		  }
	  }
  }
  