package javacode;

public class Genericmethod {
public <E> void  getvalue(E []s)
{
	for(E k:s)
	{
		System.out.println(" "+k);
	}
}
public static void main(String args[])
{
	Genericmethod Genericmethod = new Genericmethod();
	Integer p[]= {3,5,6,7,80};
	String g[]= new String[]{"rohit","hello","deepak","sarvesh"};
    Genericmethod.getvalue(p);
    Genericmethod.getvalue(g);
	
	}
}

