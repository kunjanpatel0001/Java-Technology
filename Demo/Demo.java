public class Demo {
    public static void main(String[] args) {

        System.out.println("Multiple Counter - Module style");
 
 
        System.out.println("Counter1 = " + Counter1.getCount());
 
        Counter1.increment();
 
        Counter1.increment();
 
        System.out.println("Counter1 = " + Counter1.getCount());
 
        Counter1.decrement();
 
        System.out.println("Counter1 = " + Counter1.getCount());
 
 
        System.out.println("Counter2 = " + Counter2.getCount());
 
        Counter2.increment();
 
        Counter2.increment();
 
        Counter2.increment();
 
        System.out.println("Counter2 = " + Counter2.getCount());
 
        Counter2.decrement();
 
        System.out.println("Counter2 = " + Counter2.getCount());
 
 
        System.out.println("Counter3 = " + Counter3.getCount());
 
        Counter3.increment();
 
        Counter3.increment();
 
        System.out.println("Counter3 = " + Counter3.getCount());
 
        Counter3.decrement();
 
        Counter3.decrement();
 
        Counter3.decrement();
 
        System.out.println("Counter3 = " + Counter3.getCount());
 
 
    }
 
 
 }
 
 
 class Counter1 {
 
    private static int count;
 
 
    static void increment() {
 
        if (count < 100)
 
            count++;
 
    }
 
 
    static void decrement() {
 
        if (count > 0)
 
            count--;
 
    }
 
 
    static int getCount() {
 
        return count;
 
    }
 
 }
 
 
 class Counter2 {
 
    private static int count;
 
 
    static void increment() {
 
        if (count < 100)
 
            count++;
 
    }
 
 
    static void decrement() {
 
        if (count > 0)
 
            count--;
 
    }
 
 
    static int getCount() {
 
        return count;
 
    }
 
 }
 
 
 class Counter3 {
 
    private static int count;
 
 
    static void increment() {
 
        if (count < 100)
 
            count++;
 
    }
 
 
    static void decrement() {
 
        if (count > 0)
 
            count--;
 
    }
 
 
    static int getCount() {
 
        return count;
 
    }
 
 }