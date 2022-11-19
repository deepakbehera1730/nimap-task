package javacode;

public class Constructoroverload {
	
	Constructoroverload(int x,float y)
	{
		int a,b,c;
		a=x;
		b=(int)y;
		c=a+b;
		System.out.println("addition two number "+c);
		
		
	}
	Constructoroverload(float x,float y,float z)
	{
		float a,b,c,t;
		a=x;
		b=y;
		c=z;
		t=a+b+c;
		
		System.out.println("addition of three float value "+t);
	}
	public static void main(String args[])
	{
		Constructoroverload C=new Constructoroverload(3,5.6f);
		Constructoroverload D=new Constructoroverload(6.7f,567.45f,45.6f);
		
	}
}
