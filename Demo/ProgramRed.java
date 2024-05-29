public class ProgramRed {
    public static void main(String[] args) {
        RedPiggy pg1 = new RedPiggy();
        pg1.deposit(200);
        pg1.deposit(40);
        pg1.withdraw(33);
        pg1.statement();
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
