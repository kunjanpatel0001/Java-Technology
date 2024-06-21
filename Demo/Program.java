import java.util.ArrayList;


public class Program 
{

   public static void main(String[] args) 
   {
       System.out.println("ArrayList - exceeding initial limit");
       System.out.println("We can pass the Initial"+
                          "Capacity of ArrayList through constructor");
       ArrayList<Object> a = new ArrayList<Object>(5);
       a.add(10);
       a.add(20);
       a.add(30);
       a.add(40);
       a.add(50);
       System.out.println(a);
       System.out.println("ArrayList will increase in it's capacity"+
                          " as we add more elements");
       a.add(60);
       a.add(70);
       a.add(80);
       a.add(90);
       a.add(100);
       System.out.println("Let us print the array now");
       System.out.println(a);
   }
   
}