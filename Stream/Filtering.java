package Stream;
import java.util.*;
import java.util.stream.Collectors;

public class Filtering {

	public static void main(String args[])
	{
		List <Integer>number=Arrays.asList(10,39,22,33,15,10,44,98);
		List <Integer>evennumber=new ArrayList<Integer>();
		List <Integer>oddnumber=new ArrayList<Integer>();
		List  <String> Notvalue=Arrays.asList("Hello","Deepak","Rohit","sarvesh","azad");
		Notvalue.stream().filter(str->str!=null).forEach(k->System.out.println(k));
		//comparise with string
		Notvalue.stream().filter(str->str.length()>5 && str.length()>6).forEach(l->System.out.println(l));
		//upparse case
		Notvalue.stream().filter(str->str!=null).forEach(k->System.out.println(k.toUpperCase()));
		
      		
		evennumber=number.stream().filter(n->n%2==0).collect(Collectors.toList());
		oddnumber=number.stream().filter(k->k%2!=0).collect(Collectors.toList());
		System.out.println("Even Number :"+evennumber);
		System.out.println("odd number:"+oddnumber);
	}
	
}
