package ExceptionHandling;

public class Multipletrycatch {
	public static void main(String args[])
	{
		try {
			int x,y,z;
			x=9;
			y=0;
			z=x/y;
			System.out.println("this is first try cach block");
		}
		catch(ArithmeticException E) {
			System.out.println(E);
		}
		try {
			int x[]= {3,6,8,9};
			System.out.println(x[7]);
		}
		catch(Exception E)
		{
			System.out.println(E);
		}
	}

}
