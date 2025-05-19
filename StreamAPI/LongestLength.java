//  find the length of the longest name in the list." 

import java.util.Arrays;
import java.util.List;

public class LongestLength {
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("aman","anmol","joy","vijay","Sunil","ramesh");
        Integer length = names.stream().map(e -> e.length()).max((x,y) -> x.compareTo(y)).get();

        
        System.out.println("length is: " + length);
        
    }
}
