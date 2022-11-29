package Collection;
 import java.util.*;
public class haspmap {
public static void main(String args[])
{
	HashMap <Integer,String> hash=new HashMap<Integer,String>();
	hash.put(101, "Deepak");
	hash.put(102,"suraj");
	hash.put(103,"sarvesh");
	hash.put(104,"meraj");
	hash.put(105,"rajan");
	hash.put(106,"suraj");
	hash.put(null, "hello");
	System.out.println(hash.get(103));
	System.out.println(hash.containsKey(102));
	System.out.println(hash.containsKey(56));
	System.out.println(hash.containsValue("meraj"));
	System.out.println(hash.isEmpty());
	System.out.println(hash.keySet());
	// entry method
	for(Map.Entry entry:hash.entrySet())
	{
		System.out.println(entry.getKey()+"  "+entry.getValue());
	}
	//iterrtor 
	Set l=hash.entrySet();
	Iterator sl=l.iterator();
	while(sl.hasNext())
	{
		Map.Entry entry= (Map.Entry)sl.next();
		System.out.println(entry.getKey()+"  "+entry.getValue());
	}
	
}
}
