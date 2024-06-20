import java.io.*;

public class Program {
    public static void main(String[] args) throws Exception{
        System.out.println("Welcome to JavaIO");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter your name: ");
        String str = br.readLine();
        System.out.println("Welcome to " + str);
    }
}