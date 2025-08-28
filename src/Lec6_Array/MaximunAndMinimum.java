
package Lec6_Array;

import java.util.Scanner;

public class MaximunAndMinimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] Array = new int[n];
        
        int max, min =0;
        for (int i=0;i<n;i++){
            Array[i] = Integer.parseInt(scanner.nextLine());
        }
        max=Array[0];
        for (int i=0;i<n;i++){
            if(Array[i]>max){
                max = Array[i];
            }
        }
        min=Array[0];
        for (int i=0;i<n;i++){
            if(Array[i]<min){
                min = Array[i];
            }
        }
        System.out.println("The maximum value is: "+max);
        System.out.println("The minimum value is: "+min);
    }
}
