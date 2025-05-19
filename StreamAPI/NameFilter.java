import java.util.List;
import java.util.stream.Collectors;

public class NameFilter {
    
public static void main(String[] args)
{

    //filter(predicate) - boolean value function return
    //e->{ return true/false}



    //map(function) - rturn value
    /* each element operations */


    List<String> name = List.of("aman","ankit","bindra");

   List<String>nam =  name.stream().filter(e -> e.startsWith("a")).collect(Collectors.toList());
   System.out.println(nam);

}
}
