import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Explore {
    public static void main(String[] args) throws Exception {
        // Load the C1 class
        Class<?> t = Class.forName("C1");

        // Get the default constructor and make it accessible
        Constructor<?> defaultConstructor = t.getDeclaredConstructor();
        defaultConstructor.setAccessible(true);

        // Create a new instance of C1 using the default constructor
        Object o = defaultConstructor.newInstance();

        // Print class names
        System.out.println("Name of Class: " + t.getName());
        System.out.println("Canonical Name of Class: " + t.getCanonicalName());
        System.out.println("Simple Name of Class: " + t.getSimpleName());
        System.out.println("Type Name of Class: " + t.getTypeName());

        // Get all declared constructors
        Constructor<?>[] constructors = t.getDeclaredConstructors();

        for (Constructor<?> cc : constructors) {
            System.out.println("Constructor Name: " + cc.getName());
            System.out.println("Modifiers: " + cc.getModifiers());
            System.out.println("Parameter Count: " + cc.getParameterCount());

            if (cc.getParameterCount() == 2) {
                // Create a new instance using the parameterized constructor
                cc.setAccessible(true);
                o = cc.newInstance(3, 2);

                // Access fields 'a' and 'b'
                Field fieldA = o.getClass().getDeclaredField("a");
                Field fieldB = o.getClass().getDeclaredField("b");
                fieldA.setAccessible(true);
                fieldB.setAccessible(true);
                int i = fieldA.getInt(o);
                int j = fieldB.getInt(o);
                System.out.println("a = " + i);
                System.out.println("b = " + j);
            } else {
                // Use the default instance created earlier

                // Access fields 'a' and 'b'
                Field fieldA = o.getClass().getDeclaredField("a");
                Field fieldB = o.getClass().getDeclaredField("b");
                fieldA.setAccessible(true);
                fieldB.setAccessible(true);
                int i = fieldA.getInt(o);
                int j = fieldB.getInt(o);
                System.out.println("a = " + i);
                System.out.println("b = " + j);
            }
        }
    }
}
