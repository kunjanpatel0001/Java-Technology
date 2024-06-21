import java.util.ArrayList;

public class Program 
{
 public static void main(String[] args) 
   {
       System.out.println("ArrayList - using an existing arrayList to create a new one");
       ArrayList<Object> a = new ArrayList<>(5);
       a.add(10);
       a.add(20);
       a.add(30);
       a.add(40);
       a.add(50);
       System.out.println("a = " + a);
       System.out.println("We can create an ArrayList from an existing arraylist *a* using this constructor");
       ArrayList<Object> b = new ArrayList<>(a);
       System.out.println("It copies the data of arraylist *a*");
       System.out.println("b = " + b);      
       System.out.println("We can also add more elements");
       b.add(100);
       b.add(200);
       b.add(300);
       b.add(400);
       b.add(500);
       System.out.println("b = "+ b);
   }   
}