//Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.

import java.util.Arrays;
import java.util.List;

public class SortString {
    public static void main(String[] args)
    {
        List<String> str = Arrays.asList("banana","apple","grapes","blackberry","oranage");

        str.sort((str1, str2) -> str1.compareToIgnoreCase(str2));
        System.out.println(str);
        
    }
}
