package javacode;

public class Functionoverloading {
	public void addition(int x,int y) {
		
	int a,b,c;
	a=x;
	b=y;
   c=a+b;
   System.out.println("Addition of two numbers "+c);
	
	}
	public void addition(float x,float y)
	{
		float a,b,c;
		a=x;
		b=y;
		
		c=a+b;
		System.out.println("Addition of three number "+c);
		
	}
	
	public static void main(String args[])
	{
	Functionoverloading F=new Functionoverloading();
	F.addition(34,45);
	F.addition(45.8f,35.8f);

	}
}
