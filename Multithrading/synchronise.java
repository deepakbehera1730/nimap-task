package Multithrading;


class Table{
	public synchronized void Display(int x) {
		for(int i=1;i<=10;i++)
		{
			int k=x*i;
			System.out.println(k);
		}
	}
}
class p1 extends Thread{
	public void run()
	{
		Table t1=new Table();
		t1.Display(6);
	}
	
}
class p2 extends Thread{
	public void run()
	{
		Table t1=new Table();
		t1.Display(9);
	}
	
}

public class synchronise {
	public static void main(String args[]) {
		p1 k=new p1();
		k.start();
		p2 j=new p2();
		j.start();
	}

}
