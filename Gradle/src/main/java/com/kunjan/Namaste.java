// ActionListener -> ConsolePrinting

package com.kunjan;
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

public class Namaste {

   public static void main(String[] args) {

       JFrame f1 = new JFrame("RPISE");
       JButton b1 = new JButton("Send");
       f1.setSize(400, 400);
       f1.setLocation(300, 300);        // location of JFrame on the Screen
       JTextArea ta = new JTextArea(10, 10);
       f1.add(ta);
       ta.setEditable(false);       // textarea cannot be editted 
       JTextField tf = new JTextField(20);
       JPanel p1 = new JPanel();
       p1.add(tf);
       p1.add(b1);
       f1.add(p1, BorderLayout.SOUTH);
       f1.setVisible(true);
       f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       L1 l1 = new L1();
       b1.addActionListener(l1);
   }

}

class L1 implements ActionListener {

   @Override            
   public void actionPerformed(ActionEvent e) {

       System.out.println("Button Clicked \n");

   }

}