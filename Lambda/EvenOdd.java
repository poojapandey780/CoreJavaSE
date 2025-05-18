// Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(2,4,9,6,1,8);

        List<Integer> evenNum = list.stream()
        .filter(num -> num % 2 ==0 )
        .collect(Collectors.toList());

        System.out.println("Even number: ");
        for(int value : evenNum)
        {
            System.out.println("even number is :"  + value);
        }




        List<Integer> oddNum  = list.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());

        System.out.println("Odd NUmber: ");
        for(int value : oddNum)
        {
            System.out.println("Odd number is : " + value);
        }
    }
}
