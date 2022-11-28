package Lamda;

interface functional{
	int get(int x,int y);
}
public class Parameterizedlamda {
public static void main(String args[])
{
	functional function;
	function=(x,y)->x-y;
	System.out.println("substract :"+function.get(45, 23));
	function=(x,y)->x/y;
	System.out.println("division:"+function.get(23,2));
}
}
