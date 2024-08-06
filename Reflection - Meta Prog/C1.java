class C1 implements I1 {
    // Public Variables
    public int a;
    public int b;
    public int c;
    public int d;
 
    C1() {
        System.out.println("Default Constructor"); 
    }
 
    public C1(int a, int b) {       // Parameterized constructor
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    // getter and setter methods for a, b, c, d
    public int getA() {
        return a;
    }
 
    public void setA(int a) {
        this.a = a;
    }
 
    public int getB() {
        return b;
    }
 
    public void setB(int b) {
        this.b = b;
    }
 
    public int getC() {
        return c;
    }
 
    public void setC(int c) {
        this.c = c;
    }
 
    public int getD() {
        return d;
    }
 
    public void setD(int d) {
        this.d = d;
    }
 
    // toString Method: Returning a string representation of the object
    @Override
    public String toString() {
        return "C1{" + "a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + '}';
    } 
 
    @Override
    public void m1() {
        System.out.println("m1 of c1");
    }
 
    @Override
    public void m2() {
        System.out.println("m2 of c1");
    }
 }