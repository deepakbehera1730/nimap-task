package ExceptionHandling;

public class Nestedtry {
public static void main(String args[])
{
	try {
		int i=4;
		int y=2;
		int c=i/y;
		try {
			String k ="Ankit";
			int h=Integer.parseInt(k);
		}
		catch(Exception E)
		{
			System.out.println(E);
		}
	}
	catch(Exception E)
	{
		System.out.println(E);
	}
	
}
}
