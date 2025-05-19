import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Square {

    
public static void main(String[] args)
{
    //map(function) - rturn value
    /* each element operations */


    List<Integer> num = Arrays.asList(2,3,12,4,8,1,5);

    //collect method- specific only list,set unmutable or other type
   List<Integer>nam =  num.stream().map(i->i*i).collect(Collectors.toList());
   System.out.println(nam);


}
}


