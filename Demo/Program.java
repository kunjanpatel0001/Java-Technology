import java.util.ArrayList;

import java.util.Collections;


public class Program {


   public static void main(String[] args) {

        System.out.println("ArrayList - adding, indexOf, get")

       System.out.println("Array List is one of the collections api .. provided by java");

       ArrayList<Object> al = new ArrayList<>();

       

       System.out.println("adding element to array list");

       al.add("This a String");

       al.add(10);

       al.add(23.6);

       al.add('d');

               

       System.out.println("\nprinting the arrayList .. ");

       System.out.println(al);

       System.out.println("\nobtaining the contents from the arraylist at a particular index..");

       String s = (String) al.get(0); //typecasting the content obtained from the array list.

       System.out.println("s=" + s);

       int indexno = al.indexOf(23.6);

       System.out.println("\nthe number 23.6 is located at index no " + indexno);
   }
}

