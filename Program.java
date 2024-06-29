// Lambda function

public class Program {
    public static void main(String[] args) {
        System.out.println("Welcome to threading");
        
        // Passing it as a parameter

        (new Thread(
                () -> {
                    Thread t = Thread.currentThread();
                    for (int i = 0; i < 5; i++) {
                        System.out.println(
                                t.getName() +
                                " says " + " hello "
                                + i
                        );
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                    }
        })).start();
       
        // As an anonymous class extending Thread
  
        (new Thread() {
            @Override
            public void run() {
                Thread t = Thread.currentThread();
                for (int i = 0; i < 5; i++) {
                    System.out.println(
                            t.getName() +
                            " says " + " hello "
                            + i
                    );
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
  
                }
            }
        }).start();
       
        Thread t = Thread.currentThread();
        for (int i = 0; i < 5; i++) {
            System.out.println(
                    t.getName() +
                    " says hello "
                    + i
            );
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
  
            }
        }
    }
  }