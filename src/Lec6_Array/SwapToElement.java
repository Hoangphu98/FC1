package Lec6_Array;

import java.util.Scanner;

public class SwapToElement {

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a length: ");
        int n = scanner.nextInt();
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = scanner.nextInt();
        }
        System.out.print("Enter an index1: ");
        int index1 = scanner.nextInt();
        System.out.print("Enter an index2: ");
        int index2 = scanner.nextInt();
        swap(number, index1, index2);
        System.out.print("Array after the function call: ");
        for (int i = 0; i < n; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }
}
