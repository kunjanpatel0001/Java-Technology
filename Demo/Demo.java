import javax.swing.*;

public class Demo {
   public static void main(String[] args) {
      String number1 = JOptionPane.showInputDialog(
        "Enter Number1"
       );
       String number2 = JOptionPane.showInputDialog(
        "Enter Number2"
       );
       int num1 = Integer.parseInt(number1);
       int num2 = Integer.parseInt(number2);
       int sum = num1 + num2;
       JOptionPane.showMessageDialog(
       null,
        "Sum = " + sum
       );
   } 
}