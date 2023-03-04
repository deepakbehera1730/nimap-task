package Stream;
import java.util.*;
import java.util.stream.Collectors;
public class paritioning {
 public static void main(String args[])
 {
	 List<Integer> partion=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,23);
 Map<Boolean,List<Integer>>list=partion.stream().collect(Collectors.partitioningBy(k->k>3));
 System.out.println(list);
 //grouping
 List<String> str=Arrays.asList("D1eepak","Suraj","meraj","Suraj","Deepak","rohit","Sarvesh");
 Map<String,List<String>> hello=str.stream().collect(Collectors.groupingBy(k->k));
 System.out.println(hello);
 //reducing
 List<String> redustr=Arrays.asList("a","b","c","e","f","k","1","3","5");
 Optional<String> stg=redustr.stream().reduce((value, comibedvalue)->{
	 return(value+comibedvalue);
 });
 System.out.println(stg);
 //peeking Element
 List<Integer> list1= Arrays.asList(0, 90, 87, 44, 83, 150);
 list1.stream().peek(n->System.out.println(n)).collect(Collectors.toList());
 //System.out.println(list2);
// sorting
 List<String> List3=str.stream().sorted().collect(Collectors.toList());
 System.out.println(List3);
 // reverse sorting
 List<Integer> List4=list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
 System.out.println(List4);
 
 
 
 
 
 }
}
