import java.net.*;
import java.io.*;

public class Server{
  public static void main(String[] args) throws Exception{
        System.out.println("Server Signing ON");
        ServerSocket ss  = new ServerSocket(9081);
        Socket soc = ss.accept(); 

        // Network Output Stream

        PrintWriter nos = new PrintWriter(
                                new BufferedWriter(
                                    new OutputStreamWriter(
                                            soc.getOutputStream()
                                    )
                                )
        ,true);

        // Network Input Stream

        BufferedReader nis = new BufferedReader(
                                new InputStreamReader(
                                    soc.getInputStream()
                                )
        );


        String str = nis.readLine();
        while(!str.equals("End")){
            System.out.println("Server received "+ str);
            nos.println(str);
            str = nis.readLine();
        }
        nos.println("End");
        System.out.println("Server Signing OFF");  
    }
    }