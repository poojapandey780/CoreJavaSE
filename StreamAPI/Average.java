//Write a Java program to calculate the average of a list of integers using streams.

import java.util.Arrays;
import java.util.List;

public class Average{
    public static void main(String[] args)
    {
        List<Integer> num = Arrays.asList(20,30,25,40,60,10,50);

        double sum  = num.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);

        System.out.println("Average is: " + sum);
    }
}