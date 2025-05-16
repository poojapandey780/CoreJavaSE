import Interface.Product;

public class Multiply {
    public static void main(String[] args)
    {
        Product p1 = (a,b) -> {
            int c= a*b;
            System.out.println("the multiple of " + a + " and " + b + " is " + c);
        };
        p1.product(4,5);
    }
}
