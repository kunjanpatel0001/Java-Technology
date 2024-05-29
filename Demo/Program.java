public class Program {
    public static void main(String[] args){
        GreenPiggy client1 = new GreenPiggy();
        client1.deposit(200);
        client1.deposit(40);
        client1.withdraw(33);
        client1.statement();

    }
}
class GreenPiggy{
    int balance;
    int lt;
    public void deposit(int v){
        balance = balance + v;
        lt = v;
    }

    public void withdraw(int v){
        balance = balance - v;
        lt = -v;
    }

    public void statement(){
        System.out.println("Printing Statement");
        System.out.println("Balance = " + balance);
        System.out.println("Last Trasaction = " + lt);
    }
}