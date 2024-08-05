public class Explore {


    public static void main(String[] args)
 
    {
        System.out.println("Obtaining Super Types");  
        String str = "Hello World";
        System.out.println("Obtaining Meta Object of str");
        Class c = str.getClass();
        System.out.println("str belongs to type " + c.getName());
        Class s = c.getSuperclass();        // meta object of the parent class
        System.out.println("The Parent is :");
        System.out.println(s.getName());
        Class [] stypes = c.getInterfaces();        // list of meta objects of the interfaces
        System.out.println("The Interface SuperTypes are :");
        for(Class i : stypes)
        {
            System.out.println(i.getName());
        }
    } 
 }