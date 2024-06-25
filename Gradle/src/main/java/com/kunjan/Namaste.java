// ActionListener -> GUIClient

package com.kunjan;
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

public class Namaste {

    // these 2 variables are removed from the main - since local variables of one method are not visible to another method 
    // why static - by default they would have been instance variable and to use them the class should have their objects created, hence to avoid that 
   static JTextField tf;
   static JTextArea ta;

   public static void main(String[] args) {
      
       JFrame f1 = new JFrame("RPISE");
       JButton b1 = new JButton("Send");
       f1.setSize(400, 400);
       f1.setLocation(300, 300);
       ta = new JTextArea(10, 10);
       f1.add(ta);
       ta.setEditable(false);
       tf = new JTextField(20);
       JPanel p1 = new JPanel();
       p1.add(tf);
       p1.add(b1);
       f1.add(p1, BorderLayout.SOUTH);
       f1.setVisible(true);
       f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
       L1 l1 = new L1();
       b1.addActionListener(l1);     // 1 listener can be attached to 2 sources
       tf.addActionListener(l1);    // since there is a listener, when clicked Enter, the message could be sent 
   }
  
}

class L1 implements ActionListener {
  
   @Override
   public void actionPerformed(ActionEvent e) {
      
       String str = Namaste.tf.getText();
       Namaste.ta.append(str + "\n");
       Namaste.tf.setText("");
   }
  
}