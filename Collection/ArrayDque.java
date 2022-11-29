package Collection;
import java.util.*;

public class ArrayDque {
public static void main(String args[]) {
	ArrayDeque t1= new ArrayDeque();
	t1.add("A");
	t1.add("c");
	t1.add("d");
	t1.add("B");
	
	System.out.println(t1.poll());
//	t1.push("k");
	System.out.println(t1);
	System.out.println(t1.peek());
	System.out.println(t1.pop());
	System.out.println(t1);
}
}
