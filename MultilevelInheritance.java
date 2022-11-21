package javacode;



class first{
	int x=70;
}
class second extends first{
	 protected int y=626;
}
class third extends second{
	int f=34;
	int t=0;
	public void Addition()
	{
	t=x+y+f;
	System.out.println("Addition three number:"+t);
	}
	
	
	
	
}

public class MultilevelInheritance {
public static void main(String args[]) {
	

	third T=new third();
	T.Addition();
}
}