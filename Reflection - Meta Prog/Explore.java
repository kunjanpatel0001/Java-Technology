// uses Java reflection to inspect and interact with C1's constructors and fields at runtime.

import java.lang.reflect.Field;     // for accessing fields of the class.
import java.lang.reflect.Constructor;       // for accessing constructors.
import java.lang.reflect.Method;        //for accessing methods.


public class Explore {
   public static void main(String[] args) throws Exception {

       Class t = Class.forName("rtti.C1");      // Loading C1 class

       Object o = t.newInstance();      // creating new instance of C1 using default constructor
    
       // Print different representation of class name
       System.out.println("Name of Class "+t.getName());
       System.out.println("Canonical Name of Class "+t.getCanonicalName());
       System.out.println("Simple Name of Class "+t.getSimpleName());
       System.out.println("Type Name of Class "+t.getTypeName());

       Constructor c[] = t.getDeclaredConstructors();       // getting public and private constructors of the class

       for (Constructor cc : c) {
            // for each constructor
           System.out.println(cc.getName());
           System.out.println(cc.getModifiers());
           System.out.println(cc.getParameterCount());

           // If the constructor has two parameters, create a new instance using this constructor and print the values of fields a and b
           if (cc.getParameterCount() == 2) {
               o = cc.newInstance(3, 2);
               int i = o.getClass().getField("a").getInt(o);
               int j = o.getClass().getField("b").getInt(o);
               System.out.println("a=" + i);
               System.out.println("b=" + j);
           }

           // if the constructor has >2 parameters, use the default instance & print
           else{
            int i = o.getClass().getField("a").getInt(o);
            int j = o.getClass().getField("b").getInt(o);
            System.out.println("a=" + i);
            System.out.println("b=" + j);
           }

       }

   }

}