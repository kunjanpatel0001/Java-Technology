import java.io.*;
public class Program {
   public static void main(String[] args) throws Exception {

       System.out.println("JavaIO: forEach / Advanced for Loop");

       BufferedReader kin = new BufferedReader(
               new InputStreamReader(System.in)
       );

       System.out.println("How many strings do you want to enter ?");

       int n = Integer.parseInt(kin.readLine());

       String[] a = new String[n];

       for (int i = 0; i < a.length; i++) {
           System.out.println("a[" + i + "]=");
           a[i] = kin.readLine();
       }

       System.out.println("Printing Strings:");

       for (String s : a) {
           System.out.println(s);
       }

       String max = a[0];
       for (int k = 1; k < a.length; k++) {
           if ( max.compareTo(a[k]) < 0 ) {
               max = a[k];
           }
       }

       System.out.println("The Highest String is " + max);
   }
}