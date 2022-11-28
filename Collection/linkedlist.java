package Collection;

import java.util.*;

public class linkedlist {
	public static void main(String args[]) {
		LinkedList L1 = new LinkedList();
		L1.add("deepak");
		L1.add("suraj");
		L1.add("Yyt");
		L1.add("deepak");

		LinkedList linkedList1 = new LinkedList();
//linkedList1=(LinkedList)L1.clone();
		System.out.println(linkedList1);
		System.out.println(L1.contains("Hello"));
//System.out.println(L1.equals(linkedList1));

		Iterator x = L1.descendingIterator();
		while (x.hasNext()) {
			System.out.println(x.next());

		}
		System.out.println(L1.stream());
		System.out.println(L1.size());
		System.out.println(L1.hashCode());
		System.out.println(L1.isEmpty());
//System.out.println(L1.removeAll(L1));
//	System.out.println(L1.getFirst());
//	System.out.println(L1.getLast());
//	System.out.println(L1.peekFirst());
//	System.out.println(L1.peekLast());
		System.out.println(L1);
		

	}
}
