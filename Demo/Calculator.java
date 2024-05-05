import javax.swing.*;

public class Calculator {
    public static void main(String[] args) {
        Float n1 = Float.parseFloat(JOptionPane.showInputDialog("Enter 1st number: "));
        Float n2 = Float.parseFloat(JOptionPane.showInputDialog("Enter 2nd number: "));
        int operation = Integer.parseInt(JOptionPane.showInputDialog(
            "1 : Addition \n" + 
            "2 : Subtraction \n" +
            "3 : Division \n" +
            "4 : Multiplication"));
        float result = 0;

        switch(operation){
            case 1: result = n1 + n2;break;
            case 2:result = n1 - n2;break;
            case 3: result = n1 / n2; break;
            case 4: result = n1 * n2; break;
        }
        JOptionPane.showMessageDialog(null, "Result = " + result);
    }
}
