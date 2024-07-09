import java.util.*;

public class Queue {
    public static void main(String[] args) {
        System.out.println("Welcome to Generic Queue");

        GenericQueue<Message> q = new GenericQueue<>();

        Message m1 = new Message("hello", "server1", "12");
        Message m2 = new Message("bye", "Server2", "23");

        q.enqueue(m1);
        q.enqueue(m2);

        System.out.println("Printing Queue Of Messages");

        q.print();

        Message m = q.dequeue();

        System.out.println("Value dequeued :: " + m);
        System.out.println("Printing Queue Of Messages");

        q.print();

        GenericQueue<String> q1 = new GenericQueue<>();

        q1.enqueue("Cat");
        q1.enqueue("Dog");

        System.out.println("Printing Queue Of Strings");

        q1.print();

        String st1 = q1.dequeue();

        System.out.println("Valued dequeued :: " + st1);
        System.out.println("Printing Queue Of Strings");

        q1.print();
    }   
}


class GenericQueue<T> {

    ArrayList<T> al = new ArrayList<>();

    public void enqueue(T i) {
        al.add(i);
    }

    public T dequeue() {
        if( al.isEmpty() )
            return null;
        else
            return al.remove(0);
    }

    public void print()
    {
   for (T i : al) {
            System.out.println("-->" + i);
        }
    }

}

class Message {

    String source;
    String dest;
    String msg;

    public Message(String source, String dest, String msg) {
        this.source = source;
        this.dest = dest;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Message{" + "source=" + source + ", dest=" + dest + ", msg=" + msg + '}';
    }

}