import java.util.ArrayList;
import java.util.List;
public class ListArray{
    public static void main(String[] args)
    {
        List<String> names = new ArrayList<String>() ;
        names.add("ram");
        names.add("joy");
        names.add("shyam");
        names.add("sita");

        System.out.println(names);
        //addFirst method
        names.addFirst("gita");

        names.add("vipul");
        names.add(3,"sohan"); //adds element as apecific index

        //addLast method
        names.addLast("soni");
        names.addLast("joy");

        //get element
        System.out.println("element on index 5 is: " + names.get(5));

        //set element - replace the element at specific index
        names.set(6, "abhi");


        //ndexOf method - return 1st occurence 
        names.indexOf("joy");

        //lastIndexOF method
        names.lastIndexOf("abhi");  //allow duplicate so find last occurence


        //size method
        System.out.println("The list Size is: " +names.size());


        //check isEmpty method - return boolean
        System.out.println("Is list empty : " +names.isEmpty());

        //contains method - return if list contain element
        System.out.println("the index of Shyam is : " +names.indexOf("shyam"));
        System.out.println(names);
    }
}