public class ThreadExample{
    public static void main(String[] args)
    {

        //lambda syntex = (arguments) -> defination
        Runnable r1 = () -> System.out.println("1st Thread is created");
        r1.run();


        Runnable r2 = () -> System.out.println("2nd Thread is created");
        r2.run();

    }
}