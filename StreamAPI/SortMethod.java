import java.util.List;

public class SortMethod {
 public static void main(String[] args)
 {
    List<String> names = List.of("shyam","joy","anand","amit","vikram");

    // Sorted

     names.stream()
    .sorted()
    .forEach(System.out::println);
 }    

}
