public class Demo {
    static int count;
    static String CommandSequence = "iiiddiipriiiidp";
   public static void main(String[] args) {
        System.out.println("Counter with Range Checking");
        System.out.println(Counter.getCount());

       Counter.increment();

       Counter.increment();

       System.out.println(Counter.getCount());

       Counter.decrement();

       System.out.println(Counter.getCount());
   } 
}

class Counter{
    private static int count;
    static void increment(){
        if (count < 100)
        count++;
    }

    static void decrement(){
        if (count > 0)
        count--;
    }
    static void print(){
        System.out.println(count);
    }
    static void reset(){
        count = 0;
    }
    static int getCount(){
        return count;
    }
}