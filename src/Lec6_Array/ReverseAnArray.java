package Lec6_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a length: ");
        int l = Integer.parseInt(scanner.nextLine());
        int[] Array = new int[l];
        for (int i = 0; i < l; i++) {
            Array[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < l / 2; i++) {
            int temp = Array[i];
            Array[i] = Array[l - 1 - i];
            Array[l - 1 - i] = temp;
        }
        System.out.println("Array after reversal: " + Arrays.toString(Array));
    }
}
