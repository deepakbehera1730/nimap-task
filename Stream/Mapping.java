package Stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;
class mybook{
	int bookid;
	int bookPrice;
	String bookname;
	mybook(int bookid,String bookname,int bookprice)
	{
		this.bookid=bookid;
		this.bookname=bookname;
		this.bookPrice=bookprice;
	
	}
}

public class Mapping {
public static void main(String args[])
{
	List<String> Stringname=Arrays.asList("Hello","Deepak","Sahil");
	List<Integer> number=Arrays.asList(78,9,33,6,223,89);
	List<String> Newname=new ArrayList<String>();
	List<Integer> Newnumber=new ArrayList<Integer>();
	
	Newname=Stringname.stream().map(k->k.toUpperCase()).collect(Collectors.toList());
	Newnumber=number.stream().map(j->2*j).collect(Collectors.toList());
	System.out.println(" String in  a upper case"+Newname);
	System.out.println("multiple by 3 "+Newnumber);
	/// Book;
	List<mybook> book=new ArrayList();
	book.add(new mybook(23,"javabook",400));
	book.add(new mybook(23,"oopsbok",300));
	book.add(new mybook(23,"pythonbook",500));
	book.add(new mybook(23,"physicbook",600));
	book.add(new mybook(23,"chemistry",800));
	
	book.stream().filter(p->p.bookPrice>=500).map(k->k.bookPrice).forEach(k->System.out.println("Book price:"+k));
	
	
	
}
}
