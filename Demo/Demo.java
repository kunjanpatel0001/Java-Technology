public class Demo {
    public static void main(String[] args) {

        System.out.println("OBJECTS");
        C1 obj1 = new C1();
        System.out.println(obj1.a);
        C1 obj2 = new C1();
        System.out.println(obj2.a);
        obj1.a = 10;
        obj2.a = 20;
        System.out.println(obj1.a);
        System.out.println(obj2.a);
}
}
class C1{
    int a;
    int b;
    static int c;

}