package Collection;
import java.util.*;

public class vector {
	public static void main(String args[])
	{
		Vector J=new Vector();
		Stack stack =new Stack();
		stack.add("deepal");
		stack.add("rohit");
		stack.add("heloo");

		Iterator x=stack.iterator();
		while(x.hasNext())
		{
			System.out.println(x.next());
		}
		System.out.println(stack.pop());
		System.out.println(stack.get(0));
		System.out.println(stack);
	
		J.add("hello");
		J.add(null);
		J.add(1, 4);
		J.add(2,"heloo");
	
		
			System.out.println(J);
		
	}

}
