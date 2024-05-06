public class Demo {
    static int count;
    static String CommandSequence = "iiiddiipriiiidp";
   public static void main(String[] args) {
        System.out.println("Modular Counter");
        int length = CommandSequence.length();
        for(int j = 0; j < length; j++){
            switch(CommandSequence.charAt(j)){
                case 'i':
                    Counter.increment();
                    break;
                case 'd':
                    Counter.decrement();
                    break;
                case 'p':
                    Counter.print();
                    break;
                case 'r':
                    Counter.reset();
                    break;
            }
        }
   } 
}

class Counter{
    static int count = 0;
    static void increment(){
        count++;
    }

    static void decrement(){
        count--;
    }
    static void print(){
        System.out.println(count);
    }
    static void reset(){
        count = 0;
    }
}