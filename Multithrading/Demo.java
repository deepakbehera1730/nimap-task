package Multithrading;
import java.lang.Thread;

class Threaddemo extends Thread{
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}

public class Demo  {
public static void main(String args[]) {
	Thread d1=new Threaddemo();
	Thread d2=new Threaddemo();
	d1.start();
	d2.start();
}
}
