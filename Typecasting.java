package javacode;

public class Typecasting {
	public static void main(String args[])
	{
		// implicit casting
		double i=1+4.9;
		float k=2+7.8f;
		double r=4.89886+5.67f;
		System.out.println("integer to double:"+i);
		System.out.println("integer to float:"+k);
		System.out.println("float to double:"+r);
		// 
		//explicit casting
		int f=(int)4.8f+3;
		float t=(float)6.89866+3.5f;
		String g="7";
		int jk=Integer.parseInt(g);
		System.out.println("float to integer:"+f);
		System.out.println("double  to float:"+t);
		System.out.println("String to integer:"+jk);
		
		
	}

}
