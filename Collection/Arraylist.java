package Collection;
import java.util.*;
public class Arraylist {
	public static void main(String args[])
	{
		ArrayList D=new ArrayList();
		D.add("deepak");
		D.add("Rahul");
	System.out.println(	D.add("Sarvesh"));
		ArrayList k=new ArrayList();
		k.add("Meraj");
		k.add("1234");
		k.addAll(D);
		k.add(2, "Azad");
		System.out.println(k.contains("deEpak"));
		System.out.println(k.get(3));
		System.out.println(k.iterator());
	}

}
