package Lamda;

interface first{
	double get();
}
public class Lambda {
 public static void main(String args[])
 {
	 first lambda;
	 lambda= () -> 21.4;
	 System.out.println("Double value : "+lambda.get());
	 lambda=()->21.4*3.14;
	 System.out.println("multiple value :"+lambda.get());
	 
 }
}
