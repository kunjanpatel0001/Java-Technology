class Demo{
    public static void main(String[] args){
        C1 obj1 = new C1();
        obj1.a = 1;
        obj1.b = 2;
        obj1.printC1();C2 obj2 = new C2();
        obj2.a = 10;
        obj2.b = 20;
        obj2.c = 30;
        obj2.d = 40;
        obj2.printC2();
        System.out.println("Parent Method can be Invoked on child Object" );  
       obj2.printC1();    
    }
}

class C1{
    int a;
    int b;
    void printC1(){
        System.out.println("a = " + this.a);
        System.out.println("b = " + this.b);
    }
}

class C2 extends C1{
    int c;
    int d;
    void printC2(){
        System.out.println("a = " + this.a);
        System.out.println("b = " + this.b);
        System.out.println("c = " + this.c);
        System.out.println("d = " + this.d);
    }
}