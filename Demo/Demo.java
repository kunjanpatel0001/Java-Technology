public class Demo {
    public static void main(String[] args) {
        System.out.println("Counter using Instance methods and objects and data hiding");
        Counter C1 = new Counter();
        C1.increment();
        C1.decrement();
        C1.reset();
        System.out.println(C1.getCount());
    }
}

class Counter{
    private int count;

    void increment(){
        if(this.count < 100){
            this.count++;
        }
    }
    void decrement(){
        if(this.count > 0){
        this.count--;
        }
    }
    void reset(){
        this.count = 0;
    }

    int getCount(){
        return this.count;
    }
}
