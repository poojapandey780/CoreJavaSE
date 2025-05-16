public class MemberInnerClass {
    // inside a class but outside from method - no static
    // lets take car example:-

    private String model;
    private int petrolInLitre;
    
    MemberInnerClass(String model, int litre)
    {
        this.model = model;
        this.petrolInLitre = litre;

    }
    //if i create another class inside this class so - 
    //i don't need to create getter and setter to use proivate variables
    class Engine{
        public void start()
        {
            if(petrolInLitre > 0)
            {
                System.out.println("car " + model + " is starting with petrol " + petrolInLitre);
            }
            else
            {
                System.out.println(model + " has no petrol. Cannot start engine.");
            }
        }
    }


    public static void main(String[] args)
    {
        MemberInnerClass mb = new MemberInnerClass("swift", 0);
        MemberInnerClass.Engine car = mb.new Engine();
        car.start();
    }
}
