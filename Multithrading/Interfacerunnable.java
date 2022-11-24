package Multithrading;
class Runnale implements Runnable {
	public void run()
	{
		System.out.println("Runnable interface");
		
	}
	
	
}

public class Interfacerunnable {
	public static void main(String args[]) {
		Runnale t3= new Runnale();
		Thread t1=new Thread(t3);
		t1.start();
		
	}

}
