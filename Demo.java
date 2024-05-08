public class Demo {
    public static void main(String[] args){
        System.out.println("Instance Method & this keyword");
        C1 obj1 = new C1();
        obj1.m1();
    }
}

class C1{
    int a;
    int b;
    static int c= 10;
    void m1(){
        System.out.println(a);
        System.out.println(b);
    }
}
