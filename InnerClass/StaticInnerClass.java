public class StaticInnerClass {
    private static String brand;
    private static int petrol;


    // static inner class - create a static class no need to create methods static in that class
    static class Engine{
        public void start()
        {
           
            System.out.println(brand + " is starting " + "with" + petrol);
           
        }   
    }


    public static void main(String[] args)
    {
        
       StaticInnerClass.Engine engine = new StaticInnerClass.Engine();
       engine.start();

    }
}
