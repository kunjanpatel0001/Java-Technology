import javax.swing.*;

public class Calculator {
    public static void main(String[] args) {
        String number1 = JOptionPane.showInputDialog("Enter 1st number: ");
        String number2 = JOptionPane.showInputDialog("Enter 2nd number: ");
        String operation = JOptionPane.showInputDialog(
            "1 : Addition \n" + 
            "2 : Subtraction \n" +
            "3 : Division \n" +
            "4 : Multiplication");

        int n1 = Integer.parseInt(number1);
        int n2 = Integer.parseInt(number2);
        int op = Integer.parseInt(operation);
        int result = 0;

        switch(op){
            case 1: result = n1 + n2;break;
            case 2:result = n1 - n2;break;
            case 3: result = n1 / n2; break;
            case 4: result = n1 * n2; break;
        }
        JOptionPane.showMessageDialog(null, "Result = " + result);
    }
}
