package com.kunjan;
import javax.swing.*;
import java.awt.*;

public class Namaste {
   public static void main(String[] args) {
       JFrame f1 = new JFrame("Testing FlowLayout");
       FlowLayout flow = new FlowLayout();
       f1.setLayout(flow);
       JButton b1 = new JButton("Ok");
       JTextArea ta = new JTextArea(10,10);
       JTextField tf = new JTextField(10);
       f1.add(b1,BorderLayout.SOUTH);
       f1.add(ta);
       f1.add(tf,BorderLayout.NORTH);
       f1.setSize(400,400);
       f1.setVisible(true);
       f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
  
}