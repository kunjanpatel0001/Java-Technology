import static javax.swing.JOptionPane.*;

class Demo{
public static void main(String[] args){
    System.out.println("User Defined Iterations");
    int i = Integer.parseInt(showInputDialog("Enter a number for i: "));
    do{
    System.out.println("Working" + i);
    i--;
 }while(i > 0);
}
}