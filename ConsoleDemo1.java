
import java.io.*;  // import the package


public class ConsoleDemo1 
{
   
	public static void main(String args[]) 
	{
      
		Console cio = System.console();
      
		System.out.println("Enter 2 Number");
      
		int a = Integer.parseInt(cio.readLine());
		int b = Integer.parseInt(cio.readLine());
		int c=a+b;
		System.out.println("add" + c);
   
	}

}	