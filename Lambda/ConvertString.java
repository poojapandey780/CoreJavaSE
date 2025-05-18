//Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.

import java.util.Arrays;
import java.util.List;

public class ConvertString {
    public static void main(String[] args)
    {
        // Create a list of strings
        List<String> stringList = Arrays.asList("Red", "Green", "Blue", "PINK");

        // Print the original strings
        System.out.println("\n Original strings:");
        for(String str : stringList)
        {
            System.out.println(str);
        }


        //convert string into lowercase 
        stringList.replaceAll(str -> str.toLowerCase());
       

        // Print the lowercase string
        System.out.println("\n lowercase strings:");
        for(String str : stringList)
        {
            System.out.println(str);
        }

        // convert string into Uppercase
        stringList.replaceAll(str-> str.toLowerCase());

        //print the lowercase string
        System.out.println("\n lowercase strings:");
        for(String str : stringList)
        {
            System.out.println(str);
        }
        
    }
}
