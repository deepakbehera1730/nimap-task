package ExceptionHandling;

public class throwk {
      
	
	void divisionint(int a,int b)
	{
		int c ;
		if(b==0)
		{
			throw new ArithmeticException();
		}
		else {
			c=a/b;
			System.out.println("Division of ab:"+c);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throwk t1=new throwk();
		t1.divisionint(9,0);

	}

}
