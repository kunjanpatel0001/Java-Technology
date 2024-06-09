public class Program {
    public static void main(String[] args) {
        System.out.println("Enumeration");
        GreenPiggy pg1 = new GreenPiggy();      //creating an instance p1
        RedPiggy pg2 = new RedPiggy();
        Client(pg1);        // calling client method with Green Piggy instance
        Client(pg2);
    }
    static void Client(Piggy pg) {
        pg.deposit(200);
        pg.deposit(40);
        pg.withdraw(33);
        pg.statement();
        pg.transaction(Piggy.PiggyOps.Deposit, 44);
        pg.transaction(Piggy.PiggyOps.Withdraw, 22);
        pg.statement();
    }
 }
 
 interface Piggy {
    enum PiggyOps {
        Deposit, Withdraw
    };
    void deposit(int v);
    void withdraw(int v);
    void statement();
    default void transaction(PiggyOps op, int v) {
        switch (op) {
            case Deposit:
                deposit(v);
                break;
            case Withdraw :
                withdraw(v);
                break;
            default:
                System.out.println("Incorrect Operation in Transaction");
        }
    }
 }
 
 class GreenPiggy implements Piggy {
    int balance;
    int lt;
    @Override
    public void deposit(int v) {
        balance = balance + v;
        lt = v;
    }
    @Override
    public void withdraw(int v) {
        if (balance >= v) {
            balance = balance - v;
            lt = -v;
        }
    }
    @Override
    public void statement() {
        System.out.println("Printing Statement");
        System.out.println("Balance = " + balance);
        System.out.println("Last Transaction = " + lt);
    }
 }
 
 class RedPiggy implements Piggy {
    int currentbalance;
    int previousbalance;
    @Override
    public void deposit(int v) {
        previousbalance = currentbalance;
        currentbalance = currentbalance + v;
    }
    @Override
    public void withdraw(int v) {
        if (currentbalance >= v) {
            previousbalance = currentbalance;
            currentbalance = currentbalance - v;
        }
    }
    @Override
    public void statement() {
        System.out.println("Printing Statement");
        System.out.println("Balance = " + currentbalance);
        System.out.println("Last Transaction = " + (currentbalance - previousbalance));
    }
 }