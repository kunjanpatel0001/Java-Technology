import java.lang.reflect.Method;


public class Explore {

   public static void main(String[] args) {

   System.out.println("Welcome to Method Object");  

   String str = "Hello World";

   System.out.println("Obtaining Meta Object of str");

   Class c = str.getClass();

   System.out.println("str belongs to type " + c.getName());

   Class s = c.getSuperclass();

   System.out.println("The Parent is :");

   System.out.println(s.getName());

   Method[] m1 = c.getMethods();

   System.out.println("The Methods are :");

   for(var i : m1){

       System.out.println(i.toGenericString());

   }

 }

}