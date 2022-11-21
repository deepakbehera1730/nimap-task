package javacode;


public class Copyconstructor 
{
	int x,y;
	Copyconstructor()
	{
		x=45;
		y=1728;
	
	}
	Copyconstructor(Copyconstructor ref)
	{
		x=ref.x;
		y=ref.y;
		System.out.println(x);

	}
	
	
	public static void main(String args[])
	{
		Copyconstructor c1=new Copyconstructor();
		Copyconstructor c2=new Copyconstructor(c1);

	}
	
}