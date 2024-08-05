import java.lang.reflect.Constructor;


public class Explore {
   public static void main(String[] args) {
       System.out.println("Welcome to Constructor Object");  
       String str = "Hello World";
       System.out.println("Obtaining Meta Object of str");
       Class c = str.getClass();
       System.out.println("str belongs to type " + c.getName());
       Class s = c.getSuperclass();
       System.out.println("The Parent is :");
       System.out.println(s.getName());
       Constructor [] c2 = c.getConstructors();
       System.out.println("The Constructors are :");
       for(Constructor i : c2){

           System.out.println(i.toGenericString());

       }

   }

}