import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class SetHash {
    public static void main(String[] args)
    {
        Set<String> items = new HashSet<String>();
        items.add("sohan");
        items.add("joy");
        items.add("sita");
        items.add("abhay");

        System.out.println(items);

        Set<String> items2 = new HashSet<String>();
        items.add("jeeni");
        items.add("kabir");
        items.add("joy");
        items.add("abhay");

        items.isEmpty();
 
       items.addAll(items2);
       System.out.println(items);

       items.isEmpty();

       items.remove("joy");

       //removeAll take collection as argument - list, array,set.
       items.removeAll(Arrays.asList("abhay","kabir"));
       System.out.println(items);

//using for each
       for (String items3 : items) {
        System.out.println(items3);
       }
//using forEach sortend
       items.forEach(item -> System.out.println(item));
       
    }

    
}
