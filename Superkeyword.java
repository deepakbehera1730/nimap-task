package javacode;




class c1{
    int a,b;
	c1(int x ,int y)
	{
		a=x;
		b=y;
		System.out.println("this is the parents class"+x+y);
	}
}

class c2 extends  c1{
	int a=34;
	int b=90;
	c2() 
	{
	super(30,80);
	System.out.println("hello"+super.a);
		
		
	}
	
}

public class Superkeyword {
	public static void main(String args[])
	{
		c2 C=new c2();

	}
	
}