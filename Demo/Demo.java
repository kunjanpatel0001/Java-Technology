public class Demo {
    public static void main(String[] args) {
        System.out.println(C1.a);
        System.out.println(C2.a);
        C1.m1();


    }
    class C1{
        static int a = 10;
        static void m1(){
            System.out.println("m1");
            System.out.println(a);
        }
    }

    class C2{
        static int a = 20;
    }
}