import java.util.Set;
import java.util.TreeSet;
public class SetTree {
    public static void main(String[] args)
    {
        Set<String> names = new TreeSet<>();
        names.add("shyam");
        names.add("goel");
        names.add("one");

        System.out.println(names);

        Set<String> names1 = new TreeSet<>();
        names1.add("shyam");
        names1.add("goel");
        names1.add("anuju");

        System.out.println(names1);
        
        
        //addAll() - method -  return unique elements 
        names.addAll(names1);

        System.out.println(names);

        //containsAll - return boolean if subset of the set contain
        System.out.println("is :" + names.containsAll(names1));

       // names.hashCode() - sum of hashcode reaturn items 
        System.out.println("hashcode is " + names.hashCode());

        
        
    }
}
