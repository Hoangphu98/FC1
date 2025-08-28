
package Lec6_Array;

import java.util.Scanner;

public class CountOccurences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a length: ");
        int a = Integer.parseInt(scanner.nextLine());        
        int [] Array = new int[a];
        int count=0;
        for (int i=0;i<a;i++){
            Array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Number to find X = ");
        int X = Integer.parseInt(scanner.nextLine());
        for(int i=0;i<a;i++){
            if(Array[i]==X){
                count = count +1;
            }
        }
        System.out.println("The number "+X+" appears "+count+" times.");
    }
}
