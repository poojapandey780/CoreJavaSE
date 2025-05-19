import java.util.List;
import java.util.stream.Collectors;

public class ForEach {

    public static void main(String[] args) {
        // map(function) - rturn value
        /* each element operations */

        List<Integer> number = List.of(2, 3, 12, 4, 8, 1, 5);

        List<Integer> nam = number.stream().map(i -> i * i * i).collect(Collectors.toList());

        // foreach(consumer) -
        number.stream().forEach(
                e -> {
                    System.out.println(e);
                });
        nam.stream().forEach(System.out::println);
    }
}
