import java.util.List;

public class MinMax {
    public static void main(String[] args)
    {
        //compareTo() method
        //for min
        List<Integer> num = List.of(4,7,10,23,2,0,14);
        Integer minNum = num.stream().min((x,y) -> x.compareTo(y)).get();
        System.out.println("min: " + minNum);


        Integer maxNum = num.stream().max((x,y) -> x.compareTo(y)).get();

        System.out.println("Max: " + maxNum);

    }
}
