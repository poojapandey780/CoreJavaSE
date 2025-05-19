import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueFIFO {
    public static void main(String[] args)
    {
       Queue<String> items = new PriorityQueue<>();
       items.add("red");

       items.add("blue");
       System.out.println(items);

       //queueIterate
     items.forEach(item-> System.out.println(item));

     //add to another queue
     Queue<String> items1= new PriorityQueue<>();
     items.addAll(items1);
     System.out.println(items);

     //insert another item on queue
     items.offer("green");
     System.out.println(items);

     //count the elements of queue
     System.out.println(items.size());

     //retrieve 1st element and remove
     items.remove(items.peek());
     //or items.poll();
System.out.println(items);


    }
}
