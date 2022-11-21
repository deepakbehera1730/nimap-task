package javacode;

class building{
	public void box()
	{
		System.out.println("i am in a base class");
	}
}
class secondbuilding extends building{
	public void box()
	{
		System.out.println("i am in a sub class");
	}
}
public class Functionoveriding {
	public static void main(String args[])
	{
	building b1 =new secondbuilding();
	b1.box();

}
}
