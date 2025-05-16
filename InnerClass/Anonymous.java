//  it means without use name, return type, and access specifier define class----

import Interface.MyInt;

public class Anonymous {
    
    public static void main(String[] args)
    {
        MyInt m1 = new MyInt() {
            public void sayHello()
            {
                System.out.println("Hello From Anonymous class");
            }
        };

        m1.sayHello();
    }
}
