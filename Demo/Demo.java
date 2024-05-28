class Demo{
    public static void main(String[] args){

        System.out.println("Final class - cannot act as a parent");
        C1 obj1 = new C1();
    }
}
    final class C1{}

    class C2 extends C1{}