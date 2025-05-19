import java.util.LinkedList;
import java.util.List;

public class ListLinked {
    public static void main(String[] args)
    {
        List<String> names = new LinkedList<>();
        names.add("sita");
        names.add("shyam");
        names.add("mika");
        names.addFirst("gita");

        
        names.add("vipul");
        names.addLast("soni");

        //indexof method - return index of object
        System.out.println("Index of Shyam : " +names.indexOf("shyam"));
        System.out.println(names);

        //set method - add the value at specific index
        names.set(2,"joy");
        
        //get Method - get the value from specific index
        System.out.println("element of index 5 is : "+names.get(5));


        //LastIndexOf
        System.out.println("the last occurence index of joy is: " + names.lastIndexOf("joy"));

        //isEmpty method - return boolean
        System.out.println("is empty: " +names.isEmpty());

        //contain -return is elemnt available
        System.out.println("shyam is available in list: " + names.contains("shyam"));
        System.out.println(names);


        //iteration method
        for(String nameIterate : names)
        {
            System.out.println(nameIterate);
        }


        //using forEach
        names.forEach(item -> System.out.println(item));

    }
}
