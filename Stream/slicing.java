package Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
  
public class slicing {
  
    
    public static <T> Stream<T>getSliceOfStream(Stream<T> stream, int startIndex,int endIndex)
    {
        return stream.skip(startIndex).limit(endIndex - startIndex + 1);
    }
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        for (int i = 11; i <= 20; i++)
            list.add(i);
        Stream<Integer> intStream = list.stream();
        System.out.println("List: " + list);

        Stream<Integer>sliceOfIntStream = getSliceOfStream(intStream, 4, 8);
  
        System.out.println("\nSlice of Stream:");
        sliceOfIntStream.forEach(n->System.out.println(n));
        List<String> list2=Arrays.asList("apple","ball","mango","ball","orange","jackfruit","apple");
        list2.stream().collect(Collectors.toSet()).forEach(k->System.out.println(k));
        
    }
}