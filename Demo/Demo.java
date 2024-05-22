class Demo{
    public static void main(String[] args){
        c1 obj1 = new c1();
        obj1.a = 1;
        obj1.b = 2;
        printc1(obj1);
        c2 obj2 = new c2();
        obj2.a = 10;
        obj2.b = 20;
        obj2.c = 30;
        obj2.d = 40;
        printc2(obj2);
        System.out.println("Illustrating Liskov's Principle Of Substitution");
        System.out.println("Parent Handle can Point to Child Object");
        System.out.println("Child Object can act as a substitute of Parent Object");

        printc1(obj2);   
    }

    static void printc1(c1 c){
        System.out.println(c.a);
        System.out.println(c.b);

    }

    static void printc2(c2 c){
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);
        System.out.println(c.d);


    }
}

class c1{
    int a;
    int b;
}

class c2 extends c1{
    int c;
    int d;
}