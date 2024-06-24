import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
   public static void main(String[] args) throws IOException {
       System.out.println("Client Signing ON");
       Socket soc = new Socket("127.0.0.1", 9081);
       PrintWriter pw = new PrintWriter(
               new BufferedWriter(
                     new OutputStreamWriter(
                         soc.getOutputStream()
                     )
               ),true
       );
       for (int i = 0; i < 5; i++) {
           pw.println("Hello" + i);
       }
       pw.println("End");
       System.out.println("Client Signing OFF");
   }
}