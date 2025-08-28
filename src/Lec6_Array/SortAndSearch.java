
package Lec6_Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortAndSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 integer :");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println("After sorting:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.print("Enter number to find: ");
        int target = scanner.nextInt();   
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("The number " + target + " was found at index " + index);
        } 
    }
}
