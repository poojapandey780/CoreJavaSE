//Write a Java program to implement a lambda expression to check if a given string is empty.

import java.util.function.Predicate;
public class StringEmpty {
    // Main.java

    public static void main(String[] args) {


        Predicate<String> isEmpty = new Predicate<String>() {
            public boolean test(String str)
            {
                return str.isEmpty();
            }
        };
        Predicate<String> isEmpty1 = str -> str.isEmpty();

       String str1 = "";
       String str2 ="hello from string";


       System.out.println(isEmpty.test(str1));

       System.out.println(isEmpty1.test(str2));
    }
}
