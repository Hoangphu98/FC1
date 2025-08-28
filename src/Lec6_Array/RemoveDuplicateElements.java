package Lec6_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicateElements {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a length: ");
        int n = scanner.nextInt();
        System.out.println("Enter a value:");
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            numbers.add(a);
        }
        ArrayList<Integer> uniqueNumbers = removeDuplicates(numbers);
        System.out.println(uniqueNumbers);
    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer num : list) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }
}
