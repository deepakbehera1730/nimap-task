package javacode;

class p11{
	
	protected int x=30;
	public int y=50;
	
}
class p extends p11{
	
	int z;
	public void Addition() {
		z=x+y;
		System.out.println("Addition of two numbers:"+z);
	}
}


public class SingleInheritance {
	public static void main(String args[]) {
		p L=new p();
		L.Addition();
	}
	
	

}

