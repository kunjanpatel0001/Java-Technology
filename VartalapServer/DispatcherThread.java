import java.io.PrintWriter;

public class DispatcherThread extends Thread {

  @Override
  public void run() {
      while (true) {        // could be an infinite loop but it is a Daemon Thread 
          try {
              String str = Server.q.dequeue();
              for (PrintWriter o : Server.noslist) {
                  o.println(str);
              }
          } catch (Exception e) {
          }
      }
  }
}

