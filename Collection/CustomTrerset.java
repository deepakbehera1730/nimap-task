package Collection;
import java.util.*;

class Mybook{
	private int BookId,BookPrice;
	private String Bookname;
	
	public Mybook(int BookId,String Bookname,int BookPrice)
	{
		this.BookId=BookId;
		this.Bookname=Bookname;
		this.BookPrice=BookPrice;
	}
	public int getId()
	{
		return(BookId);
	}
	public String getname()
	{
		return(Bookname);
	}
	public int getPrice()
	{
		return(BookPrice);
	}
	
	
}
class mycustombook implements Comparator{
	
	public int compare(Object b1,Object b2) {
		Mybook book=(Mybook)b1;
		Mybook book2=(Mybook)b2;
		if(book.getPrice()>book2.getPrice())
		{
			return(-1);
		}
		else {
			return(1);
		}
		
		
	}
}


public class CustomTrerset {
	public static void main(String args[]) {
		
		Mybook book1=new Mybook(1,"oops",24000);
		Mybook book2=new Mybook(2,"java",2300);
		Mybook book3=new Mybook(3,"python",2400);
		TreeSet tree=new TreeSet(new mycustombook());
		tree.add(book1);
		tree.add(book2);
		tree.add(book3);
		Iterator t1=tree.iterator();
		Mybook d1;
		while(t1.hasNext()) {
			d1=(Mybook)t1.next();
			System.out.println(d1.getId()+" "+d1.getname()+" "+d1.getPrice());
		}
		
	}

}
