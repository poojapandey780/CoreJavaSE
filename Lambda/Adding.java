import Interface.Add;

public class Adding {
    public static void main(String[] args)
    {
        Add a1 = (a,b) -> System.out.println(a+b);
        a1.add(10, 20);
    }
}
