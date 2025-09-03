package Lec7_String;

import java.util.*;

public class CountWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();
        input = input.trim();
        if (!input.isEmpty()) {
            String[] words = input.split("\\s+");
            System.out.println("The number of words in the string is: " + words.length);
        }
    }
}
