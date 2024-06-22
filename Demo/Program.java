import java.io.*;
import java.util.ArrayList;

public class Program {
   public static void main(String[] args) throws Exception {

       System.out.println("File I/O: Writing, Reading, Appending from 2 Inputs.");

       BufferedReader kin = new BufferedReader(
               new InputStreamReader(System.in)
       );

       System.out.println("Type \"End\" to stop entering data?");

       ArrayList<String> al = new ArrayList<String>();
       System.out.print("Enter String --> ");               // Input 1- Keyboard
       String str = kin.readLine();
       while (!str.equals("End")) {
           al.add(str);
           System.out.print("Enter String --> ");
           str = kin.readLine();
       }
       System.out.println("out");
       BufferedReader fis =
             new BufferedReader(
                new FileReader("input.txt")     // Input 2 - File
             );
      
       str = fis.readLine();
       while (str != null) {
           al.add(str);
           str = fis.readLine();        // Reading from File
       }
       PrintWriter pw
           = new PrintWriter(
                  new BufferedWriter(
                          new FileWriter("output.txt", true)        // Writing while appending to the file
                  ), true
             );
       System.out.println("Printing Strings:");

       for (String s : al) {
           System.out.println(s);
           pw.println(s);
       }

       String max = al.get(0);
       for (int k = 1; k < al.size(); k++) {
           if (max.compareTo(al.get(k)) < 0) {
               max = al.get(k);
           }
       }

       System.out.println("The Highest String is " + max);
       pw.println("The Highest String is " + max);
   }
}