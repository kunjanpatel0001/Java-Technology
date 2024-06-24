import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

   public static void main(String[] args) throws IOException {
       System.out.println("Client Signing ON");
       Socket soc = new Socket("127.0.0.1", 9081);
       System.out.println("Enter data to be sent to server.");
       PrintWriter pw = new PrintWriter(
               new BufferedWriter(
                  new OutputStreamWriter(
                      soc.getOutputStream()
                  )
               ),true
       );
       BufferedReader nis = new BufferedReader(
             new InputStreamReader(System.in)
       );
       String str = nis.readLine();
       while(!str.equals("End"))
       {
           pw.println(str);
           str = nis.readLine();
       }
       pw.println("End");
       System.out.println("Client Signing OFF");
   }
}