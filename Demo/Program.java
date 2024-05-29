public class Program {
    public static void main(String[] args) {
    System.out.println("Polymorphism, Inheritance, Abstract, Interface, implements, Liskov's principle");
    GreenPiggy pg1 = new GreenPiggy();
    RedPiggy pg2 = new RedPiggy();
    Client(pg1);
    Client(pg2);
}

static void Client(Piggy pg) {
    pg.deposit(200);
    pg.deposit(40);
    pg.withdraw(33);
    pg.statement();
}  
}

interface Piggy {
void deposit(int v);
void withdraw(int v);
void statement();
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

