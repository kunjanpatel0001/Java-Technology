import java.util.*;
public class Queue {
    public static void main(String[] args) {

        System.out.println("Welcome to String Queue.");
        StringQueue q=new StringQueue();
        q.enqueue("Cat");
        q.enqueue("Dog");
        q.print();
        String str=q.dequeue();
        System.out.println("Item removed :: "+str);
        q.print();
    }   
}

class StringQueue{
    ArrayList<String> al = new ArrayList<>();
    void enqueue(String v){
        al.add(v);
    }
    String dequeue(){
        if(al.isEmpty()){
            return null;
        }else {
            return al.remove(0);
        }
    }

    public void print(){
        System.out.println("Printing the String Queue");
        for (String o: al){
            System.out.println(o);
        }
    }
}
