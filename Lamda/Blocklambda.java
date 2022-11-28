package Lamda;
interface Functional{
	int output(int x);
}

public class Blocklambda {

	public static void main(String args[])
	{
		Functional reverse;
		reverse=(x)->{
			int rev=0; 
			int rem;
			while(x>0)
			{
			rem=x%10;
			rev=rev*10+rem;
			x=x/10;
			
			}
			return(rev);
		};
		System.out.println("Reverse of number:"+reverse.output(456));
		System.out.println("Revsrse of  second number"+reverse.output(987));
	}		
}