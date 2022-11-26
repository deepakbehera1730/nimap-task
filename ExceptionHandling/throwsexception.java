package ExceptionHandling;

public class throwsexception
{
	
	public  void check() throws ArithmeticException,NullPointerException{
		int a,b,c;
		a=10;
		b=0;
		c=a/b;
		String l=null;
		System.out.println(l.toUpperCase());
	}
	   	 

  public static void main(String args[]) 
  {
	  throwsexception d=new throwsexception();
	  try {
	  d.check();
	  }
   catch(ArithmeticException e)
	  {
	   System.out.println(e);
	  }
	  catch(NullPointerException e)
	  {
	   System.out.println(e);
	  }
    
    
  }
}
