

import java.io.*;

public class Program {
    public static void main(String[] args) throws Exception{
        System.out.println("JavaIO : Highest Number in Array");

        final int SIZE = 5;         // final variables are in capitals
        BufferedReader kin = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int[] arr = new int[SIZE];      //declaring an array
        for (int i = 0; i < SIZE; i++) {
            System.err.println("arr[" + i + "] = ");
            arr[i] = Integer.parseInt(kin.readLine());
        }
        System.out.println("Printing Numbers: ");

        for(int j = 0; j < SIZE; j++){
            System.out.println("arr["+j+"]="+arr[j]);
        }
        int max = arr[0];
        for(int k = 1; k < SIZE; k++){
            if (max < arr[k]) max = arr[k];
        }

        System.out.println("The highest number is: " + max);
    }
}