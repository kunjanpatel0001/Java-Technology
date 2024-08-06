import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Explore {

    public static void main(String[] args) throws Exception {
        Class<?> t = Class.forName("C1");       //loads the C1 class into memory. "Class.forName("C1")"" returns the Class object associated with the C1 class.
        // Get the default constructor and make it accessible
        Constructor<?> defaultConstructor = t.getDeclaredConstructor();     
        defaultConstructor.setAccessible(true);

        // Create a new instance of C1 using the default constructor
        Object o = defaultConstructor.newInstance();

        // Printing class information
        System.out.println("Name of Class: " + t.getName());
        System.out.println("Canonical Name of Class: " + t.getCanonicalName());
        System.out.println("Simple Name of Class: " + t.getSimpleName());
        System.out.println("Type Name of Class: " + t.getTypeName());

        //Retrieving all declared constructors of the C1 class.
        Constructor<?>[] constructors = t.getDeclaredConstructors();

        for (Constructor<?> cc : constructors) {
            System.out.println("Constructor Name: " + cc.getName());
            System.out.println("Modifiers: " + cc.getModifiers());
            System.out.println("Parameter Count: " + cc.getParameterCount());

            if (cc.getParameterCount() != 0) {
                // Create a new instance using the parameterized constructor
                cc.setAccessible(true);
                o = cc.newInstance(3, 2);

                // retrieves the field a, b from the C1 class.
                Field fieldA = o.getClass().getDeclaredField("a");
                Field fieldB = o.getClass().getDeclaredField("b");
                fieldA.setAccessible(true);
                fieldB.setAccessible(true);
                int i = fieldA.getInt(o);       //gets the value of field a from the instance o.
                int j = fieldB.getInt(o);
                System.out.println("a = " + i);
                System.out.println("b = " + j);
            } else {
                Field fieldA = o.getClass().getDeclaredField("a");
                Field fieldB = o.getClass().getDeclaredField("b");
                fieldA.setAccessible(true);
                fieldB.setAccessible(true);
                int i = fieldA.getInt(o);
                int j = fieldB.getInt(o);
                System.out.println("a = " + i);
                System.out.println("b = " + j);
            }

            //Reteriving all the public fields of class C1
            Field[] ff = t.getFields();
            for (Field f : ff) {
                System.out.println(f.getName());
            }

            // Retriving all the declared methods of C1 class
            Method[] mm = t.getDeclaredMethods();
            for (Method mtd : mm) {
                System.out.println("Method Name: " + mtd.getName());
                System.out.println("Parameter Count: " + mtd.getParameterCount());
                System.out.println("Return Type: " + mtd.getReturnType());
            }
        }
    }
}
