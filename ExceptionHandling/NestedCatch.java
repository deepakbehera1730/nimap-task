package ExceptionHandling;

public class NestedCatch {

	public static void main(String[] args) {
		try {
			int x=2;
			int y=0;
			int z=x/y;
		}
		catch(Exception E)
		{
			try {
				String h="345";
				int k=Integer.parseInt(h);
				System.out.println(k);
			}
			catch(Exception e)
			{
				System.out.println(e);
				
			}
			System.out.println(E);
		}

	}

}
