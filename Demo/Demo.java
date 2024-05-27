class Reusability {
    public static void main(String[] args) {
        System.out.println("Data Hiding, super keyword");
        C1 obj1 = new C1(1,2);
        obj1.print();
        C2 obj2 = new C2(10,20,30,40);
        obj2.print();
    }
}

class C1 {
    private int a;
    private int b;

    C1(int a, int b)
   {
       this.a = a;
       this.b = b;
   }
   void print()
   {
       System.out.println("a = " + this.a);
       System.out.println("b = " + this.b);
   }
}

class C2 extends C1{
    int c;
    int d;

    C2(int a, int b, int c, int d){
        super(a,b);
        this.c = c;
        this.d = d;
    }
    void print()
   {
       super.print();
       System.out.println("c = " + this.c);
       System.out.println("d = " + this.d);
   }

}