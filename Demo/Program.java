public class Program {
    public static void main(String[] args) {
        System.out.println("Exception Handling - finally"); 
        System.out.println("Entering Main ");
        C1.m1();
        System.out.println("Leaving main");
    }
 }
 
class C1 {
    public static void m1() {
        System.out.println("Entering  m1 ");
        try {
            System.out.println("Entering try of m1");
            C2.m2();
            System.out.println("Leaving try of m1");
        } catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println("ArrayIndexOutOfBoundsException caught");
        } finally {
            System.out.println("finally of m1");
        }
        System.out.println("Leaving  m1 ");
    }
 }
 
 class C2 {  
    static boolean flag1 = false;
    static boolean flag2 = true;

    public static void m2() {
        System.out.println("Entering  m2 ");
        try {
            System.out.println("Entering try of m2");
            if (flag1) {
                int a = 1, b = 2, c = 0;
                a = b / c;
            }
            System.out.println("Median of m2");
            if (flag2) {
                int[] b = new int[10];
                b[19] = 22;
            }
            System.out.println("Leaving try of m2");
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught");
        } finally {
            System.out.println("finally of m2");
        }
        System.out.println("Leaving  m2 ");
    }
 
 }