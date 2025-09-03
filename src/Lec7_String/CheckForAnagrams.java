package Lec7_String;

import java.util.*;

public class CheckForAnagrams {

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string1: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter string2: ");
        String s2 = scanner.nextLine();

        if (areAnagrams(s1, s2)) {
            System.out.println(" The two strings are Anagrams.");
        } else {
            System.out.println("The two strings are not Anagrams.");
        }
    }
}
