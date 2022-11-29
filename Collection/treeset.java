package Collection;
import java.util.*;

public class treeset {
public static void main(String args[])
{
	TreeSet Tree=new TreeSet();
	Tree.add(12);
	Tree.add(45);
	Tree.add(34);
	Tree.add(56);
	Tree.add(23);
	System.out.println(Tree.first());
	System.out.println(Tree.last());
	System.out.println(Tree.headSet(34));
	System.out.println(Tree.floor(36));
	System.out.println(Tree.ceiling(40));
	System.out.println(Tree.lower(23));
	System.out.println(Tree.higher(45));
	System.out.println(Tree.pollFirst());
	System.out.println(Tree.pollLast());
	System.out.println(Tree);
}
}
