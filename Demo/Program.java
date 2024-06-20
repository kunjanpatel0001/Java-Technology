import java.io.*;

public class Program {
    public static void main(String[] args) throws Exception{
        System.out.println("JavaIO : Summation");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter number 1: ");
        String str1 = br.readLine();
        System.out.println("Enter number: 2 ");
        String str2 = br.readLine();
        int no1 = Integer.parseInt(str1);
        int no2 = Integer.parseInt(str2);

        int sum = no1 + no2;

        System.out.println("Sum = " + sum);
    }
}