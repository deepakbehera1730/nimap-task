package Multithrading;

class read extends Thread{
	
	public void run()
	{
		for(int i=0;i<=8;i++)
		{
			try
			{
				System.out.println(""+i);
				Thread.sleep(1000);
			}
			catch(Exception h)
			{
				System.out.println(h);
			}
		}
	}
}
public class Sleep {
	public static void main(String args[]) {
		
	
	read c=new read();
	c.start();
	}
}
