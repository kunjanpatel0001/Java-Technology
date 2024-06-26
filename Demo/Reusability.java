abstract class C1 {

    private int a;

    private int b;

    void print()

    {

        System.out.println("a = " + a);

        System.out.println("b = " + b);

    }

    C1(int a, int b)

    {

        this.a = a;

        this.b = b;

    }

    abstract void sing();

 }


 class C2 extends C1 {

    private int c;

    private int d;

    @Override

    void print()

    {

        super.print();

        System.out.println("c = " + c);

        System.out.println("d = " + d);

    }

    C2(int a,int b,int c, int d)

    {

        super(a,b);

        this.c = c;

        this.d = d;

    }

    @Override

    void sing()

    {

        System.out.println("Hey Jude don't be afraid ...");

    }

 }


 class C3 extends C1 {

    private int e;

    private int f;

    @Override

    void print()

    {

        super.print();

        System.out.println("e = " + e);

        System.out.println("f = " + f);

    }

    C3(int a,int b,int e, int f)

    {

        super(a,b);

        this.e = e;

        this.f = f;

    }

    @Override

    void sing()

    {

        System.out.println("By the river of Babylon ...");

    }

 }


 class C4 extends C1 {

    private int i;

    private int j;

    @Override

    void print()

    {

        super.print();

        System.out.println("e = " + i);

        System.out.println("f = " + j);

    }

    C4(int a,int b,int i, int j)

    {

        super(a,b);

        this.i = i;

        this.j = j;

    }

    @Override

    void sing() {

        System.out.println("The hills are alive...");

    } 

 }


 public class Reusability {

    public static void main(String[] args) {

        C2 obj2 = new C2(10,20,30,40);

        obj2.print();  

        C3 obj3 = new C3(11,22,33,44);

        obj3.print();

        C4 obj4 = new C4(100,200,300,400);

        obj4.print();

        stage(obj2);

        stage(obj3);

        stage(obj4);

    }

    static void stage(C1 obj)

    {

        obj.sing();

    }

 }