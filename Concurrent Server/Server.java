// having upto 10 clients
// 2 threads: main & Conversational thread

import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("Server Signing ON");
        ServerSocket ss = new ServerSocket(9081);

// main thread is accepting the requests and in response providing a conversation thread 
        for(int i=0;i<10;i++){
            Socket soc = ss.accept();       
            Conversation c = new Conversation(soc);         // constructor injection
            c.start();
        }
        System.out.println("Server Singing OFF");
    }
}

class Conversation extends Thread {

    Socket soc;
    Conversation(Socket soc) {
        this.soc = soc;
    }

    @Override
    public void run() {
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
                                 ),true
            );

            String str = nis.readLine();
            while (!str.equals("End")) {
                System.out.println("Server Received " + str);
                nos.println(str);
                str = nis.readLine();
            }
            nos.println("End");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}