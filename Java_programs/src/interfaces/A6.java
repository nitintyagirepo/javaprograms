package interfaces;

public class A6 implements printable {

	public void print()
	{
		System.out.println("Hello");
	}  
	  
	public static void main(String args[])
	{  
	
		printable obj = new A6();  
		obj.print();  
	 
	}  
}
