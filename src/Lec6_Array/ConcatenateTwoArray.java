package Lec6_Array;

import java.util.Scanner;

public class ConcatenateTwoArray {

    public static int[] merge(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        for (int i = 0; i < a1.length; i++) {
            result[i] = a1[i];
        }
        for (int i = 0; i < a2.length; i++) {
            result[a1.length + i] = a2[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a length array1: ");
        int n1 = scanner.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = scanner.nextInt();
        }
        System.out.print("Enter a length array2: ");
        int n2 = scanner.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = scanner.nextInt();
        }
        int[] merged = merge(a1, a2);
        System.out.print("New array: ");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
        System.out.println();
    }
}
