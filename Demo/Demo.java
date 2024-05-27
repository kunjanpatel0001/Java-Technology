
class Demo{
    public static void main(String[] args){
        System.out.println("Polymorphism");
        C1 obj1 = new C1(1, 2);
        obj1.print();
        C2 obj2 = new C2(10,20,30,40);
        obj2.print();
        stage(obj1);        //C1 sing
        stage(obj2);        // C2 sing
    }

    static void stage(C1 obj){
        obj.sing();
    }
}

class C1{
    private int a;
    private int b;

    void print(){
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    C1(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    void sing(){
        System.out.println("C1 sing");
    }
}

class C2 extends C1{
    private int c;
    private int d;

    C2(int a, int b, int c, int d){
    super(a, b);
    this.c = c;
    this.d = d;
    }

    void print(){
        super.print();
        System.out.println("c: "+ c);
        System.out.println("d: "+ d);

    }

    @Override
    void sing(){
        System.out.println("C2 sing");
    }

}
