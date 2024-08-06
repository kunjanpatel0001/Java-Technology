import java.lang.reflect.Field;


public class Explore {

   public static void main(String[] args) {

       System.out.println("Obtaining Fields");  

       String str = "Hello World";

       System.out.println("Obtaining Meta Object of str");

       Class c = str.getClass();

       System.out.println("str belongs to type " + c.getName());

       Class s = c.getSuperclass();

       System.out.println("The Parent is :");

       System.out.println(s.getName());

       Field [] f1 = c.getDeclaredFields();

       System.out.println("The Fields are :");

       for(Field i : f1)

       {

           System.out.println(i.toGenericString() + ";");

       }

  }

}