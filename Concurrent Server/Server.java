// Echo Server

import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("Server Signing ON");
        ServerSocket ss = new ServerSocket(9081);
// main thread taking care of tcp connections and responding them with Conversation thread
        for(int i=0;i<10;i++){
            Socket soc = ss.accept();
            Conversation c = new Conversation(soc);     // Constructor injection
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
                nos.println(str);       // giving back the data
                str = nis.readLine();
            }
            nos.println("End");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}