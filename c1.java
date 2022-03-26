
import java.io.*;  // import the package
//Read a single character

public class c1 
{
   
	public static void main(String args[])throws IOException 
	{
      
		Console cio = System.console();
      
		System.out.println("Enter a single char");
      
		int a = System.in.read();
		System.out.println("\t" + (char)a);
   
	}

}	
