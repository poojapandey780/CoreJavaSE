import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountDistinct {
    public static void main(String[] args)
    {
        List<String> str = List.of("Java Stream API provides a fluent interface for processing sequences of elements.",
                "It supports functional-style operations on streams of elements, such as map-reduce transformations.",
                "In this exercise, you need to count the total number of words in all sentences.");

               List<String> uniqueWords = 
               str.stream().flatMap(e -> Arrays.stream(e.split(" ")))
                .distinct()
                .collect(Collectors.toList());

                // Print unique words
                uniqueWords.forEach(System.out::println);

                // Print count of unique words
                System.out.println("Number of distinct words: " + uniqueWords.size());
                
    }
}
