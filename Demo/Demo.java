class Demo {
    public static void main(String[] args){
        System.out.println("If-Else & String Concatenation");
        grader("Rahul",40);
        grader("Prameet",20);
     }
 
     public static void grader(String name, int marks){
        if (marks >= 35) {
            System.out.println(name + " You have passed");      //String Concatenation
        }
        else {
            System.out.println(name + " You have failed");
        }
     }
}