package Collection;
import java.util.*;

public class hasht {
public static void main(String args[])
{
	Hashtable <Integer,String> table=new Hashtable<Integer,String>();
	Hashtable  hash=new Hashtable();
	hash.put(101, "Deepak");
	hash.put(102,"suraj");
	hash.put(103,"sarvesh");
	table.put(104,"meraj");
	table.put(105,"rajan");
	table.put(106,"suraj");
	//table.put(null, "hello");
    table.putAll(hash);
    System.out.println(table.get(106));
    System.out.println(table.containsKey(67));
    System.out.println(table.containsValue("suraj"));
    
    for(Map.Entry entry:table.entrySet())
    {
    	System.out.println(entry.getKey()+" "+entry.getValue());
    	
    }
    Set k=hash.entrySet();
    Iterator j=k.iterator();
    while(j.hasNext())
    {
    	Map.Entry entry=(Map.Entry)j.next();
    	System.out.println(entry.getKey()+" "+entry.getValue());
    }
    
    


	
	
	
}
}
