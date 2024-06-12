public class Program {


    public static void main(String[] args) {
        System.out.println("Try Catch");
        System.out.println("Entering Main ");
        C1.m1();
        System.out.println("Leaving main");
    }
 }
 
 class C1 {
    public static void m1() {
        System.out.println("Entering  m1 ");
        C2.m2();
        System.out.println("Leaving  m1 ");
    }
 }
 
 class C2 {
    public static void m2() {
        System.out.println("Entering  m2 ");
        int a = 1;
        int b = 2;
        int c = 1;
       try {
           System.out.println("Entering try");
           a = b / c;
           System.out.println("Leaving try");
        } catch (ArithmeticException e) {
            System.out.println("Caught Arithmetic Exception");
            }
        System.out.println("Leaving  m2 ");
        }
    }