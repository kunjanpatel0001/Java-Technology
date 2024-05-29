public class Program {
    public static void main(String[] args) {
        GreenPiggy client1 = new GreenPiggy();
        RedPiggy client2 = new RedPiggy();
        GreenClient(client1);
        RedClient(client2);
    }

    static void GreenClient(GreenPiggy client) {
        client.deposit(200);
        client.deposit(40);
        client.withdraw(33);
        client.statement();
    }

    static void RedClient(RedPiggy client) {
        client.deposit(200);
        client.deposit(40);
        client.withdraw(33);
        client.statement();
    }
 }

 class GreenPiggy {
    int balance;
    int lt;

    public void deposit(int v) {
        balance = balance + v;
        lt = v;
    }

    public void withdraw(int v) {
        if (balance >= v) {
            balance = balance - v;
            lt = -v;
        }
    }

    public void statement() {
        System.out.println("Printing Statement");
        System.out.println("Balance = " + balance);
        System.out.println("Last Transaction = " + lt);
    }
 }

 class RedPiggy {
    int currentbalance;
    int previousbalance;

    public void deposit(int v) {
        previousbalance = currentbalance;
        currentbalance = currentbalance + v;
    }

    public void withdraw(int v) {
        if (currentbalance >= v) {
            previousbalance = currentbalance;
            currentbalance = currentbalance - v;
        }
    }

    public void statement() {
        System.out.println("Printing Statement");
        System.out.println("Balance = " + currentbalance);
        System.out.println("Last Transaction = " + (currentbalance - previousbalance));
    }
 }