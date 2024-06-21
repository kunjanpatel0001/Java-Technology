import java.util.ArrayList;

public class Program 
{
   public static void main(String[] args) 
   {
       System.out.println("ArrayList");
       System.out.println("Let Create an ArrayList");
       ArrayList<Object> a = new ArrayList<Object>();
       System.out.println("Initial Capacity of array list is 10");
       a.add(10);
       a.add(20);
       a.add(30);
       a.add(40);
       a.add(50);
       a.add(60);
       a.add(70);
       a.add(80);
       a.add(90);
       a.add(100);
       System.out.println("Let us print the array list now");
       System.out.println(a);
   }    
}