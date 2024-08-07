// storing all the active servers in an array, taking input from the user and giving it to the server array

import java.io.*;
import java.net.*;
import java.util.*;

public class ConcurrentServer1 {

   public static ArrayList<PrintWriter> al = new ArrayList<>();

   public static void main(String[] args) throws Exception {
       System.out.println("Server signing On");
       ServerSocket ss = new ServerSocket(9081);
// main thread is accepting upto 10 tcp connections
       for (int i = 0; i < 10; i++) {
           Socket soc = ss.accept();
           Conversation c = new Conversation(soc);
           c.start();
       }
       System.out.println("Server signing Off");
   }
}

class Conversation extends Thread {

   Socket soc;
   public Conversation(Socket soc) {
       this.soc = soc;
   }

   @Override
   public void run() {
       System.out.println("Conversation thread  "+
                  Thread.currentThread().getName() +
                  "   signing On"
       );

       try {
           BufferedReader nis = new BufferedReader(
               new InputStreamReader(
                   soc.getInputStream()
               )
           );

           PrintWriter nos = new PrintWriter(
               new BufferedWriter(
                   new OutputStreamWriter(
                       soc.getOutputStream()
                   )
               ), true
           );

           ConcurrentServer1.al.add(nos);

           String str = nis.readLine();
           while(!str.equals("End")){
               System.out.println("Server Recieved  "+str);
               for(PrintWriter o : ConcurrentServer1.al){
                   o.println(str);
            }
               str = nis.readLine();
           }

           nos.println("End");           
       }

       catch(Exception e){
           System.out.println(
                "Client Seems to have abruptly closed the connection"
            );
       }

    System.out.println("Conversation thread  "+

              Thread.currentThread().getName() +
               "   signing Off"
     );
   }
}