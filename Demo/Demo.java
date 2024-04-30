import static javax.swing.JOptionPane.*;
class Demo{
public static void main(String[] args){
   String name = showInputDialog("Enter your name");
   int marks = Integer.parseInt(showInputDialog("Enter your marks"));
   grader(name,marks);
}

public static void grader(String name, int marks){
   if (marks >= 35) {
       showMessageDialog(null,name + " You have passed");
   }
   else {
       showMessageDialog(null,name + " You have failed");
   }
}
}